import java.util.*;

public class EncryptionProgram
{

    private Scanner scanner;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shufeldList;
    private char character;
    private String line;
    private char[] letters;
    private char[] secretLetters;


    EncryptionProgram()
    {
        scanner = new Scanner(System.in);
        random = new Random();
        list = new ArrayList();
        shufeldList = new ArrayList();
        character = ' ';

        newKey();
        askQuestion();
    }

    private void askQuestion()
    {
        while (true)
        {
            System.out.println("***************************************************");
            System.out.println("What do you want to do?");
            System.out.println("(N)ew Key, (G)et Key, (E)ncrypt, (D)ecrypt, (Q)uit");
            
            char response = Character.toUpperCase(scanner.nextLine().charAt(0));
        }
    }

    private void newKey()
    {

    }

    private void getKey()
    {

    }

    private void encrypt()
    {

    }

    private void decrypt()
    {

    }

    private void quit()
    {

    }
}
