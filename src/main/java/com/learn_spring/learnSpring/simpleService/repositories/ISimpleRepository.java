package com.learn_spring.learnSpring.simpleService.repositories;

import java.util.List;

public interface ISimpleRepository {

    String name();
    List<Integer> find();

    int findOne(int id);

    void insert(int record);

    void remove(int id);
}
