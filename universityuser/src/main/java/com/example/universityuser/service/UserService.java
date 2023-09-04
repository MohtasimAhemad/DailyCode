package com.example.universityuser.service;

import com.example.universityuser.model.UniversityUser;
import com.example.universityuser.repository.UniversityUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UniversityUserRepository universityUserRepository;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UniversityUser userProfile =universityUserRepository.findByUserName(userName);
        if(null == userProfile)
        {
            throw new UsernameNotFoundException("user not found");
        }
        List<SimpleGrantedAuthority> authorityList = Arrays.asList(new SimpleGrantedAuthority(userProfile.getRole()));
        System.out.println(userProfile.getUserName());
        System.out.println(userProfile.getRole());
        return new User(userProfile.getUserName(), userProfile.getPassword(),authorityList);
    }
}
