package admin.food.controllers;

import admin.food.dto.FoodCuisine;
import admin.food.service.IFoodCuisineService;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by 王也 on 2017/4/21.
 */
@RestController
@RequestMapping(path = "/food/cuisine")
public class FoodCuisineController extends BaseController{
    @Autowired
    private IFoodCuisineService foodCuisineService;

    @RequestMapping(path = "/submit",method = RequestMethod.POST)
    public ResponseData addCuisine(HttpServletRequest request,
                                   @RequestBody List<FoodCuisine> foodCuisines){
        return new ResponseData(foodCuisineService.batchUpdate(createRequestContext(request),foodCuisines));
    }

    @RequestMapping(path = "/select",method = RequestMethod.GET)
    public ResponseData getCuisine(HttpServletRequest request,
                                   FoodCuisine foodCuisine,
                                   int page,
                                   int pageSize){
        return new ResponseData(foodCuisineService.select(createRequestContext(request),foodCuisine,page,pageSize));
    }

    @RequestMapping(path = "/delete",method = RequestMethod.DELETE)
    public ResponseData deleteCuisine(FoodCuisine foodCuisine){
        return null;
    }
}
