package com.example.account.domain.repository;


import java.io.Serializable;

import java.io.Serializable;

public class SearchCondition implements Serializable {
    private static final long serialVersionUID = 1L;

    
//    @NotEmpty
//    @Min(1)
//    @Max(10)
    private String userId;
    private String userName;
    private String birthDay;
    private String address;
    private String phoneNumber;
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
        
    public String getUserName() {
        return userName;
    }    
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getBirthDay() {
        return birthDay;
    }    

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
    
    public String getAddress() {
        return address;
    }    

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }    

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }  
    
  
}
