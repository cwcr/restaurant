package admin.food.mapper;


/**
 * Created by 王也 on 2017/4/22.
 */
import com.hand.hap.mybatis.common.Mapper;
import admin.food.dto.FoodType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodTypeMapper extends Mapper<FoodType>{
    List<FoodType> getUsedTypes();
}