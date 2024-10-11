public class L07_Car {
    //write our fields(характеристики)
    private String brand;
    private int horsePower;
    private String color;

    //constructor, still a method, but the only aim is to create new obj.:
    public L07_Car(String brand, int horsePower, String color){
        //initially, create empty object - null, 0, null;
        this.brand = brand; // 'this' refers to our current obj.
        this.horsePower = horsePower;
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getBrand() { //getter - method, through which we get the value of a specific field
        return brand;
    }
    public void setColor(String color){ //setter - method, through which we adjust a specific field of our object
        this.color = color;
    }

    public void startEngine(){
        System.out.println("Started engine");
    }
}
