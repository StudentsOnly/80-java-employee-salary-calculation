## Exercise: Lambda Expression - Employee Salary Calculation

### Objective:

The objective of this exercise is to practice working with lambda expressions in Java to calculate annual bonuses for employees based on their positions and salaries. You will create a Java program that processes a list of employees and uses lambda expressions to calculate their annual bonuses.

### Instructions:

1.	Create a Java class named "LambdaExercise" for this exercise.
2.	Define a class Employee with the following attributes: name (String), position (String), and salary (double). This class represents employees and is used for storing employee information.
3.	Implement a static method named "calculateAnnualBonuses" within the "LambdaExercise" class. This method takes a List of Employee objects as input and returns a List of String objects as output. Use lambda expressions to calculate the annual bonus for each employee based on the following criteria:
    -	If the position is "Manager," calculate the bonus as 15% of the salary.
    -	If the position is "Developer," calculate the bonus as 10% of the salary.
    -	If the position is "Intern," calculate the bonus as 5% of the salary.
    -	If the position is not recognized, set the bonus to 0.
4.	In the main method of the "LambdaExercise" class, create a list of Employee objects, each representing an employee. Include various employees with their name, position, and salary.
5.	Call the "calculateAnnualBonuses" method with the list of employees to calculate the annual bonuses.
6.	Print the following:
    -	The original list of employees (name, position, salary).
    -	The calculated annual bonuses for each employee (name and bonus amount).
