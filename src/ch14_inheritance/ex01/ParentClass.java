package ch14_inheritance.ex01;

public class ParentClass {
    public String Name;

    private int age;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void ParentClass() {

    }
    public void hello(){
        System.out.println("ParentClass.hello ");
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
