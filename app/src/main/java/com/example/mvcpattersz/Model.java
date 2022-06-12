package com.example.mvcpattersz;

public class Model  {
    String Name;
    String Password;
    String MailId;

    public Model(String name, String password, String mailId) {
        Name = name;
        Password = password;
        MailId = mailId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getMailId() {
        return MailId;
    }

    public void setMailId(String mailId) {
        MailId = mailId;
    }


}
