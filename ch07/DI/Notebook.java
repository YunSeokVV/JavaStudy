package ch07.DI;

public class Notebook {
    private String color;
    private int price = 100000;

    Discount discount;

    Notebook(Discount discount){
        this.discount = discount;
    }

    public void setPrice(){
        this.price = discount.getDiscountName(price);
    }


}
