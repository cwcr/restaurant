package admin.food.dto;


/**
 * Created by 王也 on 2017/4/22.
 */
import com.hand.hap.mybatis.annotation.Condition;
import com.hand.hap.mybatis.annotation.ExtensionAttribute;
import com.hand.hap.system.dto.BaseDTO;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@ExtensionAttribute(disable=true)
@Table(name = "FOOD_TYPE")
public class FoodType extends BaseDTO {
    @Id
    @Column
    @GeneratedValue(generator = "IDENTITY")
    private Long id;

    @NotEmpty
    @Column
    @Condition(
            operator = "LIKE"
    )
    private String typeName;
    @Column
    @Condition(
            operator = "LIKE"
    )
    private String typeDescription;
    @Column
    private String used;

    public Long getId() {
        return id;
    }

    public FoodType setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTypeName() {
        return typeName;
    }

    public FoodType setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public FoodType setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
        return this;
    }

    public String getUsed() {
        return used;
    }

    public FoodType setUsed(String used) {
        this.used = used;
        return this;
    }
}
