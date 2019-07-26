package org.mfh144.dtog.config;

public class Application {

	private String name;
	private String configRoot;
	private String jdbcLibRoot;
	private String pluginsRoot;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getConfigRoot() {
		return configRoot;
	}

	public void setConfigRoot(String configRoot) {
		this.configRoot = configRoot;
	}

	public String getJdbcLibRoot() {
		return jdbcLibRoot;
	}

	public void setJdbcLibRoot(String jdbcLibRoot) {
		this.jdbcLibRoot = jdbcLibRoot;
	}

	public String getPluginsRoot() {
		return pluginsRoot;
	}

	public void setPluginsRoot(String pluginsRoot) {
		this.pluginsRoot = pluginsRoot;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Application [name=");
		builder.append(name);
		builder.append(", configRoot=");
		builder.append(configRoot);
		builder.append(", jdbcLibRoot=");
		builder.append(jdbcLibRoot);
		builder.append(", pluginsRoot=");
		builder.append(pluginsRoot);
		builder.append("]");
		return builder.toString();
	}

}
