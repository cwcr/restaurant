package admin.food.dto;

import com.hand.hap.system.dto.BaseDTO;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by 王也 on 2017/4/21.
 */
@Table(name = "FOOD_CUISINE")
public class FoodCuisine extends BaseDTO{
    @Id
    @Column
    @GeneratedValue(generator = "IDENTITY")
    private Long id;
    @Column
    private String cuisineName;
    @Column
    private String cuisineDescription;
    @Column
    private String used;

    public Long getId() {
        return id;
    }

    public FoodCuisine setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCuisineName() {
        return cuisineName;
    }

    public FoodCuisine setCuisineName(String cuisineName) {
        this.cuisineName = cuisineName;
        return this;
    }

    public String getCuisineDescription() {
        return cuisineDescription;
    }

    public FoodCuisine setCuisineDescription(String cuisineDescription) {
        this.cuisineDescription = cuisineDescription;
        return this;
    }

    public String getUsed() {
        return used;
    }

    public FoodCuisine setUsed(String used) {
        this.used = used;
        return this;
    }
}
