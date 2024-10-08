import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LambdaExercise {

  private static final Random random = new Random();

  public static void main(String[] args) {

    List<Employee> employees = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      employees.add(getRandomEmployee());
    }

    System.out.println("Employees");
    System.out.println("----------------------");
    employees.forEach(System.out::println);
    System.out.println();

    System.out.println("Annual Bonus");
    System.out.println("----------------------");
    calculateAnnualBonuses(employees).forEach(System.out::println);
  }

  private static Employee getRandomEmployee() {

    String[] positions = {"Manager", "Developer", "Intern"};
    String[] names = {"Alph", "Fred", "Nicole", "Sabine", "Gerd"};

    return new Employee(
      names[random.nextInt(0, names.length)] +
        " " + (char) random.nextInt('A', 'Z') + ".",
      positions[random.nextInt(0, positions.length)],
      random.nextDouble(40_000.00, 80_000.01)
    );
  }

  private static List<String> calculateAnnualBonuses(List<Employee> employees) {

    return employees.stream()
      .map(e -> e.getName() + "($%.2f)".formatted(getAnnualBonus(e)))
      .toList();
  }

  private static double getAnnualBonus(Employee e) {
    return switch (e.getPosition()) {
      case "Manager" -> e.getSalary() * 0.15;
      case "Developer" -> e.getSalary() * 0.1;
      case "Intern" -> e.getSalary() * 0.05;
      default -> 0;
    };
  }

}
