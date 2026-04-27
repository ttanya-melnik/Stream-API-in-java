package mysya.cat;

public class Person implements Comparable<Person> {


  // Задали параметры человека
  private String firstName;
  private String lastName;
  private int age;


// Создали конструктор класса с параметрами
  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }


// Есть getter и setter по всем параметрам
  public String getFirstName() { return firstName; }
  public void setFirstName(String firstName) { this.firstName = firstName; }

  public String getLastName() { return lastName; }
  public void setLastName(String lastName) { this.lastName = lastName;  }

  public int getAge() { return age; }
  public void setAge(int age) { this.age = age; }


  // Метод toString, чтобы в консоли отслеживать результаты своей деятельности
  @Override
  public String toString() {
    return "Person {" +
        "firstName=' " + firstName + '\'' +
        ", lastName=' " + lastName + '\'' +
        ", age=" + age +
        '}';
  }

  @Override
  public int compareTo(Person o) {
    return firstName.compareTo(o.getFirstName());
  }
}
