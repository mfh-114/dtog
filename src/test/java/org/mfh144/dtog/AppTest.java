package org.mfh144.dtog;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

	@DisplayName("Test Spring")
	@Test
	void testGet() {
		assertEquals("Hello JUnit 5", "Hello JUnit 5");
	}

}
