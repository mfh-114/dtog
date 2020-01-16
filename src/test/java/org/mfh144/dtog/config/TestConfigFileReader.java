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

	// The purpose of this test to make sure we are handling the exception when
	// configuration map (data structure of the config) is empty for some reasons.
	@Test(expected = IllegalArgumentException.class)
	public void verifyProcess() throws IOException {

		// set ConfigFileReader to null there configMap will be empty.
		configProcessor.setConfigFileReader(null);

		configProcessor.process();
	}

}
