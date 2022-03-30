package com.company.services;

import java.time.LocalDateTime;

import com.company.domains.User;
import com.company.interfaces.RentalService;

public class CarRentalService implements RentalService {

    public boolean rent(final User user, final LocalDateTime carRentFrom, final LocalDateTime carRentTo) {
        System.out.println("Renting Car for: " + user.getName() + user.getSurname()
                + " from: " + carRentFrom.toString() + " to: " + carRentTo.toString());

        return true;
    }

}