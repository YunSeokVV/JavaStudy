package ch07.DI;

public class JungAcDiscount implements Discount{
    @Override
    public Integer getDiscountName(Integer price) {
        return price - 1000;
    }
}
