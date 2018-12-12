package com.myrmia.utils.file;

import java.io.File;

/**
 * file utils
 * Created by Ellery on 2018/12/12.
 */
public class FileUtils {

    public static void isDirectory(String path) {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }
    }
}
