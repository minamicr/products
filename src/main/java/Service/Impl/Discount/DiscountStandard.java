package Service.Impl.Discount;

import Service.IDiscount;
import java.math.BigDecimal;

public class DiscountStandard implements IDiscount {

  DiscountStandard() {
    System.out.println("Using PriceTableStandard");
  }

  public BigDecimal calculateDiscount(BigDecimal preco) {
    return preco.multiply(new BigDecimal("0.10"));
  }
}
