package com.restaurant.restaurant.service;

import com.restaurant.restaurant.model.Reservation;
import com.restaurant.restaurant.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    public ReservationRepository reservationRepository;

    @Override
    public Long createReservation(Reservation reservation) {
        Reservation newReservation = reservationRepository.save(reservation);
        return newReservation.getId();
    }

    @Override
    public Collection<Reservation> getReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public void updateReservation(Long id, Reservation reservation) {
        Reservation reservations = reservationRepository.getById(id);
        reservations.setComment(reservation.getComment());
        reservations.setNumberOfPerson(reservation.getNumberOfPerson());
        reservations.setDate(reservation.getDate());
        reservations.setEmail(reservation.getEmail());
        reservations.setName(reservation.getName());
        reservations.setTime(reservation.getTime());
        reservations.setPhoneNumber(reservation.getPhoneNumber());
    }
}
