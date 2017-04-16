package admin.order.dto;

import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Table;
import java.util.Date;

/**
 * Created by 王也 on 2017/4/15.
 */
@Table(name = "ORDER_NUMBER")
public class OrderNumber extends BaseDTO{
    private Integer id;
    private Date orderDate;
    private Long number;

    public Integer getId() {
        return id;
    }

    public OrderNumber setId(Integer id) {
        this.id = id;
        return this;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public OrderNumber setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public Long getNumber() {
        return number;
    }

    public OrderNumber setNumber(Long number) {
        this.number = number;
        return this;
    }
}
