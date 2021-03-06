package org.mfh144.dtog.config;

import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.mfh144.dtog.core.Reader;

public class TestConfigFileReader {

	private Reader<String> fr;
	private ConfigProcessor configProcessor;
	private ConfigInquirer ciq;

	@Before
	public void setup() {
		fr = new TextFileReaderStub();
		ciq = new ConfigInquirerStub();
		configProcessor = new ConfigProcessor();
		configProcessor.setConfigFileReader(fr);
		configProcessor.setConfigInquirer(ciq);
	}
	
}
