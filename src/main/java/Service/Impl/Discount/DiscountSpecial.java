package Service.Impl.Discount;

import Service.IDiscount;
import java.math.BigDecimal;

public class DiscountSpecial implements IDiscount {

  DiscountSpecial() {
    System.out.println("Using PriceTableSpecial");
  }

  public BigDecimal calculateDiscount(BigDecimal preco) {
    return preco.multiply(new BigDecimal("0.50"));
  }
}
