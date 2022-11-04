package animals;

import transport.Car;

public class Main {
    public static void main(String[] args) {
        //травоядные
        Herbivores giraffe = new Herbivores(
                "Жираф",
                5,
                "тропические степи с редко растущими деревьями",
                55,
                "листья деревьев" );
        Herbivores gazelle = new Herbivores(
                "Газель",
                2,
                "полупустыни и пустыни",
                50,
                "трава и листья");
        Herbivores horse = new Herbivores(
                "Лошадь",
                4,
                "степная зона Европы, Азии",
                60,
                "трава и корма");

        gazelle.printHerbivores();
        giraffe.printHerbivores();
        horse.printHerbivores();

        //хищники
        Predators hyena = new Predators(
                "Гиена",
                1,
                "пустыни, кустарники, леса",
                65,
                "падаль, мелкие или ослабленные животными");
        Predators tiger = new Predators(
                "Тигр",
                10,
                "тропические леса, полупустыни, тайга",
                49,
                "мясо");
        Predators bear = new Predators(
                "Медведь",
                15,
                "от степей до высокогорий, от лесов до арктических льдов",
                50,
                "всеядный");

        hyena.printPredators();
        bear.printPredators();
        tiger.printPredators();

        //земноводные
        Amphibians frog = new Amphibians(
                "Лягушка",
                1,
                "пресноводные водоёмы");
        Amphibians grassSnake = new Amphibians(
                "Уж пресноводный",
                22,
                "в руслах рек, среди зарослей и густых кустарников");
        frog.printAmphibians();
        grassSnake.printAmphibians();

        //нелетающие
        Flightless peacock = new Flightless(
                "Павлин",
                19,
                "в лесах и саваннах",
                "по суше");
        Flightless penguin = new Flightless(
                "Пингвин",
                3,
                "в открытом море",
                "плавание и ныряние");

        peacock.printFlightless();
        penguin.printFlightless();

        //летающие
        Flying seagull = new Flying(
                "Чайка",
                2,
                "везде, где есть море",
                "в воздухе и в воде");
        Flying albatross = new Flying(
                "Альбатрос",
                5,
                "ледяные воды",
                "в воздухе");
        Flying falcon = new Flying(
                "Сокол",
                3,
                "в пустынях, тундре, тайге, лугах, саваннах, кустарниковых лесах, горах",
                "в воздухе");
        seagull.printFlying();
        albatross.printFlying();
        falcon.printFlying();

    }

}
