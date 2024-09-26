package entity;

public abstract class BaseDiscount implements Discount {
    protected Discount nextDiscount;

    public BaseDiscount(Discount nextDiscount) {
        this.nextDiscount = nextDiscount;
    }

    protected abstract boolean isApplicable(Product product);

    protected abstract double calculateDiscount(Product product);

    @Override
    public double apply(Product product) {
        return calculateDiscount(product);
    }

    @Override
    public String getDescription(Product product) {
        return nextDiscount.getDescription(product);
    }
}
