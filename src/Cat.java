class Cat extends Animal implements Trainable{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println("Mya...mya...mya");
    }

    public void performTrick(){
        System.out.println("Jumping with a signal");
    }
}
