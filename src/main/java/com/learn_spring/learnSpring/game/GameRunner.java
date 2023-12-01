package com.learn_spring.learnSpring.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    final IGame game;
    public GameRunner(IGame game){
        this.game = game;
    }

    public void run(){
        System.out.println(game.getTitle());
        System.out.println("Game is running");
    }

}
