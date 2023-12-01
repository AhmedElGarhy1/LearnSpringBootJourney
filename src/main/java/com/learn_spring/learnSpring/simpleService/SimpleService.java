package com.learn_spring.learnSpring.simpleService;

import com.learn_spring.learnSpring.simpleService.repositories.ISimpleRepository;
import jdk.dynalink.Operation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Component
public class SimpleService {
    final ISimpleRepository repo;

    public SimpleService(@Qualifier("simpleMongoRepository") ISimpleRepository repo){
        this.repo = repo;
    }

   public void seed(){
        repo.insert(10);
        repo.insert(20);
        repo.insert(40);
        repo.insert(30);
        repo.insert(50);
        repo.remove(3); // 30
   }

   public void display(){
       System.out.println("DATABASE: " + repo.name());
       System.out.println(this.repo.find().toString());
   }

   public int getMax(){
        return Collections.max(repo.find());
   }

}
