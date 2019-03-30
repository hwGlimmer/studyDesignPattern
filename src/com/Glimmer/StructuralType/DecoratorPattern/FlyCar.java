package com.Glimmer.StructuralType.DecoratorPattern;

/**
 * ConcreteDecorator 具体装饰类
 * 就是具体的装饰对象了（衣服，鞋子..），它起到了给Component添加职责的功能。
 * @author Glimmer
 *
 */
public class FlyCar extends superCar {

	public FlyCar(ICar car) {
		super(car);
	}
	
	@Override
	public void move() {
		super.move();
		Fly(); // 增加飞的方法
	}

	private void Fly() {
		System.out.println("天上飞");
	}

}
