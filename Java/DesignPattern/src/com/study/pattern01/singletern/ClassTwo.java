package com.study.pattern01.singletern;

public class ClassTwo {
	public ClassTwo(){
		MySingletonClass single = MySingletonClass.getInstance();
		System.out.println("ClassTwo");
		System.out.println("i = "+single.getI());
	}
	

}
