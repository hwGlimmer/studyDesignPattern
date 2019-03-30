package com.Glimmer.StructuralType.DecoratorPattern;

/**
 * ConcreteComponent 具体的被装饰对象
 * 是定义了一个具体的对象（例如：人），也可以给这个对象添加一些其他职责。
 * @author Glimmer
 *
 */
public class Car implements ICar {

	@Override
	public void move() {
		System.out.println("汽车移动");
	}

}
