package spoonacular;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


// POJO
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiShoppingResultGetList {
    private List<ApiGetAisles> aisles;
    private Long cost;
    private Integer startDate;
    private Integer endDate;
}
