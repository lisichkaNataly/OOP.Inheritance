package transport;

public class Train extends Transport {
    private int priceTrip;
    private int travelTime;
    private String nameDepartureStation;
    private String finalStop;
    private int numberWagons;

    public Train(String brand, String model,
                 int productionYear, String productionCountry,
                 int maximumSpeed, String nameDepartureStation, String finalStop,
                 int priceTrip, int numberWagons) {
        super(brand, model, productionYear, productionCountry, String.valueOf(maximumSpeed));
        this.priceTrip = priceTrip;
        this.nameDepartureStation = nameDepartureStation;
        this.finalStop = finalStop;
        this.numberWagons = numberWagons;
    }

    public int getPriceTrip() {
        return priceTrip;
    }

    public void setPriceTrip(int priceTrip) {
        if (priceTrip <= 0 )
            System.out.println("Неверное значение");
        this.priceTrip = priceTrip;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        if (travelTime <= 0 )
            System.out.println("Неверное значение");
        this.travelTime = travelTime;
    }

    public String getNameDepartureStation() {
        return nameDepartureStation;
    }

    public void setNameDepartureStation(String nameDepartureStation) {
        if (nameDepartureStation == null || nameDepartureStation.isEmpty() || nameDepartureStation.isBlank())
            System.out.println("Неверное значение");
        this.nameDepartureStation = nameDepartureStation;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        if (finalStop == null || finalStop.isEmpty() || finalStop.isBlank())
            System.out.println("Неверное значение");
        this.finalStop = finalStop;
    }

    public int getNumberWagons() {
        return numberWagons;
    }

    public void setNumberWagons(int numberWagons) {
        if (numberWagons <= 0 )
            System.out.println("Неверное значение");
        this.numberWagons = numberWagons;
    }




}
