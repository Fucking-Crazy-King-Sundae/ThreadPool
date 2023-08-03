package com.example.threadpool.files.controller;

import com.example.threadpool.files.controller.response.ApiResponse;
import com.example.threadpool.files.controller.support.ApiResponseGenerator;
import com.example.threadpool.files.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RequiredArgsConstructor
@RequestMapping("/api/v1/files")
@RestController
public class FileController {

  private final FileService fileService;

  @GetMapping("/download")
  public ResponseEntity<byte[]> download(final @RequestParam String fileName) {
    return ApiResponseGenerator.of(fileService.download(fileName), fileName);
  }

  @PostMapping("/upload")
  public ApiResponse<String> upload(@RequestParam("file") MultipartFile file) {
    return ApiResponseGenerator.of(fileService.upload(file));
  }
}
