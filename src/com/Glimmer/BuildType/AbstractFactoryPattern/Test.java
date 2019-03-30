package com.Glimmer.BuildType.AbstractFactoryPattern;

/**
 * 抽象工厂模式:抽象工厂模式是工厂方法的仅一步深化，在这个模式中的工厂类不单单可以创建一种产品，而是可以创建一组产品。
 * 抽象工厂是生产一整套有产品的（至少要生产两个产品)，这些产品必须相互是有关系或有依赖的，而工厂方法中的工厂是生产单一产品的工厂
 * 特点：多个工厂类、多个产品抽象类。
 * @author Glimmer
 *
 */
public class Test {

	public static void main(String[] args) {
		// 想要ak类的枪，子弹
		AKFactory akFactory = new AKFactory();
		Gun gun = akFactory.produceGUn();
		Bullet bullet = akFactory.produceBullet();
		
		gun.shooting();
		bullet.load();
	}
}
