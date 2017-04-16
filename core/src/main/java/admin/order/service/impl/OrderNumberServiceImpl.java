package admin.order.service.impl;

import admin.order.dto.OrderNumber;
import admin.order.mapper.OrderNumberMapper;
import admin.order.service.IOrderNumberService;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * Created by 王也 on 2017/4/15.
 */
@Service
public class OrderNumberServiceImpl extends BaseServiceImpl<OrderNumber> implements IOrderNumberService{
    /**
     * 订单号输出长度
     */
    private String numberLengthFormat;
    {
        StringBuffer sb=new StringBuffer("%0");
        sb.append(NUMBER_LENGTH);
        sb.append("d");
        numberLengthFormat=sb.toString();
    }
    @Autowired
    private OrderNumberMapper orderNumberMapper;

    private OrderNumber selectOnlyOrderNumber() {
        return orderNumberMapper.selectOnlyOrderNumber();
    }

    private void updateOrderNumberDate(){
        orderNumberMapper.updateOrderNumberDate();
    }

    private void updateOrderNumberAdd(){
        orderNumberMapper.updateOrderNumberAdd();
    }

    private void commit(){
        //orderNumberMapper.commit();
    }

    @Override
    public String getOrderNumber(){
        OrderNumber one = selectOnlyOrderNumber();
        SimpleDateFormat format=new SimpleDateFormat(DATE_FORMAT);
        if(format.format(new Date(System.currentTimeMillis())).equals(format.format(one.getOrderDate()))){
            StringBuffer sb=new StringBuffer(format.format(one.getOrderDate()));
            sb.append(String.format(numberLengthFormat,one.getNumber()));
            updateOrderNumberAdd();
            commit();
            return sb.toString();
        }
        else{
            updateOrderNumberDate();
            commit();
            return getOrderNumber();
        }
    }
}
