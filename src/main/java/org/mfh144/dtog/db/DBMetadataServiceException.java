package org.mfh144.dtog.db;

import org.mfh144.dtog.ErrorCode;

public class DBMetadataServiceException extends RuntimeException {

	private static final long serialVersionUID = 371722023929473378L;

	public DBMetadataServiceException() {

	}

	public DBMetadataServiceException(String message) {
		super(message);
	}

	public DBMetadataServiceException(Throwable cause) {
		super(cause);
	}

	public DBMetadataServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ErrorCode getErrorCode() {
		return ErrorCode.DB_ERROR;
	}
}
