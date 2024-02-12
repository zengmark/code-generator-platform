package com.codegen.maker.generator.file;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.ArrayUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class StaticFileGenerator {

    /**
     * 拷贝文件
     *
     * @param sourceFile 源文件
     * @param destFile   目标文件
     */
    public static void copyFileByHutool(String sourceFile, String destFile) {
        FileUtil.copy(sourceFile, destFile, false);
    }

//    /**
//     * 递归拷贝文件
//     *
//     * @param sourceFileName
//     * @param destFileName
//     */
//    public static void copyFilesByRecursive(String sourceFileName, String destFileName) {
//        File sourceFile = new File(sourceFileName);
//        File destFile = new File(destFileName);
//        try {
//            copyFileByRecurisive(sourceFile, destFile);
//        } catch (Exception e) {
//            System.err.println("文件复制失败");
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * 递归逻辑
//     *
//     * @param sourceFile
//     * @param destFile
//     * @throws IOException
//     */
//    public static void copyFileByRecurisive(File sourceFile, File destFile) throws IOException {
//        if (sourceFile.isDirectory()) {
//            System.out.println(sourceFile.getName());
//            File destOutputFile = new File(destFile, sourceFile.getName());
//            if (!destOutputFile.exists()) {
//                destOutputFile.mkdirs();
//            }
//            File[] files = sourceFile.listFiles();
//            if (ArrayUtil.isEmpty(files)) {
//                return;
//            }
//            for (File file : files) {
//                copyFileByRecurisive(file, destOutputFile);
//            }
//        } else {
//            Path destPath = destFile.toPath().resolve(sourceFile.getName());
//            Files.copy(sourceFile.toPath(), destPath, StandardCopyOption.REPLACE_EXISTING);
//        }
//    }
}
