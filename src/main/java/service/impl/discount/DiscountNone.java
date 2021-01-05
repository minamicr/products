package service.impl.discount;

import service.IDiscount;
import java.math.BigDecimal;

public class DiscountNone implements IDiscount {

  DiscountNone() {
  }

  @Override
  public BigDecimal calculateDiscount(BigDecimal preco) {
    return new BigDecimal("0.00");
  }
}
