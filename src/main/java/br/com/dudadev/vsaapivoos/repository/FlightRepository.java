package br.com.dudadev.vsaapivoos.repository;

import br.com.dudadev.vsaapivoos.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}
