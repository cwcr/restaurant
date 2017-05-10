package admin.food.service.impl;

import admin.food.dto.FoodDishes;
import admin.food.dto.FoodType;
import admin.food.mapper.FoodDishesTypeMapper;
import admin.food.service.IFoodDishesTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 王也 on 2017/5/8.
 */
@Service
@Transactional
public class FoodDishesTypeServiceImpl implements IFoodDishesTypeService {
    @Autowired
    private FoodDishesTypeMapper mapper;
    /**
     * 根据种类id删除菜系相关关系
     * @param id
     * @return 影响的行数
     */
    @Override
    public int deleteAboutType(Long id) {
        return mapper.deleteAboutType(id);
    }
    /**
     * 根据种类列表批量删除菜系相关关系
     * @param types
     */
    @Override
    public void batchDeleteAboutType(List<FoodType> types) {
        if(types!=null){
            for(FoodType type:types){
                deleteAboutType(type.getId());
            }
        }
    }
    /**
     * 根据菜品id删除菜系相关关系
     * @param id
     * @return 影响的行数
     */
    @Override
    public int deleteAboutDishes(Long id) {
        return mapper.deleteAboutDishes(id);
    }
    /**
     * 根据菜品列表批量删除菜系相关关系
     * @param dishes
     */
    @Override
    public void batchDeleteAboutDishes(List<FoodDishes> dishes) {
        if(dishes!=null){
            for(FoodDishes dish:dishes){
                deleteAboutDishes(dish.getId());
            }
        }
    }
}
