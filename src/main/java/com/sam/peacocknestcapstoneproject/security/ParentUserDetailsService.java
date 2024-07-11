package com.sam.peacocknestcapstoneproject.security;

import com.sam.peacocknestcapstoneproject.entity.Parent;
import com.sam.peacocknestcapstoneproject.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ParentUserDetailsService implements UserDetailsService {

    @Autowired
    private ParentRepository parentRepository; // Inject your ParentRepository

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Parent parent = parentRepository.findByEmail(email); // Implement this method in ParentRepository

        if (parent == null) {
            throw new UsernameNotFoundException("Parent not found with that name: ");
        }

        // Return a UserDetails object
        return org.springframework.security.core.userdetails.User.builder()
                .username(parent.getName())
                .password(parent.getEmail())
                .roles("USER") // Assuming a parent has USER role
                .build();
    }
}
