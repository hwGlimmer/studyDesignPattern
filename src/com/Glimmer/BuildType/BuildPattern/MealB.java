package com.Glimmer.BuildType.BuildPattern;

/**
 * ConceteProduce 具体产品角色
 * @author Glimmer
 *
 */
public class MealB extends MealBuilder {

	@Override
	public void produceFood() {
		meal.setFood("汉堡");
	}

	@Override
	public void produceDrink() {
		meal.setDrink("柠檬汁");
	}

}
