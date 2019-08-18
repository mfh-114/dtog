package org.mfh144.dtog.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("file:../config/jdbc.yaml")
@ConfigurationProperties
public class Jdbc {

	public String name;
	public String jdbcLibLoc;
	private String driverClass;
	private String connectionURL;
	public String username;
	public String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJdbcLibLoc() {
		return jdbcLibLoc;
	}

	public void setJdbcLibLoc(String jdbcLibLoc) {
		this.jdbcLibLoc = jdbcLibLoc;
	}

	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public String getConnectionURL() {
		return connectionURL;
	}

	public void setConnectionURL(String connectionURL) {
		this.connectionURL = connectionURL;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jdbc [name=");
		builder.append(name);
		builder.append(", jdbcLibLoc=");
		builder.append(jdbcLibLoc);
		builder.append(", driverClass=");
		builder.append(driverClass);
		builder.append(", connectionURL=");
		builder.append(connectionURL);
		builder.append(", username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}

}