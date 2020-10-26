package com.thoughtworks.capability.gtb.demospringconfig;


public class Credentials {
    private String authMethod;
    private String username;
    private String password;

    public String getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(String authMethod) {
        this.authMethod = authMethod;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "{username=" + username + ", password=" + password + ", authMethod=" + authMethod + "}";
    }
}
