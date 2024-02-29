package KendiCalismalarim;

public class W3Polymorphism {
}
class Animal{
    public void animalSound(){
        System.out.println("Each animal has its own sound.");
    }
}
class Bird extends Animal{
    @Override
    public void animalSound() {
        System.out.println("The sound of a bird is ´cik cik cik`.");
    }}

 class Cat extends Animal{
     @Override
     public void animalSound() {
         System.out.println("The sound of a cat is `meow meow meow`.");
     }
 }
 class Dog extends Animal{
     @Override
     public void animalSound() {
         System.out.println("The sound of a dog is `haw haw haw`.");
     }
 }
 class Mainn{
     public static void main(String[] args) {
         Animal animal=new Animal();
         Animal dog =new Dog();
         Animal cat=new Cat();
         Animal bird= new Bird();

         animal.animalSound();
         dog.animalSound();
         cat.animalSound();
         bird.animalSound();
     }


 }
