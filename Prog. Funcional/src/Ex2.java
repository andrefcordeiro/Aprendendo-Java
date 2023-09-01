import java.util.Comparator;
import java.util.List;

public class Ex2 {
  public static void main(String[] args) {

    List<Employee> employees =
        List.of(
            new Employee("Maria", "maria@gmail.com", 3200.00),
            new Employee("Alex", "alex@gmail.com", 1900.00),
            new Employee("Marco", "marco@gmail.com", 1700.00),
            new Employee("Bob", "bob@gmail.com", 3500.00),
            new Employee("Anna", "anna@gmail.com", 2800.00));

    double baseSalary = 1800.00;
    Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

    employees.stream()
        .filter(e -> e.getSalary() > baseSalary)
        .map(email -> email.getEmail())
        .sorted(comp)
        .forEach(System.out::println);

    double sum =
        employees.stream()
            .filter(e -> e.getName().startsWith("M"))
            .map(e -> e.getSalary())
            .reduce(0.0, (x, y) -> x + y);

    System.out.println(sum);
  }
}
