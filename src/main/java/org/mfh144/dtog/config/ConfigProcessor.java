package org.mfh144.dtog.config;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.mfh144.dtog.core.DtogAppConvention;
import org.mfh144.dtog.core.Reader;

import groovy.json.JsonSlurper;

public class ConfigProcessor {

	private Reader<String> configFileReader;
	private ConfigInquirer configInquirer;

	public ConfigProcessor() {

	}

	public void setConfigFileReader(Reader<String> configFileReader) {
		this.configFileReader = configFileReader;
	}

	public void setConfigInquirer(ConfigInquirer configInquirer) {
		this.configInquirer = configInquirer;
	}

	public void process() throws IOException {
		Map<String, Object> configMap = this.parse();

		if (configMap == null || configMap.isEmpty())
			throw new IllegalArgumentException("Configuration settings are empty.");

		this.configInquirer.setConfigMap(configMap);
	}

	private Map<String, Object> parse() throws IOException {

		if (configFileReader == null)
			throw new IllegalArgumentException("Reader<String> object is not set.");

		String config = configFileReader.read(new File(DtogAppConvention.getConfigFileLocation()));

		JsonSlurper jslurper = new JsonSlurper();
		@SuppressWarnings("unchecked")
		Map<String, Object> configMap = (Map<String, Object>) jslurper.parseText(config);

		return configMap;
	}

}
