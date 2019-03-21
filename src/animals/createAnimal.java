package animals;
import java.util.Scanner;

public class createAnimal {
    Scanner myScanner=new Scanner(System.in);

    public static void main(String[] args) {
        createAnimal animal=new createAnimal();
        animal.getAnimalType();

    }

    private void getAnimalType()
    {
        System.out.println("What animal would you like to create?");
        String animal = myScanner.nextLine();
        if(animal.equalsIgnoreCase("dog")){
            createDog();
    }
        else if(animal.equalsIgnoreCase("cat")){
            createCat();
        }
        else {
            System.out.println(animal +" is not an animal we can currently create, please try again! ");
        }


    }

    private void createDog() {
        System.out.println("What is the dog's name?");
        String name=myScanner.nextLine();
        System.out.println("How big is the dog?");
        String size=myScanner.nextLine();
        System.out.println("How old is the dog?");
        int age=myScanner.nextInt();
        System.out.println("What breed is the dog?");
        String breed=myScanner.nextLine();

        dog myDog=new dog(name,size,age,breed);
        myDog.bark(size);
        myDog.play(breed);
        myDog.beHuman(name,age,breed);

    }

    private void createCat(){

        System.out.println("What is the cat's name?");
        String name=myScanner.nextLine();
        System.out.println("What is the cat's age?");
        int age=myScanner.nextInt();
        System.out.println("How are the cat's claws?");
        String claws=myScanner.nextLine();
        System.out.println("Is the cat clean?");
        String wash=myScanner.nextLine();
        System.out.println("Is the cat sleepy now?");
        int sleepyLevel=myScanner.nextInt();


        cat myCat=new cat(name,age,claws,sleepyLevel);
        myCat.catchAMouse();
        myCat.napOnHuman();
        myCat.washMyPrettyFur();

    }
}
