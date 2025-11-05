package ap.panini;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//// Interface with a single filter method
//interface PersonFilter {
//    boolean filter(Person person);
//}
//
//// Interface for filtering persons
//
//public record Person(int age, String name, List<Person> children) {
//
//    // Canonical constructor
//    public Person {
//        // Defensive copy to preserve immutability
//        children = List.copyOf(children);
//    }
//
//    // Custom convenience constructor
//    public Person(int age, String name, int numberOfChildren) {
//        this(age, name, generateChildren(age, name, numberOfChildren));
//
//    }
//
//    // Helper method to generate child list
//    private static List<Person> generateChildren(int parentAge, String parentName, int numberOfChildren) {
//        Random random = new Random();
//        List<Person> childList = new ArrayList<>();
//
//        for (int i = 1; i <= numberOfChildren; i++) {
//            int childAge = random.nextInt(parentAge - 1) + 1; // age between 1 and parentAge-1
//            String childName = parentName + "_child" + i;
//            childList.add(new Person(childAge, childName, List.of())); // children of children = empty
//        }
//
//        return childList;
//    }
//
//    // Method to print children passing the filter
//    public void printChildren(PersonFilter filter) {
//        for (Person child : children) {
//            if (filter.filter(child)) {
//                System.out.println("Child Name: " + child.name() + ", Age: " + child.age());
//            }
//        }
//    }
//
//}


// pre record class
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
/// / Interface for filtering persons
//interface PersonFilter {
//    boolean filter(Person p);
//}
//
//// Person class
//public class Person {
//    private int age;
//    private String name;
//    private List<Person> children;
//
//    // Constructor
//    public Person(int age, String name, int numberOfChildren) {
//        this.age = age;
//        this.name = name;
//        this.children = new ArrayList<>();
//        Random random = new Random();
//
//        for (int i = 1; i <= numberOfChildren; i++) {
//            int childAge = 1 + random.nextInt(age - 1); // random age between 1 and age-1
//            String childName = name + "_child" + i;
//            this.children.add(new Person(childAge, childName, 0));
//        }
//    }
//
//    // Getters
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    // Function to print children that pass the filter
//    public void printChildren(PersonFilter filter) {
//        for (Person child : children) {
//            if (filter.filter(child)) {
//                System.out.println("Name: " + child.getName() + ", Age: " + child.getAge());
//            }
//        }
//    }
//}