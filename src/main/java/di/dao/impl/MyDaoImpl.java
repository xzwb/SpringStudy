package di.dao.impl;

import di.dao.MyDao;
import org.springframework.stereotype.Component;

@Component
public class MyDaoImpl implements MyDao {
    @Override
    public void add() {
        System.out.println("MyDaoImpl");
    }
}
