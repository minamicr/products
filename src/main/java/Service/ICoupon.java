package Service;

import Domain.ProductDto;
import java.math.BigDecimal;
import java.util.List;

public interface ICoupon {

  BigDecimal calculateCouponTotal(List<ProductDto> products);
}
