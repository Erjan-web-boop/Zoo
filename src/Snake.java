class Snake extends Animal{

    public Snake(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + "says: Pss...pss...pss");
    }
}
