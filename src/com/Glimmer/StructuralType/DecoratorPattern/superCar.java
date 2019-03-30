package com.Glimmer.StructuralType.DecoratorPattern;

/**
 * Decorator 抽象装饰类
 * 装饰抽象类，继承了Component，从外类来扩展Component类的功能，但对Component来说，是无需知道Decorator存在的。
 * @author Glimmer
 *
 */
public class superCar implements ICar{

	protected ICar car ; // 持有真实对象的引用
	
	@Override
	public void move() {
		car.move(); // 调用真实对象的move方法
	}

	public superCar(ICar car) {
		super();
		this.car = car;
	}

	

}
