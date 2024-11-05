package br.com.dudadev.vsaapivoos.repository;

import br.com.dudadev.vsaapivoos.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
