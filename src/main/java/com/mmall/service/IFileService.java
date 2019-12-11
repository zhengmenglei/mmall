package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by zml on 19-12-7.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
