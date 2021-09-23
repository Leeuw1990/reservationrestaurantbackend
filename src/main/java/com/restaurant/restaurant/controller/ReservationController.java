package com.restaurant.restaurant.controller;

import com.restaurant.restaurant.model.Reservation;
import com.restaurant.restaurant.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("api/reservation")
public class ReservationController {

    private ReservationService reservationService;

    @Autowired
    public void setReservationService(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/send")
    public ResponseEntity<Object>createReservation(@RequestBody Reservation reservation) {
        Long newId = reservationService.createReservation(reservation);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
                .buildAndExpand(newId).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/get")
    public ResponseEntity<Object>getReservation() {
        return ResponseEntity.ok().body(reservationService.getReservation());
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<Object>updateReservation(@PathVariable("id") Long id, @RequestBody Reservation reservation) {
        reservationService.updateReservation(id, reservation);
        return ResponseEntity.status(HttpStatus.OK).body(("Updated"));
    }

}
