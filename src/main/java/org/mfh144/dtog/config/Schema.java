package org.mfh144.dtog.config;

import java.util.List;

public class Schema {

	private String name;
	private List<String> tables;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTables() {
		return tables;
	}

	public void setTables(List<String> tables) {
		this.tables = tables;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Schema [name=");
		builder.append(name);
		builder.append(", tables=");
		builder.append(tables);
		builder.append("]");
		return builder.toString();
	}

}
