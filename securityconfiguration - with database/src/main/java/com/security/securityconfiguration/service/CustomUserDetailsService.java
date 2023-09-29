package com.security.securityconfiguration.service;


import com.security.securityconfiguration.entity.User;
import com.security.securityconfiguration.repository.UserRepository;
import com.security.securityconfiguration.user.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Retrieve user details from your database
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

        // Create a UserDetails object based on the retrieved data
//        UserDetails userDetails = org.springframework.security.core.userdetails.User.withUsername(user.getUsername())
//                .password(user.getPassword())
//                .roles(user.getRoles().stream().map(role -> role.getName()).toArray(String[]::new))
//                .build();

        return new CustomUserDetails(user);
    }

}

