package com.Glimmer.BuildType.AbstractFactoryPattern;

/**
 * ConcreteFactroy 具体工厂角色
 * @author Glimmer
 *
 */
public class M4A1Factory implements IFactory {

	@Override
	public Gun produceGUn() {
		// TODO Auto-generated method stub
		return new M4A1_Gun();
	}

	@Override
	public Bullet produceBullet() {
		// TODO Auto-generated method stub
		return new M4A1_Bullet();
	}

}
