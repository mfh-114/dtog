package org.mfh144.dtog;

import java.sql.Connection;

import org.mfh144.dtog.db.DBConnection;
import org.mfh144.dtog.db.JdbcConnectionFactory;
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
	
	private JdbcConnectionFactory jdbcConnectionFactory;

	@Autowired
	public void setJdbcConnectionFactory(JdbcConnectionFactory jdbcConnectionFactory) {
		this.jdbcConnectionFactory = jdbcConnectionFactory;
	}

	public static void main(String[] args) {

		System.setProperty("app.home", "dtog");
		
		System.out.println("home: "+System.getProperty("app.home"));
		

		SpringApplication application = new SpringApplication(DtogApp.class);
		application.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		try (Connection con = jdbcConnectionFactory.create()) {

			System.out.println(con.toString());
			con.setAutoCommit(true);
			con.setReadOnly(true);
			DBConnection dbConnection = new DBConnection(con);

		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
