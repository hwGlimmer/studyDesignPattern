package com.Glimmer.BuildType.BuildPattern;

/**
 * ConceteProduce 具体产品角色
 * @author Glimmer
 *
 */
public class MealA extends MealBuilder{

	@Override
	public void produceFood() {
		meal.setFood("鸡翅");
	}

	@Override
	public void produceDrink() {
		meal.setDrink("可乐");
	}

}
