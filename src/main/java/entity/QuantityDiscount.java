package entity;

public class QuantityDiscount extends BaseDiscount {

    public QuantityDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return product.getQuantity() > 5;
    }

    @Override
    protected double calculateDiscount(Product product) {
        return 10 * product.getQuantity();
    }

    @Override
    public String getDescription(Product product) {
        return "If you buy 5 or more items you get a 10kr discount on every item" + super.getDescription(product);
    }
}
