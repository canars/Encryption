import java.util.*;

public class EncryptionProgram
{
    //my Programm.

    private Scanner scanner;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffeldList;
    private char character;
    private String line;
    private char[] letters;


    EncryptionProgram()
    {
        scanner = new Scanner(System.in);
        random = new Random();
        list = new ArrayList();
        shuffeldList = new ArrayList();
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

            switch (response)
            {
                case 'N' :
                    newKey();
                    break;
                case 'G' :
                    getKey();
                    break;
                case 'E' :
                    encrypt();
                    break;
                case 'D' :
                    decrypt();
                    break;
                case 'Q' :
                    quit();
                    break;
                default :
                    System.out.println("Not a valid input..");
            }
        }
    }

    private void newKey()
    {
        character = ' ';
        list.clear();
        shuffeldList.clear();
        
        for(int i = 32; i<127; i++) {
            list.add(Character.valueOf(character));
            character++;
        }
        shuffeldList = new ArrayList(list);
        Collections.shuffle(shuffeldList);
        System.out.println("** A new key has been generated.");
    }

    private void getKey()
    {
        System.out.println("Key: " );
        for(Character x : list) {
            System.out.print(x);
        }
        System.out.println();
        for(Character x : shuffeldList) {
            System.out.print(x);
        }
        System.out.println();
        }

    private void encrypt()
    {
        System.out.println("Enter a message to be encrypted..");
        String message = scanner.nextLine();
        
        letters = message.toCharArray();
        
        for (int i = 0; i<letters.length;i++) {
            for(int j =0; j<list.size(); j++) {
                if(letters[i] == list.get(j)) {
                letters[i] = shuffeldList.get(j);
                break;
            }
        }
    }
        System.out.println("Encrypted: ");
        for(char x : letters) {
            System.out.print(x);
        }
        System.out.println();
    }
    private void decrypt()
    {
        System.out.println("Enter a message to be dencrypted..");
        String message = scanner.nextLine();
        
        letters = message.toCharArray();
        
        for (int i = 0; i<letters.length;i++) {
            for(int j =0; j<shuffeldList.size(); j++) {
                if(letters[i] == shuffeldList.get(j)) {
                letters[i] = list.get(j);
                break;
            }
        }
    }
        System.out.println("Decrypted: ");
        for(char x : letters) {
            System.out.print(x);
        }
        System.out.println();
    }

    private void quit()
    {
        System.out.println("Thank you for visiting my little encryption program :-)");
        System.exit(0);
    }
}
