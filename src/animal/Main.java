package animal;

import java.util.*;

public class Main{

    public static void main(String[] args){
        
        List<AbstractAnimal> animalList = new ArrayList<>();
        
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758); 

        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);
        

    System.out.print("*** List all the animals in descending order by year named ***\n");
    System.out.print("[");
    animalList.sort((a1, a2) -> (a1.getYear() < a2.getYear()) ? 1 : -1);
    animalList.forEach(a -> System.out.print(a));
    System.out.print("]");
    System.out.println("\n");

    System.out.println("*** List all the animals alphabetically ***\n");
    System.out.print("[");
    animalList.sort((a1, a2) -> (a1.getName().compareToIgnoreCase(a2.getName())));
    animalList.forEach(a -> System.out.println(a));
    System.out.println("]");
    System.out.println("\n");

    System.out.println("*** List all the animals order by how they move ***\n");
    System.out.print("[");
    animalList.sort((a1, a2) -> (a1.getMovement().compareToIgnoreCase(a2.getMovement())));
    animalList.forEach(a -> System.out.print(a));
    System.out.print("]");
    System.out.println("\n");

    System.out.println("*** List only those animals that breath with lungs ***\n");
    printFilteredList(animalList, a -> a.getBreath() == "lungs" );
    System.out.println();

    System.out.println("*** List only those animals that breath with lungs and were named in 1758 ***\n");
    printFilteredList(animalList, a -> a.getBreath() == "lungs" && a.getYear() == 1758);
    System.out.println();

    System.out.println("*** List only those animals that lay eggs and breath with lungs ***\n");
    printFilteredList(animalList, a -> a.getReproduction() == "eggs" && a.getBreath() == "lungs");
    System.out.println();

    System.out.println("*** List alphabetically only those animals that were named in 1758 ***\n");
    animalList.sort((a1, a2) -> (a1.getName().compareToIgnoreCase(a2.getName())));
    printFilteredList(animalList, a -> a.getYear() == 1758);
    System.out.println();

    System.out.println("*** Stretch Goal ***");
    System.out.println("*** For the list of animals, list alphabetically those animals that are mammals ***\n");
    printFilteredList(animalList, a -> a instanceof Mammal);
    }

    public static void printFilteredList(List <AbstractAnimal> animalList, CheckAnimal tester) {
    for (AbstractAnimal a : animalList) {
      if (tester.test(a)) {
        System.out.print(a.getName() + " " + a.getReproduction() + " " + a.getMovement() + " " + a.getBreath() + " " + a.getYear()+ "\n");
      }
    }
    }
}


