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

    void feedAll(){
        for(Animal e : animals){
            e.eat();
        }
    }

    void performAllTricks(){
        for(Animal a : animals){
            if(a instanceof Trainable t){
                t.performTrick();
            }
        }
    }
}