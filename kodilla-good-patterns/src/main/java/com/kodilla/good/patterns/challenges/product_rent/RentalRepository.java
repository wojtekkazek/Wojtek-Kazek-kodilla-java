package com.kodilla.good.patterns.challenges.product_rent;

import java.time.LocalDateTime;

public interface RentalRepository {

    void createRental (User user, LocalDateTime from, LocalDateTime to);

}
