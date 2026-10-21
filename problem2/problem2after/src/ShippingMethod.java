public interface ShippingMethod {
    public String name();
    public double cost(double weightKg);
}
