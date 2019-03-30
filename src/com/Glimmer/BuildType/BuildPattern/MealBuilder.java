package com.Glimmer.BuildType.BuildPattern;

/**
 * AbstractBuilder 抽象建造者角色
 * @author Glimmer
 *
 */
public abstract class MealBuilder {

	Meal meal =  new Meal();

	public abstract void produceFood();
	public abstract void produceDrink();
	
	public Meal getMeal() {
		return meal;
	}
	
}
