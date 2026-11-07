import java.util.ArrayList;
import java.util.List;

class Zoo {
    List<Animal> animals = new ArrayList<>();

    void addAnimal(Animal a){
        animals.add(a);
    }

    void makeAllSounds(){
        for(Animal a : animals){
            a.makeSound();
        }
    }

    void performAllTricks(){
        for(Animal a : animals){
            if(a instanceof Trainable){
                ((Trainable) a).performTrick();
            }
        }
    }
}