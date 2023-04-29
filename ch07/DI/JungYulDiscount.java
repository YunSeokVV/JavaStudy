package ch07.DI;

public class JungYulDiscount implements Discount{
    @Override
    public Integer getDiscountName(Integer price) {
        return (int)(price * 0.9);
    }
}
