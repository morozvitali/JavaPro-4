package src.main.java.homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("asdf");
        Cat cat2 = new Cat("wsgf");
        Cat cat3 = new Cat("axv");
        Dog dog1 = new Dog("zxcv");
        Dog dog2 = new Dog("zxvzxc");
        Dog dog3 = new Dog("fgyuj");
        Dog dog4 = new Dog("rety");
        ArrayList <Run> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        animals.add(dog4);

        for (Run animal : animals) {
            try {
                animal.bigti(2200);
            } catch (MyException e) {
                System.out.println("Сталася помилка " + e.getMessage());
            }
            try {
                animal.plisti(900);
            } catch (MyException e) {
                System.out.println("Сталася помилка " + e.getMessage());
            }
        }

    }
}
