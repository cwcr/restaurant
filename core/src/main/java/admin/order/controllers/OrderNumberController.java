package admin.order.controllers;

import admin.order.service.IOrderNumberService;
import com.hand.hap.system.controllers.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 王也 on 2017/4/16.
 */
@RestController
@RequestMapping(path = "/order/number")
public class OrderNumberController extends BaseController{
    @Autowired
    private IOrderNumberService orderNumberService;

    @RequestMapping(path = "/test")
    public String test(){
        return orderNumberService.getOrderNumber();
    }
}
