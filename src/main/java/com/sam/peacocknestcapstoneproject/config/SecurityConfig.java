package com.sam.peacocknestcapstoneproject.config;

import com.sam.peacocknestcapstoneproject.security.ParentUserDetailsService;
import com.sam.peacocknestcapstoneproject.security.ChildUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private ParentUserDetailsService parentUserDetailsService;

    @Autowired
    private ChildUserDetailsService childUserDetailsService;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(parentUserDetailsService).passwordEncoder(passwordEncoder());
        auth.userDetailsService(childUserDetailsService).passwordEncoder(passwordEncoder());
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{


            http
                    .authorizeHttpRequests(authorize -> authorize
                    .requestMatchers("/parent/**").hasRole("PARENT")
                    .requestMatchers("/child/**").hasRole("CHILD")
                    .anyRequest().authenticated()
                    ).formLogin(
                            form->form.loginPage("/login").defaultSuccessUrl("/api/parents/").permitAll());

        return http.build();
        }
    }

