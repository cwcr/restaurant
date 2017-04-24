package admin.food.service.impl;

import admin.food.dto.FoodDishes;
import admin.food.service.IFoodDishesService;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 王也 on 2017/4/21.
 */
@Service
@Transactional
public class FoodDishesServiceImpl extends BaseServiceImpl<FoodDishes> implements IFoodDishesService{
}
