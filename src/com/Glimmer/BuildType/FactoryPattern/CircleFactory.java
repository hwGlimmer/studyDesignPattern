package com.Glimmer.BuildType.FactoryPattern;

/**
 * ConcreteFactory 具体工厂角色
 * @author Glimmer
 *
 */
public class CircleFactory implements IFactory {

	@Override
	public IShape produce() {
		 return new Circle();
	}

}
