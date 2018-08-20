package com.study.pattern04.factory_method1Unit;

public class Firebat extends Unit {
	public Firebat() {
		type = UnitType.Firebat;
		name = "Firebat";
		hp = 80;
		exp = 60;
		
		System.out.println(this.name + " 생성 !!!");
	}

	@Override
	public void attack() {
		System.out.println(this.name + " 공격 !!!");

	}

}
