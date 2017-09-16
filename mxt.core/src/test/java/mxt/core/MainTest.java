package mxt.core;

import java.io.InputStream;

import org.junit.Test;

public class MainTest {
	@Test
	public void testName() throws Exception {
		try (InputStream str = getClass().getResource("/IMG_0648.JPG")
				.openStream()) {

		}
	}
}
