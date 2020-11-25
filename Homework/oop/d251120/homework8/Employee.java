package oop.d251120.homework8;

public class Employee {
  private int id;
  private String firstName;
  private String lastName;
  private int salary;

  public Employee(int id, String firstname, String lastName, int salary) {
    // TODO Auto-generated constructor stub
    this.id = id;
    this.firstName = firstname;
    this.lastName = lastName;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getName() {
    return firstName + " " + lastName;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getAnnualSalary() {
    return 12 * salary;
  }

  public int raiseSalary(int percent) {
    this.salary = salary * (100 + percent) / 100;
    return salary;
  }

  @Override
  public String toString() {
    return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + salary + "]";
  }
}
