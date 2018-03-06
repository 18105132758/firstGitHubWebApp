package zyj.com.cn.test;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class TestSourcePath {

    @Test
    public void testGetAppPath(){
        System.out.println(getClass().getResource("/").getPath());
    }

    @Test
    public void test2(){
        System.out.println(getClass().getResource("").getPath());
    }


    @Test
    public void test3(){
        try {
            System.out.println(new File("").getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4(){
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("java.class.path"));
    }
}
