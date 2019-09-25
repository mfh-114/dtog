package org.mfh144.dtog.db;

import java.sql.Connection;

public interface DBMetadataService<T> {

	public T execute(Connection conn) throws DBMetadataServiceException;
	
}