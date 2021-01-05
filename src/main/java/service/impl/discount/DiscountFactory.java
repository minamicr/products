package service.impl.discount;

import domain.enumeration.DiscountType;
import service.IDiscount;

public class DiscountFactory {

  private DiscountFactory() {
  }

  public static IDiscount getDiscount (DiscountType discountType){
    IDiscount discount;

    switch (discountType) {
      case STANDARD:
        discount = new DiscountStandard();
        break;
      case SPECIAL:
        discount = new DiscountSpecial();
        break;
      case NONE:
        discount = new DiscountNone();
        break;
      default:
        discount = new DiscountNone();
    }

    return discount;
  }

}
