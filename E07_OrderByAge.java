public class E07_OrderByAge {
    private String name;
    private int id;
    private int age;
    public E07_OrderByAge(String name, int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return name + " with ID: " + id + " is " + age + " years old.";
    }
}
