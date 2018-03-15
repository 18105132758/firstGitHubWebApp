package zyj.com.cn.test;

import org.junit.Test;

import java.util.Calendar;

/**
 * 日期相关测试代码
 */
public class TestDateCalendar {

    @Test
    public void testCalendar(){
        System.out.println(Calendar.getInstance().get(Calendar.YEAR));
    }

}
