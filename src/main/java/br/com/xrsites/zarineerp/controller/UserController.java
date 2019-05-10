package br.com.xrsites.zarineerp.controller;

import br.com.xrsites.zarineerp.exception.ResourceNotFoundException;
import br.com.xrsites.zarineerp.model.User;
import br.com.xrsites.zarineerp.repository.UserRepository;
import br.com.xrsites.zarineerp.security.CurrentUser;
import br.com.xrsites.zarineerp.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
