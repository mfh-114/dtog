package org.mfh144.dtog.db;

import java.io.File;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.mfh144.dtog.config.JdbcConfig;
import org.mfh144.dtog.loader.JarFileLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JdbcConnectionFactory {

	private static final Logger logger = LoggerFactory.getLogger(JdbcConnectionFactory.class);

	private JarFileLoader<Driver> jarFileLoader;

	private JdbcConfig jdbcConfig;

	public JdbcConnectionFactory() {

	}

	@Autowired
	public void setJarFileLoader(JarFileLoader<Driver> jarFileLoader) {
		this.jarFileLoader = jarFileLoader;
	}

	@Autowired
	public void setJdbcConfig(JdbcConfig jdbcConfig) {
		this.jdbcConfig = jdbcConfig;
	}

	public Connection create() throws Exception {

		String url = jdbcConfig.getConnectionURL();
		String username = jdbcConfig.getUsername();
		String password = jdbcConfig.getPassword();

		String query = "SELECT VERSION()";
		logger.trace(query);

		Driver driver = jarFileLoader.loadClassAsInstance(jdbcConfig.getDriverClass(), new File(jdbcConfig.getJdbcLibLoc()));
		Properties prop = new Properties();
		prop.setProperty("user", username);
		prop.setProperty("password", password);
		DriverManager.registerDriver(new JdbcDriverProxy(driver));

		//try (Connection con = driver.connect(url, prop);
		try (Connection con = DriverManager.getConnection(url, prop);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query)) {

			if (rs.next()) {

				System.out.println("DB version: " + rs.getString(1));
			}

			return con;

		} catch (SQLException ex) {
			logger.error(ex.toString());
			throw ex;
		}

	}

}
