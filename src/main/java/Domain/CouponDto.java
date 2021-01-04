package Domain;

import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class CouponDto {
  Integer number;
  LocalDate data;
  List<ProductDto> products;

}
