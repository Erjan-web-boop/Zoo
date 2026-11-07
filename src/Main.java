public class Main{
    public static void main(String[] args){
        Zoo zoo = new Zoo();

        zoo.addAnimal(new Dog("Rex",23));
        zoo.addAnimal(new Cat("CatNap", 5));
        zoo.addAnimal(new Snake("Jack", 45));
        zoo.addAnimal(new Shark("MelaDon", 100));

        zoo.makeAllSounds();
        zoo.performAllTricks();
    }
}