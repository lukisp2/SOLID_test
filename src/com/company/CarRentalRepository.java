package com.company;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {
    public void createRental(User user, LocalDateTime from, LocalDateTime to) {

        System.out.println(user.getName() + "111");

    }

}
