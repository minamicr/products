package service.impl;

import domain.enumeration.DiscountType;
import domain.ProductDto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CouponTest {

  @Test
  void givenProductListWhenCalculateCouponTotalThenReturnValidTotal () {
    List<ProductDto> products = new ArrayList<>();
    products.add(new ProductDto("Lapis", new BigDecimal("2.00"), "", DiscountType.SPECIAL));
    products.add(new ProductDto("Caneta", new BigDecimal("2.00"), "", DiscountType.STANDARD));
    products.add(new ProductDto("Borracha", new BigDecimal("2.00"), "", DiscountType.NONE));

    Coupon coupon = new Coupon();
    BigDecimal result = coupon.calculateCouponTotal(products);

    Assertions.assertEquals(4.80, result.doubleValue());
  }

  @Test
  void givenProductListWithNullPriceWhenCalculateCouponTotalThenReturnValidTotal() {
    List<ProductDto> products = new ArrayList<>();
    products.add(new ProductDto("Lapis", null, "", DiscountType.SPECIAL));
    products.add(new ProductDto("Caneta", new BigDecimal("2.00"), "", DiscountType.STANDARD));
    products.add(new ProductDto("Borracha", new BigDecimal("2.00"), "", DiscountType.NONE));

    Coupon coupon = new Coupon();
    BigDecimal result = coupon.calculateCouponTotal(products);

    Assertions.assertEquals(3.80, result.doubleValue());

  }

  @Test
  void givenProductListWithoutDiscountWhenCalculateCouponTotalThenReturnValidTotal(){
    List<ProductDto> products = new ArrayList<>();
    products.add(new ProductDto("Lapis", new BigDecimal("2.00"), "", null));
    products.add(new ProductDto("Caneta", new BigDecimal("2.00"), "", DiscountType.STANDARD));
    products.add(new ProductDto("Borracha", new BigDecimal("2.00"), "", DiscountType.NONE));

    Coupon coupon = new Coupon();
    BigDecimal result = coupon.calculateCouponTotal(products);

    Assertions.assertEquals(5.80, result.doubleValue());

  }
}