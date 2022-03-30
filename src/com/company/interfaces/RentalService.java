package com.company.interfaces;

import java.time.LocalDateTime;

import com.company.domains.User;

public interface RentalService {
    boolean rent(User user, LocalDateTime from, LocalDateTime to);
}
