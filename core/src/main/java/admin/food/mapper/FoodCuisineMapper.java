package admin.food.mapper;

import admin.food.dto.FoodCuisine;
import com.hand.hap.mybatis.common.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 王也 on 2017/4/21.
 */
@Repository
public interface FoodCuisineMapper extends Mapper<FoodCuisine>{
    List<FoodCuisine> getUsedCuisine();
}
