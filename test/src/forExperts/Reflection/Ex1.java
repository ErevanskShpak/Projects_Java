package forExperts.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class workerClass = Class.forName("forExperts.Reflection.Worker");
        Class workerClass2 = Worker.class;
        Worker worker = new Worker();
        Class workerClass3 = worker.getClass();

        Field field1 = workerClass.getDeclaredField("salary");
        System.out.println(field1.getName() + " " + field1.getType());

        Field[] fields = workerClass.getFields();
        for (Field cur:fields) {
            System.out.println(cur.getName() + " " + cur.getType());
        }

        Field[] allFields = workerClass.getDeclaredFields();
        for (Field cur: allFields) {
            System.out.println(cur.getName() + " " + cur.getType());
        }

        Method method = workerClass.getMethod("setSalary", int.class);
        Method method2 = workerClass.getMethod("getName");

        Method[] methods = workerClass.getMethods();
        Arrays.stream(methods).forEach(el-> System.out.println(el.getReturnType()
                + " " + el.getName()
                + " " + Arrays.toString(el.getParameterTypes())));

        Constructor constructor = workerClass.getConstructor(int.class, int.class, String.class);
        System.out.println(constructor.getName()+ " " + Arrays.toString(constructor.getParameterTypes()));

        Constructor[] constructors = workerClass.getConstructors();
    }
}

class Worker {
    private int id;
    public int salary;
    public String name;

    Worker() {}
    Worker(int id, int salary, String name) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
}