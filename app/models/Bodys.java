package models;

public class Bodys {

    private String id,name ,surname,add;
    private  int age;
    private  double salary;

//คอนตักเตอร


    public Bodys(String id, String name, String surname, String add, int age, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.add = add;
        this.age = age;
        this.salary = salary;
    }

    public Bodys() {


    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}