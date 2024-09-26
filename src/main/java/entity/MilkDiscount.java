package entity;

public class MilkDiscount extends BaseDiscount{

    public MilkDiscount(Discount nextDiscount) {
        super(nextDiscount);
    }

    @Override
    protected boolean isApplicable(Product product) {
        return product.getProductName().equals("Milk");
    }

    @Override
    protected double calculateDiscount(Product product) {
        return product.getProductPrice() * 0.5;
    }

    @Override
    public void apply(Product product) {
        super.apply(product);
    }

    @Override
    public void getDescription(Product product) {
        super.getDescription(product);
    }
}
