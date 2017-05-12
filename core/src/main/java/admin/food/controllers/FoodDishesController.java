package admin.food.controllers;

import admin.food.dto.FoodDishes;
import admin.food.service.IFoodDishesService;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 王也 on 2017/4/21.
 */
@RestController
@RequestMapping(path = "/food/dishes")
public class FoodDishesController extends BaseController{
    @Autowired
    private IFoodDishesService foodDishesService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseData query(FoodDishes foodDishes,
                              @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize,
                              HttpServletRequest request){
        return new ResponseData(foodDishesService.select(createRequestContext(request),foodDishes,page,pageSize));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseData submit(HttpServletRequest request, @RequestBody List<FoodDishes> foodDishes){
        return new ResponseData(foodDishesService.batchUpdate(createRequestContext(request),foodDishes));
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseData delete(@RequestBody List<FoodDishes> foodDishes){
        foodDishesService.batchDelete(foodDishes);
        return new ResponseData();
    }

    @RequestMapping(path = "/one",method = RequestMethod.GET)
    public FoodDishes getOneById(HttpServletRequest request,FoodDishes foodDishes){
        return foodDishesService.selectByPrimaryKey(createRequestContext(request), foodDishes);
    }

    @RequestMapping(path = "/one",method = RequestMethod.POST)
    public ResponseData saveOneById(HttpServletRequest request,
                                  @RequestBody FoodDishes foodDishes){
        foodDishesService.updateOneDishes(foodDishes,foodDishes.getTypes());
        return new ResponseData();
    }
}
