package animals;

import java.util.Objects;

public class Birds extends Animals{

    private String livingEnvironment;

    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        if (livingEnvironment== null || livingEnvironment.isEmpty() || livingEnvironment.isBlank())
            System.out.println("Неверное значение");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    public void eat() {
        System.out.println("Я питаюсь всевозможными насекомыми и другими беспозвоночными," +
                " семенами, плодами и зелеными частями растений, нектаром цветов, рыбой");
    }

    @Override
    public void go() {
        System.out.println("Я летаю");
    }

    public void hunting() {
        System.out.println("Я - птица, и я охочусь");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return livingEnvironment.equals(birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
