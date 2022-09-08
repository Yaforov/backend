package spoonacular;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// POJO
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiAddMeasures {
    private List<ApiAddAmountUnit> original;
    private List<ApiAddAmountUnit> metric;
    private List<ApiAddAmountUnit> us;
}
