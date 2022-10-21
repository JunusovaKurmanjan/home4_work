import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите данные в список А");
        for (int i = 0; i < 5; i++) {
            String value = scan.nextLine();
            A.add(value);

        }
        System.out.println("Введите данные в список B");
        for (int i = 0; i < 5; i++) {
            String value = scan.nextLine();
            B.add(value);

        }
        System.out.println(A);
        System.out.println(B);
        Collections.reverse(B);

        for (int i = 0; i < A.size(); i++) {
            C.add(A.get(i));
            C.add(B.get(i));

        }
        System.out.println(C);
        Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();
        Collections.sort(C, comparator);
        System.out.println("Отсортированный список по длине:");
        System.out.println(C);
    }

}