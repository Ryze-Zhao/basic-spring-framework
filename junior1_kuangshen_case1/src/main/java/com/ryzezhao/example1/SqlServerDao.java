package com.ryzezhao.example1;

public class SqlServerDao implements SqlDao {
    @Override
    public void select() {
        System.out.println("SQLServer查询到数据");
    }
}
