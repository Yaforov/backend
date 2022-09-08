package spoonacular;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// POJO
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiAddAmountUnit {
    private Long amount;
    private String unit;
}
