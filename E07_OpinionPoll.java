public class E07_OpinionPoll {
    private String name;
    private int age;

    public E07_OpinionPoll(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}
