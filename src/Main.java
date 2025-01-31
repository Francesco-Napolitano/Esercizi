import EdoMidali.Persona;
import Studio.Dog;

public class Main {
    public static void main(String[] args) {
        Dog[] myDogs = new Dog[2];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[0].setSize(30);
        int size = myDogs[0].getSize();
        System.out.println("The size of the first dog: " + size);
        myDogs[1].setSize(8);
        int size2 = myDogs[1].getSize();
        System.out.println("The size of the second dog: " + size2);

        Persona italiano = new Persona("Mario", "Rossi");
        Persona svedese = new Persona(italiano);
        System.out.println(svedese.getCognome());
        System.out.println(italiano.getCognome());


    }
}