package zyj.com.cn.test;

import org.junit.Test;

import java.util.Calendar;

public class TestDateCalendar {

    @Test
    public void testCalendar(){
        System.out.println(Calendar.getInstance().get(Calendar.YEAR));
    }

}
