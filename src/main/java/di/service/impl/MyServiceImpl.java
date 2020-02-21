package di.service.impl;

import di.dao.MyDao;
import di.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;

@Component
public class MyServiceImpl implements MyService {
    private MyDao myDao ;

    @Override
    public void add() {
        System.out.println("hahaahahahahahah");
        myDao.add();
    }

    @Autowired
    // @Resource(name = "myDao")
    public void setMyDao(MyDao myDao) {
        this.myDao = myDao;
    }


    public MyServiceImpl(MyDao myDao) {
        this.myDao = myDao;
    }

    public MyServiceImpl() {

    }
}
