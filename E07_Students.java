public class E07_Students {
    private String firstName;
    private String lastName;
    private double grade;

    public E07_Students(String firstName, String lastName, double grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
    public double getGrade(){
        return this.grade;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

}

