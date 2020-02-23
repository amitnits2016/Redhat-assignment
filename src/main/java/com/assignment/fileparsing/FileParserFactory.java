package com.assignment.fileparsing;

import com.assignment.fileparsing.model.FileFilterResponse;
import com.assignment.fileparsing.model.FileFilterResponseList;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileParserFactory {
    public static FileFilterResponseList parse(Path filePathInServer) throws IOException {
        List<String> lines = Files.readAllLines(filePathInServer, Charset.defaultCharset());

       
        List<FileFilterResponse> results = new ArrayList<>();

        for (String line : lines) {
        	if (!(line.contains("ENTER") || line.contains("EXIT"))) {
        		continue;
        	}
        	FileFilterResponse f = new FileFilterResponse();
        	
        	String[] fileParts = line.split(":");
        	
        	String val1 = fileParts[0];
        	
        	if (val1.contains("ENTER")) {
        		f.setOperation("ENTRY");
        	} else if (val1.contains("EXIT")){
        		f.setOperation("EXIT");
        	}
        	
        	String val2 = fileParts[1];
        	f.setFileName(val2.trim());
        	String val3 = fileParts[2];
        	
        	String[] val3Parts = val3.split(" ", 2);
        	f.setLineNumber(Integer.parseInt(val3Parts[0]));
        	
        	val3Parts[1] = val3Parts[1].trim();
        	if (val3Parts[1].equals("0") || !isValidFunctionName(val3Parts[1])) {
        		f.setName("anonymous");
        	} else {
        		f.setName(val3Parts[1]);
        	}
        	
        	results.add(f);
        	
        }
        
        return new FileFilterResponseList(results);
    }
    
    private static boolean isValidFunctionName(String functionName) {
    	Pattern pattern = Pattern.compile("^[a-zA-Z_]+[a-zA-Z0-9_]*");
    	
    	Matcher m = pattern.matcher(functionName);
    	return m.find();
    }
}
