package designpatterns.builderDesignPattern.ProfileBuilder;

import designpatterns.builderDesignPattern.User.UserProfile;

public class BuilderDesignPattern {


    public static void start(){
        UserProfile userProfile = new UserProfileBuilder()
                .setUserName("helloworld")
                .setUserEmail("hello@gmail.com")
                .setAddress("helloWorld")
                .setPhone("123456")
                .setAge(23)
                .setIsVerified(false)
                .build();
        System.out.println(userProfile.getEmailAttribute().getAttributeValue());
        System.out.println(userProfile.getUserNameAttribute().getAttributeValue());
        System.out.println(userProfile.getPhoneAttribute().getAttributeValue());
        System.out.println(userProfile.getAddressAttribute().getAttributeValue());
        System.out.println(userProfile.getIsVerifiedAttribute().getAttributeValue());
        System.out.println(userProfile.getAgeAttribute().getAttributeValue());
    }
}
