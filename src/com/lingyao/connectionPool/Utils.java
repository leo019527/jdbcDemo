package com.lingyao.connectionPool;

import com.lingyao.JDBC2CommenUtils.UtilsMain;
import com.lingyao.Person;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.SQLException;
import java.util.List;

public class Utils {
    private QueryRunner runner = null;//核心类，用来操作数据库

    public Utils() {
        try {
            this.runner = new QueryRunner(druidConnction.getDataSource());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //增加
    public void add(Person p){
        String sql = "INSERT INTO test VALUES(?,?)";
        try {
            //填写的顺序要对上
            runner.update(sql, p.getName(), p.getPsw());
            //或
//            runner.update(UtilsMain.getConnection(),sql,new Object[]{p.getName(),p.getPsw()});
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    //删除
    public void delete(Person p){
        String sql = "DELETE FROM test WHERE name=?";
        try {
            runner.update(sql, p.getName());
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    //改
    public void update(Person p,String psw){
        String sql = "UPDATE test SET psw=? WHERE name=?";
        try{
            System.out.println(runner.update(sql,psw,p.getName()));
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    //查
    public void select(String name) throws SQLException{
        String sql = "SELECT name,psw FROM test";
        //获取一个对象
//        Person p = runner.query(sql,new BeanHandler<Person>(Person.class));
//        System.out.println(p.toString());
        //获取所有对象
        List<Person> p2 = runner.query(sql, new String[]{"123","456"},new BeanListHandler<Person>(Person.class));
        for(Person p:p2){
            System.out.println(p.toString());
        }
//        String sql2 = "SELECT count(*) as count FROM test";
//        Object query = runner.query(sql2, new ScalarHandler<>());
//        System.out.println(Integer.valueOf(query.toString()));
    }
}
