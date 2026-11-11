class Cat extends Animal implements Trainable{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + " says: Mya...mya...mya");
    }
    @Override
    public void performTrick(){
        System.out.println(getName() + " Jumping with a signal");
    }
}
