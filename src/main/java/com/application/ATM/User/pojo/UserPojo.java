package com.application.ATM.User.pojo;

import com.application.ATM.models.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserPojo {
        @JsonProperty("success")
        private boolean success;
        @JsonProperty("info")
        private List<User> workerList;
        @JsonProperty("message")
        private String message;

    public UserPojo(boolean success, List<User> workerList, String message) {
        this.success = success;
        this.workerList = workerList;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<User> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<User> workerList) {
        this.workerList = workerList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
