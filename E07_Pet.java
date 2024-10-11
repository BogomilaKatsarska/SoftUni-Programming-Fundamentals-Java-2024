public class E07_Pet {
    private String name;
    private int age;
    private String owner;
    public E07_Pet(String name, int age, String owner){
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name + " " + age + " - (" + owner + ")";
    }
}
