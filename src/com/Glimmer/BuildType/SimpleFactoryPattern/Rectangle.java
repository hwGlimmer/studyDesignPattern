package com.Glimmer.BuildType.SimpleFactoryPattern;

/**
 * ConcreteProduct 具体产品角色
 * @author Glimmer
 *
 */
public class Rectangle implements IShape {

	@Override
	public void drawing() {
		System.out.println("绘制了一个矩形");
	}

}
