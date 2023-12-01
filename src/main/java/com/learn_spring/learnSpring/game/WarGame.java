package com.learn_spring.learnSpring.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class WarGame implements IGame{
    public String getTitle() {return "War Game!";}

}
