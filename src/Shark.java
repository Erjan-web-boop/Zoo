class Shark extends Animal{
    public Shark(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println("...");
    }
}
