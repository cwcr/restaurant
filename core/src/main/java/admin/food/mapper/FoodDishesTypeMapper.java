package admin.food.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 王也 on 2017/5/8.
 */
@Repository
public interface FoodDishesTypeMapper {
    int deleteAboutType(Long id);
    int deleteAboutDishes(Long id);
    List<Long> getAllTypesByDishesId(Long dishesId);
    void insertTypesByDishesId(@Param(value = "dishesId") Long dishesId,@Param(value = "types") List<Long> types);
}
