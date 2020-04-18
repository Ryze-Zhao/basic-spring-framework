package com.ryzezhao.example1;

public class OracleDao implements SqlDao {
    @Override
    public void select() {
        System.out.println("Oracle查询到数据");
    }
}
