package admin.food.controllers;

import admin.food.service.IFoodDishesTypeService;
import admin.food.service.IFoodTypeService;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 王也 on 2017/5/10.
 */
@RestController
@RequestMapping(path = "/food/dish_type")
public class FoodDishesTypeController extends BaseController{
    @Autowired
    private IFoodTypeService foodTypeService;

    @Autowired
    private IFoodDishesTypeService foodDishesTypeService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseData getAllTypesByDishesId(HttpServletRequest request,Long dishesId){
        return new ResponseData(foodDishesTypeService.getAllTypesByDishesId(dishesId));
    }
}
