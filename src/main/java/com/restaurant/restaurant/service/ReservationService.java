package com.restaurant.restaurant.service;

import com.restaurant.restaurant.model.Reservation;


import java.util.Collection;

public interface ReservationService {

    public abstract Long createReservation(Reservation reservation);
    public abstract Collection getReservation();
    public abstract void updateReservation(Long id, Reservation reservation);


}
