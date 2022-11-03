package transport;

public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maximumSpeed) {
        super(brand, model, productionYear, productionCountry, color, maximumSpeed);
    }

    public void printBus() {
        System.out.println("Автобус: " + getBrand()+
                ", модель: " + getModel() +
                ", год выпуска: " + getProductionYear() +
                ", страна производства: " + getProductionCountry() +
                ", скорость передвижения: " + getMaximumSpeed() + " км/ч" +
                ", цвет " + getColor());
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке");
    }


}
