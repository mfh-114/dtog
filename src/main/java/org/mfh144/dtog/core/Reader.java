package org.mfh144.dtog.core;

import java.io.File;
import java.io.IOException;

public interface Reader<T> {
	
	public T read(File file) throws IOException;
}
