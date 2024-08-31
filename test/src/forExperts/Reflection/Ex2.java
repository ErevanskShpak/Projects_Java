package forExperts.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> classWorker = Class.forName("forExperts.Reflection.Worker");
        Constructor<?> constructor = classWorker.getDeclaredConstructor(int.class, int.class, String.class);
        Worker worker = (Worker) constructor.newInstance(2, 3, "Oleg");

        Method method = classWorker.getMethod("setSalary", int.class);
        method.invoke(worker, 54);
    }
}
