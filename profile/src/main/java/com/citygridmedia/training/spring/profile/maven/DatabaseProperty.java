package com.citygridmedia.training.spring.profile.maven;

import com.google.common.base.Objects;

public class DatabaseProperty
{
    private String driver;
    private String url;
    private String username;
    private String password;
    
    public DatabaseProperty(final String driver, final String url, final String username, final String password) {
        this.driver = driver;
        this.url = url;
        this.username = username;
        this.password = password;
    }
    
    public String toString() {
        return Objects.toStringHelper(this).add("Database Driver", driver).add("Database URL", url).add("Username", username)
            .add("Password", password).toString();
    }
}
