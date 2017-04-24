package admin.food.dto;


/**
 * Created by 王也 on 2017/4/22.
 */
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
    private String typeName;
    @Column
    private String typeDescription;
    @Column
    private String used;


    public void setId(Long id){
         this.id = id;
     }

    public Long getId(){
         return id;
     }

    public void setTypeName(String typeName){
         this.typeName = typeName;
     }

    public String getTypeName(){
         return typeName;
     }

    public void setTypeDescription(String typeDescription){
         this.typeDescription = typeDescription;
     }

    public String getTypeDescription(){
         return typeDescription;
     }

    public void setUsed(String used){
         this.used = used;
     }

    public String getUsed(){
         return used;
     }

}
