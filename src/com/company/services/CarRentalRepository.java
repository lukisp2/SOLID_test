package com.company.services;

import java.time.LocalDateTime;

import com.company.domains.User;
import com.company.interfaces.RentalRepository;

public class CarRentalRepository implements RentalRepository {

    @Override public void createRental(User user, LocalDateTime from, LocalDateTime to) {

    }
}
