package admin.order.service;

import admin.order.dto.OrderNumber;
import com.hand.hap.system.service.IBaseService;

/**
 * Created by 王也 on 2017/4/15.
 */
public interface IOrderNumberService extends IBaseService<OrderNumber> {
    /**
     * 设置订单输出的日期格式
     */
    String DATE_FORMAT="yyyyMMdd";

    /**
     * 设置订单编号的长度
     */
    int NUMBER_LENGTH=6;

    /**
     * 获取一个唯一的订单号
     * 订单号=日期+订单编号
     * @return
     */
    String getOrderNumber();
}
