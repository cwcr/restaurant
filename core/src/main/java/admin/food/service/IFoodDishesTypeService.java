package admin.food.service;

import admin.food.dto.FoodDishes;
import admin.food.dto.FoodType;

import java.util.List;

/**
 * Created by 王也 on 2017/5/8.
 */
public interface IFoodDishesTypeService {
    /**
     * 根据种类id删除菜系相关关系
     * @param id
     * @return 影响的行数
     */
    int deleteAboutType(Long id);
    /**
     * 根据种类列表批量删除菜系相关关系
     * @param types
     */
    void batchDeleteAboutType(List<FoodType> types);
    /**
     * 根据菜品id删除菜系相关关系
     * @param id
     * @return 影响的行数
     */
    int deleteAboutDishes(Long id);
    /**
     * 根据菜品列表批量删除菜系相关关系
     * @param dishes
     */
    void batchDeleteAboutDishes(List<FoodDishes> dishes);
}
