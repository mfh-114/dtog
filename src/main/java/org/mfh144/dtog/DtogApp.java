package org.mfh144.dtog;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class of the DTOG application.
 *
 */
@SpringBootApplication
public class DtogApp implements CommandLineRunner {

	public static void main(String[] args) {

		System.setProperty("app.home", "dtog");

		System.out.println("home: " + System.getProperty("app.home"));

		SpringApplication application = new SpringApplication(DtogApp.class);
		application.run(args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
