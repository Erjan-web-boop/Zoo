class Shark extends Animal{
    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + " says: ...");
    }
}
