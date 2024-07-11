package com.sam.peacocknestcapstoneproject.security;

import com.sam.peacocknestcapstoneproject.entity.Child;
import com.sam.peacocknestcapstoneproject.repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildUserDetailsService implements UserDetailsService {

    @Autowired
    private ChildRepository childRepository; // Inject your ChildRepository

    @Override
    public UserDetails loadUserByUsername(String parentUsername) throws UsernameNotFoundException {
        // Load children based on parent's username
        List<Child> children = childRepository.findByParentUsername(parentUsername);

        if (children.isEmpty()) {
            throw new UsernameNotFoundException("No children found for parent with username: " + parentUsername);
        }

        // For simplicity, assuming the first child found is used
        Child child = children.get(0);

        // Construct UserDetails object using child's details
        return org.springframework.security.core.userdetails.User.builder()
                .username(child.getName()) // Assuming child.getUsername() returns child's username
                 // Assuming child.getPassword() returns child's password (hashed)
                .roles("USER") // Assuming a child has USER role
                .build();
    }
}
