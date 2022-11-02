package animals;

import java.util.Objects;

public class Herbivores extends Mammals{
    private String typeOfFood;

    public Herbivores(String name, int age, String livingEnvironment, int speedMovement, String typeOfFood) {
        super(name, age, livingEnvironment, speedMovement);
        if (typeOfFood== null || typeOfFood.isEmpty() || typeOfFood.isBlank())
            System.out.println("Неверное значение");
        this.typeOfFood = typeOfFood;
    }


    public String getTypeOfFood() {
        return typeOfFood;
    }


    @Override
    protected void eat() {
        System.out.println("Я ем траву, листья, ветки, цветы и плоды");
    }

    @Override
    protected void go() {
        System.out.println("Я гуляю там, где комфортно");
    }

    @Override
    protected void sleep() {
        super.sleep();
    }

    @Override
    protected void walk() {
        super.walk();
    }

    protected void graze() {
        System.out.println("Я пасусь");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return typeOfFood.equals(that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    public void  printHerbivores (){
        System.out.println(" Травоядное: " + getName() +
                " " + getAge()+ " лет" +
                ", среда обитания: " +  getLivingEnvironment() +
                ", скорость передвижения: " +  getSpeedMovement() + " км/ч " +
                ", тип пищи: "  +  getTypeOfFood() +
                ", относится к классу: " + getClass());;
    }


}
