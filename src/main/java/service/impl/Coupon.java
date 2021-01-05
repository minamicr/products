package service.impl;

import domain.ProductDto;
import service.ICoupon;
import service.impl.discount.DiscountFactory;
import java.math.BigDecimal;
import java.util.List;

public class Coupon implements ICoupon {

  @Override
  public BigDecimal calculateCouponTotal(List<ProductDto> products) {

    BigDecimal totalCoupon = products.stream()
        .filter(product -> product.getPrice() != null)
        .map(ProductDto::getPrice)
        .reduce(BigDecimal.ZERO, (BigDecimal::add));

    BigDecimal totalDiscount = products.stream()
        .filter(product -> product.getPrice() != null && product.getDiscountType() != null)
        .map(product -> DiscountFactory.getDiscount(product.getDiscountType())
            .calculateDiscount(product.getPrice()))
        .reduce(BigDecimal.ZERO, (BigDecimal::add));

    return totalCoupon.subtract(totalDiscount);
  }


}
