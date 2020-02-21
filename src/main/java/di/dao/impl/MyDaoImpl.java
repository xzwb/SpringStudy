package di.dao.impl;

import di.dao.MyDao;

public class MyDaoImpl implements MyDao {
    @Override
    public void add() {
        System.out.println("MyDaoImpl");
    }
}
