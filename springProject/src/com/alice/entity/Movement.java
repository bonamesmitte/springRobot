package com.alice.entity;

public class Movement implements Robot {
	
	private String doAttack;
	private String forward;
	private String backward;
	private String right;
	private String left;
	
	int attackNum;
	int forwardNum;
	int backwardNum;
	
	public Movement() {
		
	}
	
	public Movement(int attackNum, int forwardNum, int backwardNum) {
		super();
		this.attackNum = attackNum;
		this.forwardNum = forwardNum;
		this.backwardNum = backwardNum;
	}

	public int getAttackNum() {
		return attackNum;
	}

	public void setAttackNum(int attackNum) {
		this.attackNum = attackNum;
	}

	public int getForwardNum() {
		return forwardNum;
	}

	public void setForwardNum(int forwardNum) {
		this.forwardNum = forwardNum;
	}

	public int getBackwardNum() {
		return backwardNum;
	}

	public void setBackwardNum(int backwardNum) {
		this.backwardNum = backwardNum;
	}

	@Override
	public String attack() {
		String attack = "I'm hitting the enemy " + attackNum + " times!!!!!!!!";
		return attack;
	}

	@Override
	public String moveForward() {
		String forward = "I'm running forward " + forwardNum + " steps"; 
		return forward;
	}

	@Override
	public String moveBackward() {
		String backward = "I'm moving backword " + backwardNum + " steps";
		return backward;
	}

	@Override
	public String turnRight() {
		String right = "I'm turning right";
		return right;
	}

	@Override
	public String turnLeft() {
		String left = "I'm turning left";
		return left;
	}

}
