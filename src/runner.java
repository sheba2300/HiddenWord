import java.util.Scanner;

public class runner {
    public static void main(String[] args)
    {
        HiddenWord trail1 = new HiddenWord("APPLE");
        String hint = "";
        Scanner in = new Scanner(System.in);
        System.out.println("What's your guess?");
        String guess = in.nextLine();
        hint = trail1.getHint(guess);
        while(!hint.equals("APPLE"))
        {
            System.out.println("Your hint: " + hint);
            System.out.println("what's your next guess?");
            guess = in.nextLine();
            hint = trail1.getHint(guess);
        }
        System.out.println("congrats you got the secret word!");
    }
}
