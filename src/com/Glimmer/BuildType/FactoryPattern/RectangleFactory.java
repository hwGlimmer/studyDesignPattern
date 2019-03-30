package com.Glimmer.BuildType.FactoryPattern;

/**
 * ConcreteFactory 具体工厂角色
 * @author Glimmer
 *
 */
public class RectangleFactory implements IFactory {

	@Override
	public IShape produce() {
		 return new Rectangle();
	}

}
