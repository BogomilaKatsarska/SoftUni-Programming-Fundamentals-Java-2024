public class E07_Vehicles {
    private String type;
    private String model;
    private String color;
    private int horsepower;
    public E07_Vehicles(String type, String model, String color, int horsepower){
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Type: " + type + "\n" + "Model: " + model + "\n" + "Color: " + color + "\n" + "Horsepower: " + horsepower ;
    }
    public int getHorsepower(){
        return this.horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }
}
