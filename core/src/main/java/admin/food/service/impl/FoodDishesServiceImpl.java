package admin.food.service.impl;

import admin.food.dto.FoodCuisine;
import admin.food.dto.FoodDishes;
import admin.food.mapper.FoodDishesMapper;
import admin.food.service.IFoodDishesService;
import admin.food.service.IFoodDishesTypeService;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 王也 on 2017/4/21.
 */
@Service
@Transactional
public class FoodDishesServiceImpl extends BaseServiceImpl<FoodDishes> implements IFoodDishesService{
    @Autowired
    private FoodDishesMapper foodDishesMapper;

    @Autowired
    private IFoodDishesTypeService foodDishesTypeService;

    /**
     * 查询该菜系下的菜品
     * @param foodCuisine 菜系信息
     * @return 对应菜系下的所有菜品
     */
    public List<FoodDishes> selectFoodDishesInThisCuisine(FoodCuisine foodCuisine){
        return foodDishesMapper.selectFoodDishesInThisCuisine(foodCuisine);
    }

    /**
     * 单一菜品保存
     * @param foodDishes 菜品
     * @param types 菜品对应的类型
     */
    public void updateOneDishes(FoodDishes foodDishes,List<Long> types){
        /**
         * 保存菜品
         */
        foodDishesMapper.updateByPrimaryKey(foodDishes);
        /**
         * 保存菜品对应的菜系
         */
        foodDishesTypeService.updateTypesByDishesId(foodDishes.getId(),types);
    }
}
