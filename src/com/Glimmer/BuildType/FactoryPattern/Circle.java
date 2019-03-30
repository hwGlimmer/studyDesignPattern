package com.Glimmer.BuildType.FactoryPattern;

/**
 * ConcreteProduct 具体产品角色
 * @author Glimmer
 *
 */
public class Circle implements IShape {

	@Override
	public void drawing() {
		System.out.println("绘制了一个圆");
	}

}
