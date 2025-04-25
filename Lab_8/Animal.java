public class Animal {
    public static void main(String[] args) {
        Super superAnimal = new Super();
        Subcat cat = new Subcat();
        Subdog dog = new Subdog();

        superAnimal.makeSound();
        cat.makeSound();
        dog.makeSound();
    }
}



