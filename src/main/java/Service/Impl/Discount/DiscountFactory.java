package Service.Impl.Discount;

import Domain.Enumeration.DiscountType;
import Service.IDiscount;

public class DiscountFactory {

  public IDiscount getDiscount (DiscountType discountType){
    IDiscount discount = null;

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
    }

    return discount;
  }

}
