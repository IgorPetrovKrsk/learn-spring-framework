package com.igor.petrov.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class TetrisGame implements GamingConsole {

    public void up(){
        System.out.println("Tetris up");
    }
    public void down(){
        System.out.println("Tetris down");
    }
    public void left(){
        System.out.println("Tetris left");
    }
    public void right(){System.out.println("Tetris right");}
}
