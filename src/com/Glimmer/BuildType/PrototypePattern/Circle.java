package com.Glimmer.BuildType.PrototypePattern;

/**
 * ConcreteProtoType 具体原型类角色
 * @author Glimmer
 *
 */
public class Circle extends Shape{

	
	public Circle() {
		type="Circle";
	}

	@Override
	public void drawing() {
		System.out.println("Inside Circle :: drawing method");
	}

}
