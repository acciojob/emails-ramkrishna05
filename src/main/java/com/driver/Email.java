package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(password.equals(oldPassword))
        {
            if(newPassword.length()>=8 && check(newPassword))
            {
                password=newPassword;
            }
        }
    }
    public boolean check(String str)
    {
        boolean capital=false;
        boolean small=false;
        boolean number=false;
        boolean special=false;

        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                capital=true;
            } else if (Character.isLowerCase(str.charAt(i)))
            {

                small=true;
            }
            else if(Character.isDigit(str.charAt(i)))
            {
                number=true;
            }
            else if(Character.isLetterOrDigit(str.charAt(i)))
            {
                special=true;

            }

        }
        if(capital && small && number && special)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
