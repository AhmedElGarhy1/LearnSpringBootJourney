package com.learn_spring.learnSpring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MarioGame implements IGame{
    public String getTitle() {return "Mario Game!";}
}
