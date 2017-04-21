package admin.order.mapper;

import admin.order.dto.OrderNumber;
import com.hand.hap.mybatis.common.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by 王也 on 2017/4/15.
 */
@Repository
public interface OrderNumberMapper extends Mapper<OrderNumber>{
    OrderNumber selectOnlyOrderNumber();
    void updateOrderNumberDate();
    int updateOrderNumberAdd(OrderNumber orderNumber);
    //void commit();
}
