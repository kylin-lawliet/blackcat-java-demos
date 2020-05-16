package com.blackcat.demo;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p> 描述 ：Apache 工具类 MapUtils 使用示例
 * @author : blackcat
 * @date : 2020/5/16 17:39
 */
public class ApacheMapUtilsDemo {

    @Test
    void test(){
        List list = new ArrayList();
        Map map = new HashMap();

        // List/Set 集合判空
        CollectionUtils.isEmpty(list);
        // Map 等集合进行判空
        MapUtils.isEmpty(map);
    }

    /**
     * <p> 描述 : 快速将数组加入到现有集合中
     * @author : blackcat
     * @date  : 2020/5/16 17:43
    */
    @Test
    void testArrayAddList(){
        List<String> listA = new ArrayList<>();
        listA.add("1");
        listA.add("2");
        listA.add("3");
        String[] arrays = new String[]{"a", "b", "c"};
        CollectionUtils.addAll(listA, arrays);
        System.out.println(listA.size());
    }
}
