package org.mfh144.dtog;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class JarLoader<T> extends URLClassLoader {

	public JarLoader(URL[] urls) {
		super(urls);
	}

	public Class<T> loadClassByPath(String path, String className) throws ClassNotFoundException, IOException {

		String urlPath = "jar:file://" + path + "!/";

		addURL(new URL(urlPath));
		
		@SuppressWarnings("unchecked")
		Class<T> c = (Class<T>) getSystemClassLoader().loadClass(className);
		
		
		return c;

	}
	
}
