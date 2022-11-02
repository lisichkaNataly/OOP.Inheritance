package animals;

import java.util.Objects;

public abstract class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
        if (name== null || name.isEmpty() || name.isBlank())
            System.out.println("Неверное значение");
        if (age == 0 || age <0 )
            System.out.println("Неверное значение");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name== null || name.isEmpty() || name.isBlank())
            System.out.println("Неверное значение");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age == 0 || age <0 )
            System.out.println("Неверное значение");
        this.age = age;
    }

    protected void eat() {
    }

    protected void sleep() {
    }

    protected void go() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
