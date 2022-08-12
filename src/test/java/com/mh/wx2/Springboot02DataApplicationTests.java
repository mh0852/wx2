package com.mh.wx2;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class Springboot02DataApplicationTests {
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        // 看一下默认数据源
        System.out.println("getClass ---> " + dataSource.getClass());
        Connection connection = dataSource.getConnection();

        // 将数据源强转为 druid 数据源
        DruidDataSource druidDataSource = (DruidDataSource) dataSource;
        // 查看连接
        System.out.println("connection ---> " + connection);

        // 查看druid配置
        System.out.println("最大连接数 ---> " + druidDataSource.getMaxActive());
        System.out.println("初始连接数 ---> " + druidDataSource.getInitialSize());

        // 关闭连接
        connection.close();
    }
}
