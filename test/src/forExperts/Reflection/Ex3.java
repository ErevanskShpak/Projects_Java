package forExperts.Reflection;

import java.lang.reflect.Field;

public class Ex3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Worker worker = new Worker(123, 400, "Misha");
        Class<?> classWorker = worker.getClass();
        Field field = classWorker.getDeclaredField("id");
        field.setAccessible(true);

        int id = (int)field.get(worker);
        field.set(worker, 200);
    }
}
