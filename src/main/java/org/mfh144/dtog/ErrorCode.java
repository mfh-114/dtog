package org.mfh144.dtog;

public enum ErrorCode {

	DB_ERROR("DB001"), 
	DB_WRT_ERROR("DB002"), 
	DB_RD_ERROR("DB003");

	private String code;

	private ErrorCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public static ErrorCode fromString(String codeStr) {
		for (ErrorCode erc : ErrorCode.values()) {
			if (erc.getCode().equalsIgnoreCase(codeStr)) {
				return erc;
			}
		}
		return null;
	}
}
