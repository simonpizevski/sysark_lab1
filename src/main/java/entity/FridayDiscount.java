package entity;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridayDiscount extends BaseDiscount {
    LocalDate currentDay = LocalDate.now();

    public FridayDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return currentDay.getDayOfWeek() == DayOfWeek.FRIDAY;
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.getProductPrice() * 0.1;
    }

    @Override
    public String getDescription(Product product) {
        return "10% discount on fridays. " + super.getDescription(product);
    }
}
