package mysya.cat;

import java.util.ArrayList;
import java.util.List;

public class Data {
  private static List<Person> persons = new ArrayList<>();


// Создали 10 человек и положили в ArrayList
  static {
    Person person1 = new Person("Иван", "Иванов", 33);
    persons.add(person1);

    Person person2 = new Person("Пётр", "Петров", 28);
    persons.add(person2);

    Person person3 = new Person("Сидор", "Сидоров", 39);
    persons.add(person3);

    Person person4 = new Person("Иван", "Тургенев", 46);
    persons.add(person4);

    Person person5 = new Person("Лев", "Толстой", 300);
    persons.add(person5);

    Person person6 = new Person("Антон", "Чехов", 32);
    persons.add(person6);

    Person person7 = new Person("Афанасий", "Фет", 52);
    persons.add(person7);

    Person person8 = new Person("Владимир", "Маяковский", 23);
    persons.add(person8);

    Person person9 = new Person("Михаил", "Лермонтов", 26);
    persons.add(person9);

    Person person10 = new Person("Алексей", "Толстой", 41);
    persons.add(person10);
  }


  // Создали метод getPersons, который вернет нам этот лист со всеми данными
  public static List<Person> getPersons() {
    return persons;
  }
}
