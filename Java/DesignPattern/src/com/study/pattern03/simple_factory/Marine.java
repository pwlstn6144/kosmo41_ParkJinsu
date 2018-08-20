package com.study.pattern03.simple_factory;

public class Marine implements Unit {

	public Marine() {
		System.out.println("마린 생성 !!!");
	}
	@Override
	public void move() {
		System.out.println("마린 이동 !!!");

	}

}
