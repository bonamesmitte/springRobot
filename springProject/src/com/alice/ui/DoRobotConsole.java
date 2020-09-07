package com.alice.ui;

import com.alice.entity.Robot;

public class DoRobotConsole implements RobotConsole {

	private Robot robot;
	
	public DoRobotConsole() {
		
	}
	
	public DoRobotConsole(Robot robot) {
		this.robot = robot;
	}

	@Override
	public void print() {
		System.out.println("Hi, I'm your robot. Give me an order. ~~~ Okay, I got it!");
		System.out.println(robot.moveForward());
		System.out.println(robot.moveBackward());
		System.out.println(robot.turnRight());
		System.out.println(robot.turnLeft());
		System.out.println("Hai~Ya!");
		System.out.println(robot.attack());

	}

	@Override
	public void setRobot(Robot robot) {
		this.robot = robot;
		
	}
}

