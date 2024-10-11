import java.util.ArrayList;
import java.util.List;

public class E07_Salon {
    private List<E07_Pet> pets;
    private int capacity;
    public E07_Salon(int capacity){
        this.capacity = capacity;
        this.pets = new ArrayList<>();
    }

    public void add(E07_Pet pet){
        if (this.capacity > this.pets.size()) {
            this.pets.add(pet);
        }
    }
    public boolean remove(String name){
        for (E07_Pet pet: this.pets){
            if (pets.contains(pet)){
                pets.remove(pet);
                return true;
            }
        }
        return false;
    }
    public E07_Pet getPet(String name, String owner){
        for(E07_Pet pet: this.pets){
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)){
                return pet;
            }
        }
        return null;
    }

    public String getStatistics() {
        String statistics = "The grooming salon has the following clients:\n";
        for(E07_Pet pet: pets){
            statistics += String.format("%s %s \n", pet.getName(), pet.getOwner());
        }
        return statistics;
    }
}
