package forNoobs;

import java.io.*;

public class IOFileEx2 {
    public static void main(String[] args) {
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("iofileex2.bin"))) {
            Person pers1 = new Person("Daniil", 65);

            os.writeObject(pers1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInputStream is = new ObjectInputStream((new FileInputStream("iofileex2.bin")))) {
            Person cur = (Person) is.readObject();
            System.out.println(cur);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

class Person implements Serializable {
    private String name;
    private transient int salary;

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "forNoobs.Person{" + "name='" + name + ", salary=" + salary + '}';
    }
}