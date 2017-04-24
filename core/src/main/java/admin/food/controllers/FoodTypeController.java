package admin.food.controllers;

/**
 * Created by 王也 on 2017/4/22.
 */
import admin.food.dto.FoodType;
import admin.food.service.IFoodTypeService;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class FoodTypeController extends BaseController {

    @Autowired  
    private IFoodTypeService service;


    @RequestMapping(value = "/food/type/query")
    public ResponseData query(FoodType dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.select(requestContext, dto, page, pageSize));
    }

    @RequestMapping(value = "/food/type/submit")
    public ResponseData update(HttpServletRequest request, @RequestBody List<FoodType> dto) {
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(value = "/food/type/remove")
    public ResponseData delete(HttpServletRequest request, @RequestBody List<FoodType> dto) {
        service.batchDelete(dto);
        return new ResponseData();
    }
}