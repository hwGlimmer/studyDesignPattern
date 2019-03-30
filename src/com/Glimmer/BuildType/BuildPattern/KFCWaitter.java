package com.Glimmer.BuildType.BuildPattern;

/**
 * Director 指挥者角色
 * 构建一个使用Builder的对象
 * 隔离了客户与对象的生产过程
 * 负责控制产品对象的生产过程
 * @author Glimmer
 *
 */
public class KFCWaitter {

	private MealBuilder mealBuilder;
	
	public KFCWaitter(MealBuilder mealBuilder) {
		this.mealBuilder = mealBuilder;
	}

	// 组建产品
	public Meal constract() {
		mealBuilder.produceFood();
		mealBuilder.produceDrink();
		return mealBuilder.getMeal();
	}
   
	
	
}
