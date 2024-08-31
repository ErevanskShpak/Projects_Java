package forExperts.Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsMethodsEx {
    public static void main(String[] args) {
        List<Employee1> lst = new LinkedList<>();
        lst.add(new Employee1(120, "Daniil", 65));
        lst.add(new Employee1(160, "Zaur", 42));
        lst.add(new Employee1(150, "Ivan", 80));
        System.out.println(lst);

        Collections.sort(lst);
        System.out.println(lst);

        Collections.reverse(lst);
        System.out.println(lst);

        Collections.shuffle(lst);
        System.out.println(lst);

        int index = Collections.binarySearch(lst, new Employee1(150, "Ivan", 80));
    }
}

class Employee1 implements Comparable<Employee1>{
    int id;
    String name;
    int salary;

    public Employee1(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "forExperts.Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee1 o) {
        return this.id - o.id;
    }
}