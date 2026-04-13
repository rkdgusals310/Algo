import java.util.*;

public class Main {
    static class Person {
        int age;
        String name;
        int order; 

        Person(int age, String name, int order) {
            this.age = age;
            this.name = name;
            this.order = order;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Person> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            Person p = new Person(age, name, i);


            int idx = binarySearch(list, p);
            list.add(idx, p); 
        }

        StringBuilder sb = new StringBuilder();
        for (Person p : list) {
            sb.append(p.age).append(" ").append(p.name).append("\n");
        }
        System.out.print(sb);
    }

    
    private static int binarySearch(List<Person> list, Person p) {
        int l = 0, r = list.size();
        while (l < r) {
            int mid = (l + r) / 2;
            Person cur = list.get(mid);

            if (cur.age < p.age) {
                l = mid + 1;
            } else if (cur.age > p.age) {
                r = mid;
            } else {
                if (cur.order < p.order) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }
        }
        return l;
    }
}
