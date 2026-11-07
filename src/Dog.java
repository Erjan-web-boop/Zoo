class Dog extends Animal implements Trainable{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Gav..gav...gav");
    }

    public void performTrick(){
        System.out.println("Plays with ball");
    }
}
