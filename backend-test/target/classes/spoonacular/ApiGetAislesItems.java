package spoonacular;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;


// POJO
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiGetAislesItems {
    private Integer id;
    private String name;
    private List<ApiAddMeasures> measures;
    private Arrays usages;
    private Arrays usageRecipeIds;
    private float pantryItem;
    private String aisle;
    private Long cost;
    private Integer ingredientId;

}
