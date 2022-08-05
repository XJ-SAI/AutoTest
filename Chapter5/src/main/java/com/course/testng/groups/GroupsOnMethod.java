package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "service")
    public void test1(){
        System.out.println("这是服务端组的测试方法111111");
    }

    @Test(groups = "service")
    public void test2(){
        System.out.println("这是服务端组的测试方法222222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法111111");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法222222");
    }

    @BeforeGroups("service")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行前的操作！！！！！！");
    }

    @AfterGroups("service")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行后的操作！！！！！！");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是客户端组运行前的操作！！！！！！");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是客户端组运行后的操作！！！！！！");
    }
}
