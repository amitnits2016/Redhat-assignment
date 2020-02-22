package com.assignment.fileparsing;

import com.assignment.fileparsing.model.FileFilterResponseList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private static final String message = "Hello";

    @Autowired
    private FileStorageService fileStorageService;

    @GetMapping("/")
    public String getMessage() {
        return message;
    }

    @PostMapping("/uploadFile")
    public FileFilterResponseList uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        Path filePathInServer = fileStorageService.storeFile(file);

        return FileParserFactory.parse(filePathInServer);
    }
}
