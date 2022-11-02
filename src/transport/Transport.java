package transport;

import java.awt.*;

public abstract class Transport {
    private String brand;
    private String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maximumSpeed;

    public Transport(int productionYear, String productionCountry) {
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maximumSpeed) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.maximumSpeed = maximumSpeed;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank())
            System.out.println("Неверное значение");
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model== null || model.isEmpty() || model.isBlank())
            System.out.println("Неверное значение");
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }


    public String getProductionCountry() {
        return productionCountry;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank())
            System.out.println("Неверное значение");
        this.color = color;;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        if (maximumSpeed == 0 || maximumSpeed <0 )
            System.out.println("Неверное значение");
        this.maximumSpeed = maximumSpeed;
    }

    public abstract void refill();

}
