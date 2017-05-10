package admin.food.controllers;

/**
 * Created by 王也 on 2017/4/22.
 */
import admin.food.dto.FoodType;
import admin.food.service.IFoodDishesTypeService;
import admin.food.service.IFoodTypeService;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping(path = "/food/type")
public class FoodTypeController extends BaseController {

    @Autowired
    private IFoodTypeService foodTypeService;

    private IFoodDishesTypeService foodDishesTypeService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseData query(FoodType dto,
                              @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize,
                              HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(foodTypeService.select(requestContext, dto, page, pageSize));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseData update(HttpServletRequest request, @RequestBody List<FoodType> dto) {
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(foodTypeService.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseData delete(HttpServletRequest request, @RequestBody List<FoodType> dto) {
        foodTypeService.batchDelete(dto);
        /*删除该菜系下和对应的菜品的相关关系*/
        foodDishesTypeService.batchDeleteAboutType(dto);
        return new ResponseData();
    }
}