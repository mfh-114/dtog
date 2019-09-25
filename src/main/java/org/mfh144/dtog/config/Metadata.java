package org.mfh144.dtog.config;

import java.util.List;

public class Metadata {

	private List<Schema> schemas;

	public List<Schema> getSchemas() {
		return schemas;
	}

	public void setSchemas(List<Schema> schemas) {
		this.schemas = schemas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Metadata [schemas=");
		builder.append(schemas);
		builder.append("]");
		return builder.toString();
	}

}
