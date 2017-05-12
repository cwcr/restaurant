package admin.food.dto;

import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.*;
import java.util.List;

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
    private String cuisineId;
    @Column
    private Double foodPrice;
    @Column
    private Double foodSpecialPrice;
    @Column
    private String usedSpecial;
    @Transient
    private List<Long> types;

    public List<Long> getTypes() {
        return types;
    }

    public FoodDishes setTypes(List<Long> types) {
        this.types = types;
        return this;
    }

    public String getCuisineId() {
        return cuisineId;
    }

    public FoodDishes setCuisineId(String cuisineId) {
        this.cuisineId = cuisineId;
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

    public Double getFoodPrice() {
        return foodPrice;
    }

    public FoodDishes setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
        return this;
    }

    public Double getFoodSpecialPrice() {
        return foodSpecialPrice;
    }

    public FoodDishes setFoodSpecialPrice(Double foodSpecialPrice) {
        this.foodSpecialPrice = foodSpecialPrice;
        return this;
    }

    public String getUsedSpecial() {
        return usedSpecial;
    }

    public FoodDishes setUsedSpecial(String usedSpecial) {
        this.usedSpecial = usedSpecial;
        return this;
    }
}
