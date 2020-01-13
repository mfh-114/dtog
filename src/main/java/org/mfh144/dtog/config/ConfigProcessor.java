package org.mfh144.dtog.config;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.mfh144.dtog.core.DtogAppConvention;
import org.mfh144.dtog.core.Reader;

import groovy.json.JsonSlurper;

public class ConfigProcessor {

	private Reader<String> configFileReader;

	public ConfigProcessor() {

	}

	public void setConfigFileReader(Reader<String> configFileReader) {
		this.configFileReader = configFileReader;
	}

	public Map<String, Object> parse() throws IOException {
		String config = configFileReader.read(new File(DtogAppConvention.getConfigFileLocation()));

		JsonSlurper jslurper = new JsonSlurper();
		@SuppressWarnings("unchecked")
		Map<String, Object> configMap = (Map<String, Object>) jslurper.parseText(config);

		return configMap;
	}

}
