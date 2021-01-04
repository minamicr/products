package Service.Impl;

import Domain.ProductDto;
import Service.ICoupon;
import Service.IDiscount;
import Service.Impl.Discount.DiscountFactory;
import java.math.BigDecimal;
import java.util.List;

public class Coupon implements ICoupon {

  @Override
  public BigDecimal calculateCouponTotal(List<ProductDto> products) {
    IDiscount discount;
    DiscountFactory discountFactory = new DiscountFactory();

    BigDecimal totalCoupon = products.stream()
        .filter(product -> product.getPrice() != null)
        .map(product -> product.getPrice())
        .reduce(BigDecimal.ZERO, (BigDecimal::add));

    BigDecimal totalDiscount = products.stream()
        .filter(product -> product.getPrice() != null && product.getDiscountType() != null)
        .map(product -> discountFactory.getDiscount(product.getDiscountType())
            .calculateDiscount(product.getPrice()))
        .reduce(BigDecimal.ZERO, (BigDecimal::add));

    System.out.println("Total value " + totalCoupon.doubleValue() + " Total Discount " + totalDiscount);

    return totalCoupon.subtract(totalDiscount);
  }


}
