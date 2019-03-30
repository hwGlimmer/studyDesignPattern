package com.Glimmer.BuildType.AbstractFactoryPattern;

/**
 * ConcreteFactory 具体工厂角色
 * @author Glimmer
 *
 */
public class AKFactory implements IFactory {

	@Override
	public Gun produceGUn() {
		// TODO Auto-generated method stub
		return new AK_Gun();
	}
	@Override
	public Bullet produceBullet() {
		// TODO Auto-generated method stub
		return  new AK_Bullet();
	}

}
