package com.learn_spring.learnSpring.simpleService.repositories;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Primary
public class SimpleSqlRepository implements ISimpleRepository {

    final private List<Integer> data;

    public SimpleSqlRepository(){
        this.data = new ArrayList<Integer>();
    }


    @Override
    public String name() {
        return "SQL DB";
    }

    @Override
    public List<Integer> find() {
        return data;
    }

    @Override
    public int findOne(int id) {
        return data.get(id);
    }

    @Override
    public void insert(int record) {
        data.add(record);
    }

    @Override
    public void remove(int id) {
        data.remove(id);
    }
}
