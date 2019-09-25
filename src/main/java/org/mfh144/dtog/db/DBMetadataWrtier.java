package org.mfh144.dtog.db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import org.mfh144.dtog.config.JdbcConfig;

public class DBMetadataWrtier implements DBMetadataService<Integer> {

	private JdbcConfig JdbcConfig;

	public void setJdbcConfig(JdbcConfig jdbcConfig) {
		JdbcConfig = jdbcConfig;
	}

	/***
	 * Write JDBC Metadata as serialize objects.
	 * 
	 * @return if writing is successful return 1 otherwise 0.
	 */
	@Override
	public Integer execute(Connection conn) throws DBMetadataWriterException {

		try {
			DatabaseMetaData dbMetaData = conn.getMetaData();
			//dbMetaData.getT
		} catch (SQLException e) {
			throw new DBMetadataWriterException(e.getMessage(), e);
		}

		return 0;
	}

}
