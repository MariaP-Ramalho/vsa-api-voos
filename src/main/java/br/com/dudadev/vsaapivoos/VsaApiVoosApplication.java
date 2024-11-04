package br.com.dudadev.vsaapivoos;

import br.com.dudadev.vsaapivoos.main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VsaApiVoosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(VsaApiVoosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main();
		main.displayMain();
	}
}
