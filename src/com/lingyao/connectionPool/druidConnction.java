package com.lingyao.connectionPool;


import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

//java -cp .\druid-1.0.29.jar com.alibaba.druid.filter.config.ConfigTools password 生成加密的密码
public class druidConnction {
    private static DataSource dataSource = null;

    static{
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("E:\\Documents\\work\\sohu\\source\\jdbcDemo\\src\\com\\lingyao\\connectionPool\\db.properties"));
            dataSource = DruidDataSourceFactory.createDataSource(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public druidConnction() throws Exception {

    }

    public static Connection getConnection() throws SQLException {return dataSource.getConnection();}

    public static DataSource getDataSource() throws SQLException {return  dataSource;};
}
