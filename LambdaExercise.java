import java.util.*;

@FunctionalInterface
interface BonusCalculator {
    double calculateBonus(double salary, String position);
}

public class LambdaExercise {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Olga", "Manager", 120000),
                new Employee("Peter", "Developer", 85000),
                new Employee("John", "Intern", 30000),
                new Employee("David", "Developer", 90000),
                new Employee("Eva", "Manager", 130000),
                new Employee("Elena", "Intern", 32000)
        );

        BonusCalculator bonusCalculator = (salary, position) -> {
            switch (position) {
                case "Manager": return salary * 0.15;
                case "Developer": return salary * 0.10;
                case "Intern": return salary * 0.05;
                default: return 0;
            }
        };

        System.out.println("Original Employees List:");
        employees.forEach(System.out::println);

        System.out.println();

        System.out.println("Annual Bonuses:");
        calculateAnnualBonuses(employees, bonusCalculator).forEach(System.out::println);
    }

    public static List<String> calculateAnnualBonuses(List<Employee> employees, BonusCalculator bonusCalculator) {
        List<String> bonusList = new ArrayList<>();

        employees.forEach(employee -> {
            double bonus = bonusCalculator.calculateBonus(employee.salary, employee.position);
            bonusList.add(employee.name + ", bonus, $" + bonus);
        });

        return bonusList;
    }
}
