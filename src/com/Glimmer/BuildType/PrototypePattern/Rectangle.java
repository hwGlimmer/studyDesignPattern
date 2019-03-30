package com.Glimmer.BuildType.PrototypePattern;

/**
 *  ConcreteProtoType 具体原型类角色
 * @author Glimmer
 *
 */
public class Rectangle extends Shape{

	
	public Rectangle() {
		type="Rectangle";
	}

	@Override
	public void drawing() {
		System.out.println("Inside Rectangle :: drawing method");
	}

}
