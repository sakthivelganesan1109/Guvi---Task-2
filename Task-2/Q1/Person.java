public class Person {
    String name;
    int age = 18; 

    

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        
    };

    public void display() {
        System.out.println("The Person Name is: "+name+" and age is: "+age);
    }

}
