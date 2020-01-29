package Lesson01;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");

    public static void main(String[] args) {
        ArrayList<Talkable> zoo = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String animalType;
//        zoo.add(new Dog(true, "Bean"));
//        zoo.add(new Cat(9, "Charlie"));
//        zoo.add(new Teacher(44, "Stacy Read"));
        System.out.println("What animal would you like to create; dog, cat, teacher, or badger ?");
        animalType = input.nextLine();
        if (animalType.equals("dog")){
            zoo.add(new Dog(true, "Bean"));
        }
        else if (animalType.equals("cat")){
            zoo.add(new Cat(9, "Charlie"));
        }
        else if (animalType.equals("badger")){
            zoo.add(new Badger(true, "Bucky"));
            System.out.print("Badger: ");
        }
        else if (animalType.equals("teacher")){
            zoo.add(new Teacher(44, "Stacy Read"));
        }
        else {
            System.out.println("Incorrect data type");
        }
        for (Talkable thing : zoo) {
            printOut(thing);
        }
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();

        FileInput indata = new FileInput("animals.txt");
        String line;
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    public static void printOut(Talkable p) {
        System.out.println(p.getName() + " says= " + p.talk());
        outFile.fileWrite(p.getName() + " | " + p.talk());
    }
}
