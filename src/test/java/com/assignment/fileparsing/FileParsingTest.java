package com.assignment.fileparsing;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.assignment.fileparsing.model.FileFilterResponseList;

@SpringBootTest
class FileParsingTest {

	@Test
	void contextLoads() throws IOException {
		// Given scenario
		File fileToTest = new File(getClass().getResource("/log.txt").getFile());
		
		// Code to test
		FileFilterResponseList response = FileParserFactory.parse(fileToTest.toPath());
		
		// Assert result
		assert response != null;
		assert response.getResult() != null;
		assert response.getResult().size() == 12;
	}

}
