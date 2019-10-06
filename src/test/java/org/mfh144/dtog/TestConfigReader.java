package org.mfh144.dtog;

import org.mfh144.dtog.config.ApplicationConfiguration;
import org.mfh144.dtog.config.JdbcConfig;

public class TestConfigReader {

	public static void main(String[] args) {

		ApplicationConfiguration appConfig = new ApplicationConfiguration();
		JdbcConfig jdbcConfig = appConfig.jdbcConfig();

		System.out.println(jdbcConfig.toString());

	}

}
