package com.Glimmer.BuildType.AbstractFactoryPattern;

/**
 * ConcreteProduct 具体产品角色
 * @author Glimmer
 *
 */
public class AK_Bullet implements Bullet {

	@Override
	public void load() {
		System.out.println("Load bullets with AK");
	}

}
