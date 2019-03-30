package com.Glimmer.BuildType.BuildPattern;

/**
 * 建造者模式：建造者模式：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。 [构建与表示分离，同构建不同表示]
 * @author Glimmer
 *
 */
public class Test {

	public static void main(String[] args) {
		// 想要A套餐
		MealA mealA = new MealA();
		KFCWaitter kfcWaitter = new KFCWaitter(mealA);
		Meal meal = kfcWaitter.constract();
		
		System.out.println("A套餐：食物-" + meal.getFood() +" 饮料-" + meal.getDrink());
	}
}
