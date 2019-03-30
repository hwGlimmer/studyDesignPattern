package com.Glimmer.StructuralType.DecoratorPattern;

/**
 * 建造型——装饰器模式：
 * @author Glimmer
 *
 */
public class Test {

	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		System.out.println("装饰器=之后-------增加飞的功能");
		FlyCar flyCar = new FlyCar(car);
		flyCar.move();
	}
}
