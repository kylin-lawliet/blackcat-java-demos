package com.blackcat.demo;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

/**
 * <p> 描述 ：Apache 提供的 commons-io 库，增强 I/O 操作
 * @author : blackcat
 * @date : 2020/5/16 17:46
 */
public class ApacheFileUtilsDemo {

    @Test
    void test()throws Exception{
        // 拷贝文件
        File fileA = new File("E:\\test\\test.txt");
        File fileB = new File("E:\\test1\\test.txt");
        FileUtils.copyFile(fileA,fileB);

        // 按照指定文件后缀如java,txt等去查找指定文件夹的文件
        File directory = new File("E:\\test");
        FileUtils.listFiles(directory, new String[]{"txt"}, false);

        // 读取指定文件所有行 不需要使用 while 循环读取流了
        List<String> lines = FileUtils.readLines(fileA);

        // 将输入流信息全部输出到字节数组中
//        byte[] b = IOUtils.toByteArray(request.getInputStream());
        // 将输入流信息转化为字符串
//        String resMsg = IOUtils.toString(request.getInputStream());
    }
}
