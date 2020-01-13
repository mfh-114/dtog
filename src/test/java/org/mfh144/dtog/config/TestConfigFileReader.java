package org.mfh144.dtog.config;

import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mfh144.dtog.core.Reader;

public class TestConfigFileReader {

	private Reader<String> fr;
	private ConfigProcessor configProcessor;

	@Before
	public void setup() {
		fr = new TextFileReaderStub();
		configProcessor = new ConfigProcessor();
		configProcessor.setConfigFileReader(fr);
	}

	@Test
	public void verifyParsedJsonMsg() throws IOException {
		Map<String, Object> parsedJson = configProcessor.parse();
		Assert.assertNotNull(parsedJson);
	}

}
