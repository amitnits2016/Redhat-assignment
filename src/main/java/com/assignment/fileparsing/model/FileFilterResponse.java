package com.assignment.fileparsing.model;

public class FileFilterResponse {

	public FileFilterResponse() { }
	
    public FileFilterResponse(String operation, String fileName, int lineNo, String name) {
        this.operation = operation;
        this.fileName = fileName;
        this.lineNumber = lineNo;
        this.name = name;
    }

    private String operation;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String fileName;
    private int lineNumber;
    private String name;
}
