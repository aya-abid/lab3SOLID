public class ExpressShipping implements ShippingMethod {

    @Override
    public String name(){
        return "EXPRESS";
    }

    @Override
    public double cost(double weightKg) {
        return 50 + 8 * weightKg;
    }
}
