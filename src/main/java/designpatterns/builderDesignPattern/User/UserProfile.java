package designpatterns.builderDesignPattern.User;

import designpatterns.builderDesignPattern.UserAttributes.*;

public class UserProfile {
    private UserAttributes userNameAttribute = new UserNameAttribute();
    private UserAttributes emailAttribute = new EmailAttribute();
    private UserAttributes ageAttribute = new AgeAttribute();
    private UserAttributes phoneAttribute = new PhoneAttribute();
    private UserAttributes addressAttribute = new AddressAttribute();
    private UserAttributes isVerifiedAttribute = new IsVerifiedAttribute();

    public void setAddressAttribute(UserAttributes addressAttribute) {
        this.addressAttribute = addressAttribute;
    }

    public void setUserNameAttribute(UserAttributes userNameAttribute) {
        this.userNameAttribute = userNameAttribute;
    }

    public void setEmailAttribute(UserAttributes emailAttribute) {
        this.emailAttribute = emailAttribute;
    }

    public void setAgeAttribute(UserAttributes ageAttribute) {
        this.ageAttribute = ageAttribute;
    }

    public void setPhoneAttribute(UserAttributes phoneAttribute) {
        this.phoneAttribute = phoneAttribute;
    }

    public void setIsVerifiedAttribute(UserAttributes isVerifiedAttribute) {
        this.isVerifiedAttribute = isVerifiedAttribute;
    }

    public UserAttributes getUserNameAttribute() {
        return this.userNameAttribute;
    }

    public UserAttributes getEmailAttribute() {
        return this.emailAttribute;
    }

    public UserAttributes getAgeAttribute() {
        return this.ageAttribute;
    }

    public UserAttributes getPhoneAttribute() {
        return this.phoneAttribute;
    }

    public UserAttributes getAddressAttribute() {
        return this.addressAttribute;
    }

    public UserAttributes getIsVerifiedAttribute() {
        return this.isVerifiedAttribute;
    }
}
