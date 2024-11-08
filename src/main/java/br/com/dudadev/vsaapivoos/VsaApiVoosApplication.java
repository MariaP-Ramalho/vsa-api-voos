package br.com.dudadev.vsaapivoos;

import br.com.dudadev.vsaapivoos.main.Main;
import br.com.dudadev.vsaapivoos.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class VsaApiVoosApplication implements CommandLineRunner {

	@Autowired
	private FlightRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(VsaApiVoosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(repository);
		main.runMain();
	}
}
