import org.w3c.dom.ls.LSOutput;
import transport.Bus;
import transport.Car;
import transport.Train;

import javax.print.attribute.standard.PrinterInfo;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada",
                "Granta",
                1.7,
                "желтый",
                2015,
                "Россия",
                "МКПП",
                "седан",
                "х000хх000",
                5,
                true, new Car.Key(), new Car.Insurance());
        lada.setRegNumber("М640ЕС159");
        System.out.println(lada.isCorrectRegNumber());

        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                3.0,
                null,
                2020,
                "Германия",
                "МКПП",
                "седан",
                "х000хх000",
                5,
                true, new Car.Key(), new Car.Insurance());
        audi.setGears("Автомат");
        audi.setKey(new Car.Key(true, true));



        Car bmv = new Car("BMV",
                "Z8",
                3.0,
                "черный",
                0,
                "Германия",
                "МКПП",
                "седан",
                "х000хх000",
                5,
                true, new Car.Key(), new Car.Insurance());
        bmv.setSummerTyres(false);
        bmv.setInsurance(new Car.Insurance(LocalDate.now(), 30_000, "748494726"));
        bmv.getInsurance().checkExpireDate();
        bmv.getInsurance().checkNumber();



        Car kia = new Car("KIA",
                "Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "Южная Корея",
                "МКПП",
                "седан",
                "х000хх000",
                5,
                true, new Car.Key(), new Car.Insurance());


        Car hyundai = new Car("Hyundai",
                "Avante",
                0,
                "оранжевый",
                2016,
                "Южная Корея",
                "МКПП",
                "седан",
                "х000хх000",
                5,
                true, new Car.Key(), new Car.Insurance());

        printInfo(lada);
        lada.refill();
        printInfo(audi);
        audi.refill();
        printInfo(bmv);
        bmv.refill();
        printInfo(kia);
        kia.refill();
        printInfo(hyundai);
        hyundai.refill();


        Train lastochka = new Train("Ласточка",
                "B-901",
                2011,
                "Россия",
                301,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                3500,
                11);
        Train leningrad = new Train("Ленинград",
                "D-125",
                2019,
                "Россия",
                270,
                "Ленинградский вокзал",
                "Ленинград-пассажирский",
                1700,
                8);

        printInfo(lastochka);
        lastochka.refill();
        printInfo(leningrad);
        leningrad.refill();

        Bus maz = new Bus("Маз",
                "232",
                2014,
                "Россия",
                "белый",
                100);
        Bus gaz = new Bus("Газ",
                "Вектор Next",
                2016,
                "Россия",
                "голубой",
                200);
        Bus man = new Bus("MAN",
                "Lion’s Coach",
                2020,
                "Германия",
                "зеленый",
                360);

        printInfo(maz);
        maz.refill();
        printInfo(gaz);
        gaz.refill();
        printInfo(man);
        man.refill();
    }

    private static void printInfo(Car car) {
        System.out.println("Марка автомобиля " + car.getBrand() +
                ", модель " + car.getModel() +
                ", объем двигателя " + car.getEngineVolume() +
                ", цвет кузова: " + car.getColor() +
                ", год выпуска: " + car.getProductionYear() +
                ", страна производства: " + car.getProductionCountry() +
                ", коробка передач: " + car.getGears() +
                ", тип кузова: " + car.getTypeOfBody() +
                ", регистрационный номер: " + car.getRegNumber() +
                ", количество мест: " + car.getSeatCount() +
                ", " + (car.isSummerTyres() ? "летняя" : "зимняя") + " резина" +
                ", " + (car.getKey().isWithoutKeyAccess() ? "безключевой доступ" : "ключевой доступ") +
                ", " + (car.getKey().isRemoteRunEngine() ? "удаленный запуск" : "обычный запуск") +
                ", номер страховки: " + car.getInsurance().getNumber() +
                ", стоимость страховки: " + car.getInsurance().getCost() +
                ", срок действия страховки: " + car.getInsurance().getExpireDate());

    }
    private static void printInfo(Train train) {
        System.out.println("Поезд: " + train.getBrand()+
                ", страна производства: " + train.getProductionCountry() +
                ", модель: " + train.getModel() +
                ", год выпуска " + train.getProductionYear() +
                ", скорость передвижения " + train.getMaximumSpeed() +
                ", отходит от станции " + train.getNameDepartureStation() +
                ", и прибывает на станцию " + train.getFinalStop() +
                ", цена поездки " + train.getPriceTrip() + " рублей" +
                ", у поезда " + train.getNumberWagons() + " вагонов");
    }

    private static void printInfo(Bus bus) {
        System.out.println("Автобус: " + bus.getBrand()+
                ", модель: " + bus.getModel() +
                ", год выпуска: " + bus.getProductionYear() +
                ", страна производства: " + bus.getProductionCountry() +
                ", скорость передвижения: " + bus.getMaximumSpeed() + " км/ч" +
                ", цвет " + bus.getColor());
    }

}