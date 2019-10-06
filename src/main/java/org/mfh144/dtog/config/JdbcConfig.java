package org.mfh144.dtog.config;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(value = Include.NON_EMPTY)
public class JdbcConfig {

	private String name;
	private String jdbcLibLoc;
	private String driverClass;
	private String connectionURL;
	private String username;
	private String password;
	private List<Schema> schemas;

	public JdbcConfig() {

	}

	@JsonProperty("Name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("JdbcLibLoc")
	public String getJdbcLibLoc() {
		return jdbcLibLoc;
	}

	public void setJdbcLibLoc(String jdbcLibLoc) {
		this.jdbcLibLoc = jdbcLibLoc;
	}

	@JsonProperty("DriverClass")
	public String getDriverClass() {
		return driverClass;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	@JsonProperty("ConnectionURL")
	public String getConnectionURL() {
		return connectionURL;
	}

	public void setConnectionURL(String connectionURL) {
		this.connectionURL = connectionURL;
	}

	@JsonProperty("Username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@JsonProperty("Password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@JsonProperty("Schemas")
	public List<Schema> getSchemas() {
		return schemas;
	}

	public void setSchemas(List<Schema> schemas) {
		this.schemas = schemas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JdbcConfig [name=");
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
		builder.append(", schemas=");
		builder.append(schemas);
		builder.append("]");
		return builder.toString();
	}

}
