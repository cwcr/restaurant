package admin.food.service.impl;

import admin.food.dto.FoodCuisine;
import admin.food.dto.FoodDishes;
import admin.food.mapper.FoodDishesMapper;
import admin.food.service.IFoodDishesService;
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

    /**
     * 查询该菜系下的菜品
     * @param foodCuisine 菜系信息
     * @return 对应菜系下的所有菜品
     */
    public List<FoodDishes> selectFoodDishesInThisCuisine(FoodCuisine foodCuisine){
        return foodDishesMapper.selectFoodDishesInThisCuisine(foodCuisine);
    }
}
