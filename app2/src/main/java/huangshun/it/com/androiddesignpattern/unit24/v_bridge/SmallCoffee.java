package huangshun.it.com.androiddesignpattern.unit24.v_bridge;

public class SmallCoffee extends Coffee {

    public SmallCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的" + impl.addSomething() + "咖啡");
    }
}
