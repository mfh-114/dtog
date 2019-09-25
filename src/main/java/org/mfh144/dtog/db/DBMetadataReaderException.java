package org.mfh144.dtog.db;

import org.mfh144.dtog.ErrorCode;

public class DBMetadataReaderException extends DBMetadataServiceException {

	private static final long serialVersionUID = 5255924483285149667L;

	public DBMetadataReaderException() {

	}

	public DBMetadataReaderException(String message) {
		super(message);
	}

	public DBMetadataReaderException(Throwable cause) {
		super(cause);
	}

	public DBMetadataReaderException(String message, Throwable cause) {
		super(message, cause);
	}

	public ErrorCode getErrorCode() {
		return ErrorCode.DB_RD_ERROR;
	}
}
