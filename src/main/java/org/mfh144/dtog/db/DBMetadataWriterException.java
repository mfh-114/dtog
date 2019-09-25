package org.mfh144.dtog.db;

import org.mfh144.dtog.ErrorCode;

public class DBMetadataWriterException extends DBMetadataServiceException {

	private static final long serialVersionUID = -9119884237357647871L;

	public DBMetadataWriterException() {

	}

	public DBMetadataWriterException(String message) {
		super(message);
	}

	public DBMetadataWriterException(Throwable cause) {
		super(cause);
	}

	public DBMetadataWriterException(String message, Throwable cause) {
		super(message, cause);
	}

	public ErrorCode getErrorCode() {
		return ErrorCode.DB_WRT_ERROR;
	}
}
