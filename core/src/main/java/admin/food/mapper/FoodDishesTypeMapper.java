package admin.food.mapper;

import org.springframework.stereotype.Repository;

/**
 * Created by 王也 on 2017/5/8.
 */
@Repository
public interface FoodDishesTypeMapper {
    int deleteAboutType(Long id);
    int deleteAboutDishes(Long id);
}
