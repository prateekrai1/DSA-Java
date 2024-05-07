package oopsExcercises;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int setAge(int age){
        return this.age = age;
    }
    public String setName(String name){
        return this.name = name;
    }

    public static void main(String [] Args){
        Person person1 = new Person("Prateek", 24);
        Person person2 = new Person("Rai", 25);
        person1.setAge(30);
        person2.setAge(45);
        System.out.println(person1.age);
        System.out.println(person2.age);

    }
}
