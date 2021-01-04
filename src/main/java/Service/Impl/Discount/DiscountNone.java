package Service.Impl.Discount;

import Service.IDiscount;
import java.math.BigDecimal;

public class DiscountNone implements IDiscount {

  DiscountNone() {
    System.out.println("Using None");
  }

  @Override
  public BigDecimal calculateDiscount(BigDecimal preco) {
    return new BigDecimal("0.00");
  }
}
