package org.mfh144.dtog;

import java.io.File;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Properties;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.mfh144.dtog.config.DtogConfig;
import org.mfh144.dtog.config.JdbcConfig;
import org.mfh144.dtog.db.JdbcConnectionFactory;
import org.mfh144.dtog.db.JdbcDriverProxy;
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
	
	@Autowired
	private JdbcConfig jdbcConfig;

	@Autowired
	private JdbcConnectionFactory jdbcConnectionFactory;

	public static void main(String[] args) {

		System.setProperty("app.home", "dtog");

		System.out.println("Config: " + new File("config/jdbc.yaml").getAbsolutePath());

		SpringApplication application = new SpringApplication(DtogApp.class);
		application.run(args);
	}

	@Override
	public void run(String... args) throws Exception {

		try(Connection con = jdbcConnectionFactory.create()){
			
			System.out.println(con.toString());
			
		}catch(Exception e) {
			e.printStackTrace();
		} 
	    
	}

}
