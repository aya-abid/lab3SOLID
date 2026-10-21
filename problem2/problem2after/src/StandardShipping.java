public class StandardShipping implements ShippingMethod {

    @Override
    public String name(){
        return "STANDARD";
    }

    @Override
    public double cost(double weightKg){
        return 20 + 5 * weightKg;
    }
}
