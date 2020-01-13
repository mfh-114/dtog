package org.mfh144.dtog.config;

import java.io.File;
import java.io.IOException;

import org.mfh144.dtog.core.Reader;

public class TextFileReaderStub implements Reader<String>{

	@Override
	public String read(File file) throws IOException {
		
		// BuildMyString.com generated code. Please enjoy your string responsibly.

			final String sb = "{" +
			"   \"dtog-config\":{" +
			"       \"jdbc\":{" +
			"           \"url\":\"jdbc://test:8080\"," +
			"           \"username\":\"root\"," +
			"           \"passoword\":\"root\"" +
			"       }," +
			"       \"cache-dir\":\"c:\\\\ddd\"," +
			"       \"dtog-plugins\":[" +
			"           {" +
			"               \"pkg\":\"org.some.plugin\"," +
			"               \"Class\":\"MyPluginClass\"," +
			"               \"config\":[" +
			"                   {" +
			"                      \"key\":\"keyVal1\", " +
			"                      \"value\":\"val1\"" +
			"                   }," +
			"                   {" +
			"                      \"key\":\"keyVal2\", " +
			"                      \"value\":\"val2\"" +
			"                   }," +
			"                   {" +
			"                      \"key\":\"keyVal3\", " +
			"                      \"value\":[\"v1\",\"v2\"]" +
			"                   }" +
			"               ]" +
			"           }" +
			"       ]" +
			"   }" +
			"}";
			
			return sb;
	}

}
