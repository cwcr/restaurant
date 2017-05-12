package admin.food.service;

import admin.food.dto.FoodCuisine;
import admin.food.dto.FoodDishes;
import com.hand.hap.system.service.IBaseService;

import java.util.List;

/**
 * Created by 王也 on 2017/4/21.
 */
public interface IFoodDishesService extends IBaseService<FoodDishes>{
    /**
     * 查询该菜系下的菜品
     * @param foodCuisine 菜系信息
     * @return 对应菜系下的所有菜品
     */
    List<FoodDishes> selectFoodDishesInThisCuisine(FoodCuisine foodCuisine);

    /**
     * 单一菜品保存
     * @param foodDishes 菜品
     * @param types 菜品对应的类型
     */
    public void updateOneDishes(FoodDishes foodDishes,List<Long> types);
}
