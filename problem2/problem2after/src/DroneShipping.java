public class DroneShipping implements ShippingMethod {

    @Override
    public String name(){
        return "DRONE";
    }

    @Override
    public double cost(double weightKg) {
        if (weightKg > 2) {
            throw new IllegalArgumentException("Too heavy");
        }

        return 80;
    }
}
