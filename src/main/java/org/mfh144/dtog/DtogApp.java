package org.mfh144.dtog;

import org.mfh144.dtog.config.DtogConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class of the DTOG application.
 *
 */
@SpringBootApplication
public class DtogApp implements CommandLineRunner {

	@Autowired
	private DtogConfig dtogConfig;

	public static void main(String[] args) {

		SpringApplication application = new SpringApplication(DtogApp.class);
		application.run(args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("DtogConfig: " + dtogConfig.toString());

	}

}
