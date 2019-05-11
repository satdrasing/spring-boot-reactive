package io.satendra.reactivedemo.services;

import io.satendra.reactivedemo.dao.HelloDao;
import io.satendra.reactivedemo.documents.HelloDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.List;

@Component
public class HelloService {

    private HelloDao helloDao;


    public Flux<HelloDocument> getHelloDoc(){

        return helloDao.findAll();
    }

    public HelloDao getHelloDao() {
        return helloDao;
    }


    @Autowired
    public void setHelloDao(HelloDao helloDao) {
        this.helloDao = helloDao;
    }
}
