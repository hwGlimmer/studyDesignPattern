package com.Glimmer.BuildType.AbstractFactoryPattern;

/**
 * Factory 抽象工厂角色
 * 
 * @author Glimmer
 *
 */
public interface IFactory {

	public Gun produceGUn();
	public Bullet produceBullet();
	
}
