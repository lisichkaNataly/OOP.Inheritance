package animals;

import java.util.Objects;

public class Mammals extends  Animals{

    private String livingEnvironment;
    private int speedMovement;

    public Mammals(String name, int age, String livingEnvironment, int speedMovement) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        this.speedMovement = speedMovement;
        if (speedMovement == 0 || age <0 )
            System.out.println("Неверное значение");
        if (livingEnvironment== null || livingEnvironment.isEmpty() || livingEnvironment.isBlank())
            System.out.println("Неверное значение");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getSpeedMovement() {
        return speedMovement;
    }

    @Override
    public void eat() {
        System.out.println("Я ем мясо и растения");
    }

    @Override
    public void go() {
        System.out.println("Я хожу");
    }

    public void walk() {
        System.out.println("Я гуляю");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return speedMovement == mammals.speedMovement && livingEnvironment.equals(mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speedMovement);
    }
}
