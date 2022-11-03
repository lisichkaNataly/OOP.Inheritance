import org.w3c.dom.ls.LSOutput;
import transport.Bus;
import transport.Car;
import transport.Train;

import javax.print.attribute.standard.PrinterInfo;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // автомобили
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


        lada.printCar();
        lada.refill();
        audi.printCar();
        audi.refill();
        bmv.printCar();
        bmv.refill();
        kia.printCar();
        kia.refill();
        hyundai.printCar();
        hyundai.refill();

        //поезда
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
        lastochka.printTrain();
        lastochka.refill();
        leningrad.printTrain();
        leningrad.refill();

        //автобусы

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

        maz.printBus();
        maz.refill();
        gaz.printBus();
        gaz.refill();
        man.printBus();
        man.refill();
    }

}