package admin.food.service.impl;

import admin.food.dto.FoodCuisine;
import admin.food.dto.FoodDishes;
import admin.food.service.IFoodCuisineService;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 王也 on 2017/4/21.
 */
@Service
@Transactional
public class FoodCuisineServiceImpl extends BaseServiceImpl<FoodCuisine> implements IFoodCuisineService{
    public List<FoodDishes> selectFoodDishesInThisCuisine(FoodCuisine foodCuisine){
        return null;
    }
}