package com.laisiqi.iotest;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class IoTest {
    public static void main(String[] args) throws IOException {
        FileUtils.deleteDirectory(new File("D:\\图像汇报\\2"));
    }
}
