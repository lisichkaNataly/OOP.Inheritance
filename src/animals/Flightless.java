package animals;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class Flightless extends  Birds{
    private String typeOfMovement;

    public Flightless(String name, int age, String livingEnvironment, String typeOfMovement) {
        super(name, age, livingEnvironment);
        if (typeOfMovement == null || typeOfMovement.isEmpty() || typeOfMovement.isBlank())
            System.out.println("Неверное значение");
        this.typeOfMovement = typeOfMovement;
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }


    @Override
    protected void go() {
        System.out.println("Я не летаю, потому что утратил способность летать в результате эволюции");
    }

    @Override
    protected void eat() {
        System.out.println("Я кушаю");
    }

    protected void walk () {
        System.out.println("Я гуляю");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return typeOfMovement.equals(that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfMovement);
    }

    public void printFlightless() {
        System.out.println(" Нелетающее: " + getName() +
                " " + getAge() + " лет" +
                ", среда обитания: " + getLivingEnvironment() +
                ", тип передвижения: " + getTypeOfMovement() +
                ", относится к классу: " + getClass());
    }

}
