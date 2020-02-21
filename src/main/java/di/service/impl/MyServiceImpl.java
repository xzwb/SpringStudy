package di.service.impl;

import di.dao.MyDao;
import di.service.MyService;

public class MyServiceImpl implements MyService {
    private MyDao myDao ;

    @Override
    public void add() {
        System.out.println("hahaahahahahahah");
        myDao.add();
    }

    public void setMyDao(MyDao myDao) {
        this.myDao = myDao;
    }


    public MyServiceImpl(MyDao myDao) {
        this.myDao = myDao;
    }

    public MyServiceImpl() {

    }
}
