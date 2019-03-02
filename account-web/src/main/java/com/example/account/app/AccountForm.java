package com.example.account.app;

import java.io.Serializable;

public class AccountForm implements Serializable {
    private static final long serialVersionUID = 1L;

    private AccountForm accountForm;
    
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
    
    /**
     * <p>
     * 会員情報フォームを取得します。
     * </p>
     * @return 会員情報フォーム
     */

    public AccountForm getAccountForm() {
        return accountForm;
    }

    /**
     * <p>
     * 会員情報フォームを設定します。
     * </p>
     * @param memberForm 会員情報フォーム
     */
    public void setAccountForm(AccountForm accountForm) {
        this.accountForm = accountForm;
    }
    
}
