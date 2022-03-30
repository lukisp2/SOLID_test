package com.company.services;

import com.company.domains.User;
import com.company.interfaces.InformationService;

public class MailService implements InformationService {

    @Override public void inform(User user) {
        System.out.println("todo-inform");
    }
}
