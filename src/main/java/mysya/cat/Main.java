package mysya.cat;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {

    List<Person> persons = Data.getPersons();

  // Создали еще один лист (он будет сохранять результат нашей деятельности с потоком)


  //  List<Person> persons2 = persons.stream()
      //  .filter(p -> p.getAge() > 30)
  //      .map(person -> new Person(person.getFirstName(), person.getLastName(), person.getAge() + 100))
      //  .sorted()
  //      .collect(Collectors.toList());

    Optional<Person> person = persons.stream()
        .filter(p -> p.getAge() > 18)
    //    .findFirst();
        .findAny();
   System.out.println(person.get());


    // Создадим цикл
  //  for(int i = 0 ; i < persons2.size() ; i++){
  //    System.out.println(persons2.get(i));}
    }

  }
