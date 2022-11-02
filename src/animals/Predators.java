package animals;

import java.util.Objects;

public class Predators extends Mammals {
    private String typeOfFood;

    public Predators(String name, int age, String livingEnvironment, int speedMovement, String typeOfFood) {
        super(name, age, livingEnvironment, speedMovement);
        if (typeOfFood == null || typeOfFood.isEmpty() || typeOfFood.isBlank())
            System.out.println("Неверное значение");
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    protected void hunting() {
        System.out.println("Я хищник и я охочусь");
    }

    @Override
    protected void eat() {
        System.out.println("Я ем мясо");
    }

    @Override
    protected void go() {
        System.out.println("Я хожу, где хочу");
    }

    @Override
    protected void walk() {
        super.walk();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return typeOfFood.equals(predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    public void printPredators() {
        System.out.println(" Хищник: " + getName() +
                " " + getAge() + " лет" +
                ", среда обитания: " + getLivingEnvironment() +
                ", скорость передвижения: " + getSpeedMovement() + " км/ч" +
                ", тип пищи: " + getTypeOfFood() +
                ", относится к классу: " + getClass());
    }
}
