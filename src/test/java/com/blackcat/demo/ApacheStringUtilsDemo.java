package com.blackcat.demo;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

/**
 * <p> 描述 ：Apache 工具类 StringUtils使用示例
 * @author : blackcat
 * @date : 2020/5/16 16:52
 */
public class ApacheStringUtilsDemo {
    private String str = "test";
    String[] array = new String[]{"test", "1234", "5678"};

    @Test
    void test(){
//        str = StringUtils.replacePattern("ABCabc123", "[^A-Z0-9]+", "");
//        System.out.println(str);
        str = StringUtils.join(array, ","); //    = "a,b,c"
        System.out.println(str);
        System.out.println(StringUtils.splitByWholeSeparatorPreserveAllTokens("a..b.c", "."));
    }

    @Test
    void testEmpty(){
        StringUtils.isEmpty("123");// false;
        StringUtils.isEmpty("");// true;
        StringUtils.isEmpty(" ");// false;
        StringUtils.isBlank(" ");// true;
        StringUtils.isBlank("");// true;
        StringUtils.isBlank("123");// false;
    }

    @Test
    void other(){
        // 字符串固定长度 8位，若不足，往左补 0
        StringUtils.leftPad("test", 8, "0");// 0000test
        // 字符串固定长度 8位，若不足，往右补 0
        StringUtils.rightPad(str, 8, "0");// test0000

        // 默认替换所有关键字
        StringUtils.replace("aba", "a", "z");// zbz
        // 替换关键字，仅替换一次
        StringUtils.replaceOnce("aba", "a", "z"); // zba
        // 使用正则表达式替换
        StringUtils.replacePattern("ABCabc123", "[^A-Z0-9]+", ""); // ABC123

        // 字符串拼接
        StringUtils.join(array, ","); // test,1234,5678
        // 字符串拆分
        StringUtils.split("a..b.c", ',');// ["a", "b", "c"]
        // 字符串拆分 拆分结果包含空字符
        StringUtils.splitByWholeSeparatorPreserveAllTokens("a..b.c", ".");// ["a","", "b", "c"]


    }
}
