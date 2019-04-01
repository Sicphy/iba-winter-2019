package com.iba.courses.service;

public class ImsParameters {

    private String hostname;
    private String datastore;
    private String exitIdentifier;
    private Integer port;
    private String userId;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getDatastore() {
        return datastore;
    }

    public void setDatastore(String datastore) {
        this.datastore = datastore;
    }

    public String getExitIdentifier() {
        return exitIdentifier;
    }

    public void setExitIdentifier(String exitIdentifier) {
        this.exitIdentifier = exitIdentifier;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ImsParameters() {

    }
}
