package forExperts;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsEx {
    public static void main(String[] args) {
        Stream<String> str = Stream.of("Hello", "my", "name");
        int[] arr = {1, 2, 3};
        int[] arr2 = Arrays.stream(arr).map(cur->cur*2).toArray();

        List<String> lst = new LinkedList<>();
        lst.add("Hello");
        lst.add("bebra");
        lst.add("melon");

        List<Integer> lst2 = lst.stream().map(cur->cur.length()).collect(Collectors.toList());
        List<Integer> lst3 = lst.stream().map(String::length).toList(); // применяет функтор к каждому элементу

        List<String> lst4 = lst.stream().filter(cur->cur.length()==6).toList(); // фильтрует множество по предикату

        lst.stream().forEach(System.out::println);

        Optional<String> res = lst.stream().reduce((accumulator, cur)->accumulator+" "+cur);
        res.ifPresent(System.out::println);
        System.out.println(lst.stream().reduce("damn", (accumulator, cur)->accumulator+" "+cur));

        List<String> lst5 = lst.stream().sorted().toList();

        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        Stream<Integer> stream2 = Stream.of(4, 5, 6);
        Stream<Integer> stream3 = Stream.concat(stream1, stream2);

        Stream<Integer> stream4 = Stream.of(1, 1, 2, 3, 2);
        stream4.distinct().forEach(System.out::println);

        long count = lst.stream().count();

        Optional<String> res3 = lst.stream().distinct().peek(System.out::println).reduce((a, x)->a+x);

        Arr arrMine1 = new Arr(new LinkedList<Integer>(Arrays.asList(1, 2, 3)));
        Arr arrMine2 = new Arr(new LinkedList<Integer>(Arrays.asList(4, 5, 6)));
        List<Arr> listArr = new LinkedList<>(Arrays.asList(arrMine1, arrMine2));
        listArr.stream().flatMap(cur -> cur.getArr().stream()).forEach(System.out::println);

        List<String> listStr = new LinkedList<>();
        listStr.add("Hello");
        listStr.add("Bebra");
        listStr.add("Cucumbers");
        Map<Integer, List<String>> mapGroup = listStr.stream().collect(Collectors.groupingBy(String::length));
        Map<Boolean, List<String>> mapPart = listStr.stream().collect(Collectors.partitioningBy(el->el.length() == 5));

        Optional<String> resFirst = lst.stream().findFirst();

        Optional<String> resMin = lst.stream().min((x, y) -> x.length()- y.length());
        Optional<String> resMax = lst.stream().max((x, y) -> x.length()- y.length());

        List<String> lstLimit = lst.stream().sorted().limit(2).toList();

        List<String> lstSkip = lst.stream().sorted().skip(2).toList();

        List<Integer> lstInt = lst.stream().mapToInt(String::length).boxed().toList();

        double avg = lst.stream().mapToInt(String::length).average().getAsDouble();
        int min = lst.stream().mapToInt(String::length).min().getAsInt();
        int max = lst.stream().mapToInt(String::length).max().getAsInt();
        int sum = lst.stream().mapToInt(String::length).sum();

        List<Integer> lstPar = new LinkedList<>();
        lstPar.add(12);
        lstPar.add(14);
        lstPar.add(10);
        lstPar.add(76);
        int sumPar = lstPar.parallelStream().reduce(Integer::sum).get();
    }
}

class Arr {
    List<Integer> arr;
    Arr(LinkedList<Integer> arr) {
        this.arr = arr;
    }
    List<Integer> getArr() {
        return arr;
    }
}