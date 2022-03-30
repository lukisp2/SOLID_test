package com.company;

public class MailService implements InformationService {
    public void inform(User user) {

        System.out.println("Mail to" + user.getName());

    }
}
