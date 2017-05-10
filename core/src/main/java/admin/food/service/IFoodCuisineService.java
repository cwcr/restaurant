package admin.food.service;

import admin.food.dto.FoodCuisine;
import com.hand.hap.system.service.IBaseService;

import java.util.List;

/**
 * Created by 王也 on 2017/4/21.
 */
public interface IFoodCuisineService extends IBaseService<FoodCuisine> {
    List<FoodCuisine> getUsedCuisine();
}
