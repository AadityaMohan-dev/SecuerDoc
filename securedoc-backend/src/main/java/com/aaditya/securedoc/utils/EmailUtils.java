package com.aaditya.securedoc.utils;

public class EmailUtils {
    public static String  getEmailMessage(String name, String host, String token){
        return "Hello " + name +",\n\nYour account has been created. Please click on the link below to verify your account.\n" + getVerificationUrl(host, token) + "\n\n The Support Team";
    }

    public static String getVerificationUrl(String host, String token){
        return host + "/verify/account?token="+token;
    }

    public static String  getResetPasswordMessage(String name, String host, String token){
        return "Hello " + name +",\n\nPlease click on the link below to reset your account password.\n" + getRestPasswordUrl(host, token) + "\n\n The Support Team";
    }
    public static String getRestPasswordUrl(String host, String token){
        return host + "/verify/password?token="+token;
    }

}
