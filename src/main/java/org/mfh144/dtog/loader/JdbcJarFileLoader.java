package org.mfh144.dtog.loader;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.Driver;
import java.util.Properties;

import org.springframework.stereotype.Component;

@Component
public class JdbcJarFileLoader implements JarFileLoader<Driver> {

	
	@Override
	public Driver loadClassAsInstance(String classname, File jdbcJarFile)
			throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		URL[] urls = new URL[1];
		urls[0] = jdbcJarFile.toURI().toURL();
		
		URLClassLoader driverClassLoader = new URLClassLoader(urls, ClassLoader.getSystemClassLoader());
		
		Class<?> drvClass = Class.forName(classname,true, driverClassLoader);
		
		Driver driver = (Driver)drvClass.newInstance();
		
		return driver;
	}

}
