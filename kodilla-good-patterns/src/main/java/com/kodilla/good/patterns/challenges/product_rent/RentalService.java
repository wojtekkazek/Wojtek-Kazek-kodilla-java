package com.kodilla.good.patterns.challenges.product_rent;

import java.time.LocalDateTime;

public interface RentalService {

    boolean rent(User user, LocalDateTime carRentFrom, LocalDateTime to);

}
