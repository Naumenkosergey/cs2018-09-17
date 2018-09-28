package by.it.naumenko.lesson06;

public class Dog {

    public Dog() {
    }

    private String name;
    private int age;
    private int veigth;
    private double power;

    public int getVeigth() {
        return veigth;
    }

    public void setVeigth(int veigth) {
        this.veigth = veigth;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, int age, int veigth, double power) {
        this.name = name;
        this.age = age;
        this.veigth = veigth;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Кличка: " + this.name + ". Возраст: " + this.age;
    }

    public boolean win(Dog otherDog) {
        double myshans = 0.2 * this.age + 0.3 * this.veigth + 0.5 * this.power;
        double othShans = 0.2 * otherDog.age + 0.3 * otherDog.veigth + 0.5 * otherDog.power;
        return myshans>othShans;
    }
}

