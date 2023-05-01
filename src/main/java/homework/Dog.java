package src.main.java.homework;

public class Dog extends Animal implements Run {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void bigti(int lenght) throws MyException {
        if (lenght > 500) {
            try {
                System.out.println("Dog " + name + " bizhit ");
                throw new MyException("Собака не бігає більше 500 метрів ");
            } finally {

            }
        }
    }

    @Override
    public void plisti(int lenght) throws MyException {
        if (lenght > 10) {
            try {
                System.out.println("Cat " + name + " plive ");
                throw new MyException("Собака не плаває більше 10 метрів ");
            } finally {

            }
        }
    }
}