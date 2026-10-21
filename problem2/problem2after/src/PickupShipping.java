public class PickupShipping implements ShippingMethod {

    @Override
    public String name() {
        return "PICKUP";
    }

    @Override
    public double cost(double weightKg) {
        if (weightKg < 5) {
            return 0;
        } else {
            return 10;
        }
    }
}