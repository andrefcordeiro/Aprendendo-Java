import java.util.Comparator;
import java.util.List;

public class Ex1 {
  public static void main(String[] args) {

    List<Product> products =
        List.of(
            new Product("Tv", 900.00),
            new Product("Mouse", 50.00),
            new Product("Tablet", 350.50),
            new Product("HD Case", 80.90),
            new Product("Computer", 850.00),
            new Product("Monitor", 290.00));

    double avg =
        products.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / products.size();
    System.out.println(avg);

    Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

    products.stream()
        .filter(p -> p.getPrice() < avg)
        .map(p -> p.getName()) // stream com apenas os nomes
        .sorted(comp.reversed())
        .forEach(System.out::println);
  }
}
