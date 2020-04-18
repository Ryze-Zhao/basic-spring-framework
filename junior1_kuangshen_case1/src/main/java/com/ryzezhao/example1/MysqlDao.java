package com.ryzezhao.example1;

public class MysqlDao implements SqlDao{
    @Override
    public void select() {
        System.out.println("Mysql查询到数据");
    }
}
