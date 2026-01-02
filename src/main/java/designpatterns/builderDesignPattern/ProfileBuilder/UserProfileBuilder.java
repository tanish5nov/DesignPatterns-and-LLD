package designpatterns.builderDesignPattern.ProfileBuilder;

import designpatterns.builderDesignPattern.UserAttributes.*;
import designpatterns.builderDesignPattern.User.UserProfile;
import designpatterns.builderDesignPattern.mandates.MandatoryFieldsValidator;

import java.util.ArrayList;


public class UserProfileBuilder {
    private UserAttributes userNameAttribute = new UserNameAttribute();
    private UserAttributes emailAttribute = new EmailAttribute();
    private UserAttributes ageAttribute = new AgeAttribute();
    private UserAttributes phoneAttribute = new PhoneAttribute();
    private UserAttributes addressAttribute = new AddressAttribute();
    private UserAttributes isVerifiedAttribute = new IsVerifiedAttribute();

    public UserProfileBuilder setAge(Integer age){
        ageAttribute.setAttributeValue(age);
        return this;
    }

    public UserProfileBuilder setIsVerified(Boolean isVerified){
        isVerifiedAttribute.setAttributeValue(isVerified);
        return this;
    }

    public UserProfileBuilder setPhone(String phone){
        phoneAttribute.setAttributeValue(phone);
        return this;
    }

    public UserProfileBuilder setAddress(String address){
        addressAttribute.setAttributeValue(address);
        return this;
    }

    public UserProfileBuilder setUserName(String userName){
        userNameAttribute.setAttributeValue(userName);
        return this;
    }

    public UserProfileBuilder setUserEmail(String userEmail){
        emailAttribute.setAttributeValue(userEmail);
        return this;
    }

    public UserProfile build(){
        ArrayList<UserAttributes> mandatoryFields = new ArrayList<>();
        mandatoryFields.add(userNameAttribute);
        mandatoryFields.add(emailAttribute);

        Boolean mandatoryFieldsAreCorrect = MandatoryFieldsValidator.validate(mandatoryFields);

        if(!mandatoryFieldsAreCorrect){
            return new UserProfile();
        }

        UserProfile userProfile = new UserProfile();

        userProfile.setAddressAttribute(addressAttribute);
        userProfile.setPhoneAttribute(phoneAttribute);
        userProfile.setIsVerifiedAttribute(isVerifiedAttribute);
        userProfile.setAgeAttribute(ageAttribute);
        userProfile.setUserNameAttribute(userNameAttribute);
        userProfile.setEmailAttribute(emailAttribute);

        return userProfile;
    }
}
