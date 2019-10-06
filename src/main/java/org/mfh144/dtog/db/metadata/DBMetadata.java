package org.mfh144.dtog.db.metadata;

import org.mfh144.dtog.db.DBConnection;

public interface DBMetadata<T> {

	public T execute(DBConnection dbConnection);

}
