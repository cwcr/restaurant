package admin.food.dto;

import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 王也 on 2017/4/21.
 */
@Table(name = "FOOD_DISHES")
public class FoodDishes extends BaseDTO{
    @Id
    @Column
    @GeneratedValue(generator = "IDENTITY")
    private Long id;
    @Column
    private String foodName;
    @Column
    private String foodPicture;
    @Column
    private String foodDescription;
    @Column
    private String used;
    @Column
    private Long foodCuisineId;

    public Long getFoodCuisineId() {
        return foodCuisineId;
    }

    public FoodDishes setFoodCuisineId(Long foodCuisineId) {
        this.foodCuisineId = foodCuisineId;
        return this;
    }

    public Long getId() {
        return id;
    }

    public FoodDishes setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFoodName() {
        return foodName;
    }

    public FoodDishes setFoodName(String foodName) {
        this.foodName = foodName;
        return this;
    }

    public String getFoodPicture() {
        return foodPicture;
    }

    public FoodDishes setFoodPicture(String foodPicture) {
        this.foodPicture = foodPicture;
        return this;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public FoodDishes setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
        return this;
    }

    public String getUsed() {
        return used;
    }

    public FoodDishes setUsed(String used) {
        this.used = used;
        return this;
    }
}
