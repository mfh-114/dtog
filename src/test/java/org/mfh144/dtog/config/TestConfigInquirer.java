package org.mfh144.dtog.config;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mfh144.dtog.core.Reader;

public class TestConfigInquirer {

	private Reader<String> fr;
	private ConfigProcessor configProcessor;
	private ConfigInquirer ciq;

	@Before
	public void setup() throws IOException {
		fr = new TextFileReaderStub();
		ciq = new DtogConfigInquirer();
		configProcessor = new ConfigProcessor();
		configProcessor.setConfigFileReader(fr);
		configProcessor.setConfigInquirer(ciq);
		configProcessor.process();
	}

	@Test
	public void verifyJdbcURL() {
		// Assert.assertThat(ciq.getValue("jdbc.url"), Matchers);
		Assert.assertEquals("jdbc://test:8080", ciq.getValue("dtog-config.jdbc.url"));
	}
}
