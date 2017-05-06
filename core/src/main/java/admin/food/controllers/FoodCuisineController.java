package admin.food.controllers;

import admin.food.dto.FoodCuisine;
import admin.food.dto.FoodDishes;
import admin.food.service.IFoodCuisineService;
import admin.food.service.IFoodDishesService;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.CodeValue;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王也 on 2017/4/21.
 */
@RestController
@RequestMapping(path = "/food/cuisine")
public class FoodCuisineController extends BaseController{
    @Autowired
    private IFoodCuisineService foodCuisineService;

    @Autowired
    private IFoodDishesService foodDishesService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseData addCuisine(HttpServletRequest request,
                                   @RequestBody List<FoodCuisine> foodCuisines){
        return new ResponseData(foodCuisineService.batchUpdate(createRequestContext(request),foodCuisines));
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseData getCuisine(HttpServletRequest request,
                                   FoodCuisine foodCuisine,
                                   int page,
                                   int pageSize){
        return new ResponseData(foodCuisineService.select(createRequestContext(request),foodCuisine,page,pageSize));
    }

    /**
     * 删除逻辑
     * 判断该菜系下是否存在菜品
     *   存在：删除失败，并返回该菜系下对应的菜品列表
     *   不存在：删除成功
     * @param foodCuisine
     * @return
     */
    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseData deleteCuisine(@RequestBody FoodCuisine foodCuisine){
        List<FoodDishes> foodDishes = foodDishesService.selectFoodDishesInThisCuisine(foodCuisine);
        if(foodDishes !=null && foodDishes.size()>0){
            return new ResponseData(foodDishes);
        }
        else{
            foodCuisineService.deleteByPrimaryKey(foodCuisine);
            return new ResponseData();
        }
    }

    /**
     * 返回List<CodeValue> 匹配菜系 id/name
     * @param request
     * @return
     */
    @RequestMapping(path = "/all",method = RequestMethod.GET)
    public ResponseData allDishes(HttpServletRequest request){
        ArrayList<CodeValue> codeValues = new ArrayList<>();
        List<FoodCuisine> cuisines = foodCuisineService.selectAll(createRequestContext(request));
        if(cuisines!=null){
            return new ResponseData(codeValues);
        }
        for(FoodCuisine f:cuisines){
            CodeValue c = new CodeValue();
            c.setValue(f.getId().toString());
            c.setMeaning(f.getCuisineName());
        }
        return new ResponseData(codeValues);
    }
}
