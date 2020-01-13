package org.mfh144.dtog.core;

import java.io.IOException;

public interface Writer<T> {

	public int write(T data) throws IOException;
	
}
