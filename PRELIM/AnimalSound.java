import java.util.Scanner;

   class Animal {
   String name;
   String sound;

   public Animal(String name, String sound){
   this.name = name;
   this.sound = sound;
   }

   public void makeSound(){
   System.out.println(name + "says: " + sound);
   }
   }

   public class AnimalSound{
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

   Animal[] animals = {
   new Animal("Dog ", "aw aw aw"), new Animal("Cat ", "meow meow meow"), new Animal("Cow ", "moo moo moo"), new Animal("Fox ", "ding ding ding")
   };

   System.out.println("Select an animal: ");
   for (int i = 0; i< animals.length; i++){
   System.out.println((i + 1)+ "." + animals[i].name);
   }
   System.out.print("Enter a number: ");

   int choice = scanner.nextInt();

   if (choice >= 1 && choice <= animals.length){
   Animal selectedAnimal= animals[choice-1];
   selectedAnimal.makeSound();
   } 
   else{
   System.out.println("Invalid choice.");
   }

   scanner.close();
   }
}

