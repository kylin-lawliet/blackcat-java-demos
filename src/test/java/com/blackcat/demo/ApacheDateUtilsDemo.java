package com.blackcat.demo;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * <p> 描述 ：Apache 工具类 DateUtils 使用示例
 * @author : blackcat
 * @date : 2020/5/16 17:27
 */
public class ApacheDateUtilsDemo {

    @Test
    void test() throws Exception{
        Date now = new Date();

        // Date 转化为字符串
        DateFormatUtils.format(now,"yyyy-MM-dd HH:mm:ss");
        // 字符串 转 Date
        DateUtils.parseDate("2020-05-07 22:00:00","yyyy-MM-dd HH:mm:ss");
        // Date 加 1 天
        Date addDays = DateUtils.addDays(now, 1);
        // Date 加 33 分钟
        Date addMinutes = DateUtils.addMinutes(now, 33);
        // Date 减去 233 秒
        Date addSeconds = DateUtils.addSeconds(now, -233);
        // 判断是否 Wie 同一天
        boolean sameDay = DateUtils.isSameDay(addDays, addMinutes);
        // 过滤时分秒,若 now 为 2020-05-07 22:13:00 调用 truncate 方法以后
        // 返回时间为 2020-05-07 00:00:00
        Date truncate = DateUtils.truncate(now, Calendar.DATE);
    }
}
