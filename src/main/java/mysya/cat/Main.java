package mysya.cat;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    List<Person> persons = Data.getPersons();

  // Создали еще один лист (он будет сохранять результат нашей деятельности с потоком)


    List<Person> persons2 = persons.stream()
        .filter(p -> p.getAge() > 30)
        .sorted()
        .collect(Collectors.toList());







    // Создадим цикл
    for(int i = 0 ; i < persons2.size() ; i++){
      System.out.println(persons2.get(i));
    }

  }
}