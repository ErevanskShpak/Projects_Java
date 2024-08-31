package forExperts;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class CompareEx {
    public static void main(String[] args) {
        List<Employee> list = new LinkedList<>();
        list.add(new Employee(120, "Daniil", 65));
        list.add(new Employee(160, "Zaur", 42));
        list.add(new Employee(150, "Ivan", 80));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.id - o2.id;
            }
        });
        System.out.println(list);

        list.sort((Comparator.comparingInt(o -> o.salary)));
        System.out.println(list);

        list.sort(Comparator.reverseOrder());
    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int res = this.id - o.id;
        if (res == 0) {
            res = this.name.compareTo(o.name);
        }
        return this.id - o.id;
    }
}