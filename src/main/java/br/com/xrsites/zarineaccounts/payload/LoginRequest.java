package br.com.xrsites.zarineaccounts.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class LoginRequest {
    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;

    // Getters and Setters (Omitted for brevity)    
}
