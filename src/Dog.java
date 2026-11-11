class Dog extends Animal implements Trainable{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Gav..gav...gav");
    }
    @Override
    public void performTrick(){
        System.out.println(getName() + "Plays with ball");
    }
}
