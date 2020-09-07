package com.alice.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alice.entity.Movement;
import com.alice.entity.Robot;
import com.alice.ui.DoRobotConsole;
import com.alice.ui.RobotConsole;

public class Program {
	public static void main(String[] args) {
		
//		Robot robot = new Movement(); 
//        RobotConsole console = new DoRobotConsole(robot);
//		console.setRobot(robot);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/alice/demo/setting.xml");
		
//		RobotConsole console = (RobotConsole) context.getBean("console");
		RobotConsole console = context.getBean(RobotConsole.class);
		
		console.print();
	}
}
 