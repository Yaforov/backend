package spoonacular;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


// POJO
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiGetAisles {
    private String aisle;
    private List<ApiGetAislesItems> items;

}
