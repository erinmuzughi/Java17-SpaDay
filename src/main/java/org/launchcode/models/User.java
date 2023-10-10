package org.launchcode.models;

import jakarta.validation.constraints.*;

public class User {

    @NotBlank(message = "Username is required.")
    @Size(min = 5, max = 15, message = "Username must be between 5 and 15 characters.")
    String username;
    @Email(message = "Email must be a valid email address.") //this doesn't work properly to validate
    String email;
    @NotBlank(message = "Password is required.")
    @Size(min = 6, message = "Password must be at least 6 characters long.")
    private String password;

    @NotNull(message = "Passwords do not match.")
    @Size(min = 6, message = "Verify Password must be at least 6 characters long.")
    private String verify;

    public User() {

    }

    public User(String username, String email, String password, String verify) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify = verify;
    }

    // Add a new method, private void checkPassword, that compares password and verifyPassword.
    // If neither is null and they don’t match, then set verifyPassword = null.

    private void checkPassword() {
        if(password!=null && verify!=null && !password.equals(verify)){
            verify = null;
        }
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkPassword();
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
        checkPassword();
    }
}

