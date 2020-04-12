// Animals example for dynamic polymorphism
class Animal {
   public void greeting(){
      System.out.println(".............");
   }
}
class Cat extends Animal {
   @Override
   public void greeting() {
      System.out.println("Meow!");
   }
}
class Dog extends Animal {
   @Override
   public void greeting() {
      System.out.println("Woof!");
   }   
   public void greeting(Dog another) {
      System.out.println("Woooooooooof!");
   }
}
class BigDog extends Dog {
   @Override
   public void greeting() {
      System.out.println("Woow!");
   }   
   @Override
   public void greeting(Dog another) {
      System.out.println("Woooooowwwww!");
   }
}
class Horse extends Animal
{
   @Override
   public void greeting() {
      System.out.println("Neigh!");
   }
}
public class test {
   public static void main(String[] args) {
         
       // Using inheritance
       Cat cat1 = new Cat();
       cat1.greeting();
       Dog dog1 = new Dog();
       dog1.greeting();
       BigDog bigDog1 = new BigDog();
       bigDog1.greeting();
       
       // Using Polymorphism
       Animal animal1 = new Cat();
       animal1.greeting();
       Animal animal2 = new Dog();
       animal2.greeting();
       Animal animal3 = new BigDog();
       animal3.greeting();
       Animal animal4 = new Horse();
       animal4.greeting();
   }
}
