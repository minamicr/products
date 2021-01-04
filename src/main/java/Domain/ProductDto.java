package Domain;

import Domain.Enumeration.DiscountType;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
  private String name;
  private BigDecimal price;
  private String description;
  private DiscountType discountType;

}
