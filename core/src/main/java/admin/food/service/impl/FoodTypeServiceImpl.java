package admin.food.service.impl;
/**
 * Created by 王也 on 2017/4/22.
 */
import admin.food.mapper.FoodTypeMapper;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import admin.food.dto.FoodType;
import admin.food.service.IFoodTypeService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FoodTypeServiceImpl extends BaseServiceImpl<FoodType> implements IFoodTypeService{
    @Autowired
    private FoodTypeMapper foodTypeMapper;

    @Override
    public List<FoodType> getUsedTypes() {
        return foodTypeMapper.getUsedTypes();
    }
}