package com.learn_spring.learnSpring.simpleService.repositories;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleMongoRepository implements ISimpleRepository{
    final private List<Integer> data;

    public SimpleMongoRepository(){
        this.data = new ArrayList<Integer>();
    }


    @Override
    public String name() {
        return "Mongo DB";
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
