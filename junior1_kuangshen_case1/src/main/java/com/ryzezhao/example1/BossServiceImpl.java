package com.ryzezhao.example1;

public class BossServiceImpl implements BossService {
    private SqlDao sqlDao;
    public SqlDao getSqlDao() {
        return sqlDao;
    }
    public void setSqlDao(SqlDao sqlDao) {
        this.sqlDao = sqlDao;
    }
}
