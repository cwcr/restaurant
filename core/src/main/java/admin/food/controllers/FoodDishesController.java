package admin.food.controllers;

import admin.food.service.IFoodDishesService;
import com.hand.hap.system.controllers.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 王也 on 2017/4/21.
 */
@RestController
@RequestMapping(path = "/food/dishes")
public class FoodDishesController extends BaseController{
    @Autowired
    private IFoodDishesService foodDishesService;

}
