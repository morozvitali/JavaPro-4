package src.main.java.homework;

public class Cat extends Animal implements Run {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void bigti(int lenght) throws MyException {
        if (lenght > 200) {
            try {
                System.out.println("Cat " + name + " bizhit ");
                throw new MyException("Кіт не бігає більше 200 метрів, зазвичай ");
            } finally {
            }
    }
}

@Override
    public void plisti(int lenght) throws MyException {
    try {
        System.out.println("Cat " + name + " plive ");
        throw new MyException("Кіт не плаває взагалі");
    } finally {

    }
    }
}
