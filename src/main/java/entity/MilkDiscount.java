package entity;

public class MilkDiscount extends BaseDiscount{

    public MilkDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return product.getProductName().equalsIgnoreCase("milk");
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.getProductPrice() * 0.05;
    }

    @Override
    public String getDescription(Product product) {
        return "5% discount on milk. " + super.getDescription(product);

    }
}
