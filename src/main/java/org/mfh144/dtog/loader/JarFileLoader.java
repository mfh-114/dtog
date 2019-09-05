package org.mfh144.dtog.loader;

import java.io.File;

public interface JarFileLoader<T> {

	public T loadClassAsInstance(String classname, File jarFile) throws Exception;

}