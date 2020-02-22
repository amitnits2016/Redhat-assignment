package com.assignment.fileparsing.model;

import java.util.List;

public class FileFilterResponseList {
    public FileFilterResponseList(List<FileFilterResponse> fileFilterResponses) {
        this.result = fileFilterResponses;
    }

    public List<FileFilterResponse> getResult() {
        return result;
    }

    public void setResult(List<FileFilterResponse> result) {
        this.result = result;
    }

    List<FileFilterResponse> result;
}
