package org.mfh144.dtog.config;

import java.io.File;
import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class ApplicationConfiguration {

	@Bean(name = "JdbcConfigBean", autowireCandidate = true)
	public JdbcConfig jdbcConfig() {

		ObjectMapper objectMapper = new ObjectMapper();
		JdbcConfig jdbcConfig = null;
		try {
			jdbcConfig = objectMapper.readValue(new File(AppConfigConvention.JDBC_CONFIG_PATH.getValue()),
					JdbcConfig.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return jdbcConfig;
	}

}
