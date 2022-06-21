package com.shubham.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shubham.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
