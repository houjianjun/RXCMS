package com.ccbits.common;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//使用junit4进行测试  
@RunWith(SpringJUnit4ClassRunner.class)
//加载配置文件
@ContextConfiguration({"classpath:applicationContext.xml" })
public class Base {

}
