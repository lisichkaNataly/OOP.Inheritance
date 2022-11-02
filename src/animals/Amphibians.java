package animals;

import java.util.Objects;

public class Amphibians extends Animals{

    private String livingEnvironment;

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        if (livingEnvironment== null || livingEnvironment.isEmpty() || livingEnvironment.isBlank())
            System.out.println("Неверное значение");
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    @Override
    protected void eat() {
        System.out.println("Я питаюсь мелкими животными, в основном насекомыми и беспозвоночными");
    }

    @Override
    protected void go() {
        System.out.println("Я плаваю и хожу");
    }

    protected void hunting() {
        System.out.println("Я - земноводное, и я охочусь");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return livingEnvironment.equals(that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    public void printAmphibians() {
        System.out.println(" Земноводное: " + getName() +
                " " + getAge() + " лет" +
                ", среда обитания: " + getLivingEnvironment() +
                ", относится к классу: " + getClass());
    }
}
