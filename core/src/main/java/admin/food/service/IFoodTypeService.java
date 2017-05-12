package admin.food.service;
/**
 * Created by 王也 on 2017/4/22.
 */
import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import admin.food.dto.FoodType;

import java.util.List;

public interface IFoodTypeService extends IBaseService<FoodType>, ProxySelf<IFoodTypeService>{
    /**
     * 获取Used为Y的食物类型
     * @return
     */
    List<FoodType> getUsedTypes();
}