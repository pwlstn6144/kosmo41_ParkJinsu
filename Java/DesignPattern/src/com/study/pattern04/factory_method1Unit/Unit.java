package com.study.pattern04.factory_method1Unit;

enum UnitType{
	Marine,
	Firebat
}
///<summary>
///The 'Product' abstract class
///</summary>
public abstract class Unit {

	protected UnitType type;
	protected String name;
	protected int hp;
	protected int exp;
	public abstract void attack();
}
