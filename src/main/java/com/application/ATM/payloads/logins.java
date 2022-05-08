package com.application.ATM.payloads;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import java.util.Date;

public class logins
{
    @Size(min = 2, max = 90, message = "user name should be between 2 and 90 in length")
    @NotBlank(message = "User name cant be empty")
    private String Username;
    @Size(min = 2, max = 90, message = "First name should be between 2 and 90 in length")
    @NotBlank(message = "password not be empty")
    private String Password;
    private Date   lastLogin;


    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
}

