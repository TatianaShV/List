import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] operation = {"Добавить", "Показать", "Удалить", "Найти"};
        ArrayList<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию:");
            for (int i = 0; i < operation.length; i++) {
                System.out.println(i + 1 + ". " + operation[i]);
            }
            String input = scanner.nextLine();
            int number = Integer.parseInt(input) - 1;
            if (number == 0) {
                System.out.println("Какую покупку хотите добавить?");
                String purchase = scanner.nextLine();
                list.add(purchase);
                System.out.println("Итого в списке покупок: " + list.size());
            }
            if (number == 1) {
                for (int i = 0; i < list.size(); i++) {
                    String p = list.get(i);
                    System.out.println(i + 1 + ". " + p);
                }
            }
            if (number == 2) {
                System.out.println("Список покупок: ");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(i + 1 + ". " + list.get(i));
                }

                System.out.println("Какую хотите удалить? Введите номер или название");
                String purchase1 = scanner.nextLine();
                for (int i = 0; i < list.size(); i++) {
                    try {
                        int n = Integer.parseInt(purchase1) - 1;
                        System.out.println("Покупка " + list.get(n) + " удалена, список покупок: ");
                        list.remove(n);

                        System.out.println(i + 1 + ". " + list.get(i));
                    } catch (NumberFormatException e) {
                        if (purchase1.equals(list.get(i))) {
                            System.out.println("Покупка " + list.get(i) + " удалена, список покупок: ");
                            list.remove(i);

                            System.out.println(i + 1 + ". " + list.get(i));
                        }

                    }
                }
            }
            if (number == 3) {
                System.out.println("Введите текст для поиска:");
                String query = scanner.nextLine();
                String queryLower = query.toLowerCase();
                System.out.println("Найдено: ");
                for (int i = 0; i < list.size(); i++) {

                    String itemLower = list.get(i).toLowerCase();
                    if (itemLower.contains(queryLower)) {

                        System.out.println(i + 1 + " " + list.get(i));
                    }
                }

            }
        }

    }

}

