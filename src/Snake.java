class Snake extends Animal{

    public Snake(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println("Pss...pss...pss");
    }
}
