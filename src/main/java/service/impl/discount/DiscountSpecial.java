package service.impl.discount;

import service.IDiscount;
import java.math.BigDecimal;

public class DiscountSpecial implements IDiscount {

  DiscountSpecial() {
  }

  public BigDecimal calculateDiscount(BigDecimal preco) {
    return preco.multiply(new BigDecimal("0.50"));
  }
}
