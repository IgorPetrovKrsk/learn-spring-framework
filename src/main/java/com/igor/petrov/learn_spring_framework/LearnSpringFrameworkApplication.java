package com.igor.petrov.learn_spring_framework;

import com.igor.petrov.learn_spring_framework.game.GameRunner;
import com.igor.petrov.learn_spring_framework.game.MarioGame;
import com.igor.petrov.learn_spring_framework.game.SuperContraGame;
import com.igor.petrov.learn_spring_framework.game.TetrisGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	static void main(String[] args) {
		ConfigurableApplicationContext context
				= SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);

//		SuperContraGame game = new SuperContraGame();
//		GameRunner runner = new GameRunner(game);
//		runner.run();

//		MarioGame game2 = new MarioGame();
//		GameRunner runner2 = new GameRunner(game2);
		runner.run();

//		TetrisGame game3 = new TetrisGame();
//		GameRunner runner3 = new GameRunner(game3);
//		runner3.run();
	}
}
