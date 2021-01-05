package service.impl.discount;

import service.IDiscount;
import java.math.BigDecimal;

public class DiscountStandard implements IDiscount {

  DiscountStandard() {
  }

  public BigDecimal calculateDiscount(BigDecimal preco) {
    return preco.multiply(new BigDecimal("0.10"));
  }
}
