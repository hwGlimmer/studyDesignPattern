package com.Glimmer.BuildType.AbstractFactoryPattern;

/**
 * ConcreteProduct 具体产品角色
 * @author Glimmer
 *
 */
public class AK_Gun implements Gun {

	@Override
	public void shooting() {
		System.out.println("shooting with AK");
	}

}
