package com.company.interfaces;

import java.time.LocalDateTime;

import com.company.domains.User;

public interface RentalRepository {
    void createRental(User user, LocalDateTime from, LocalDateTime to);
}
