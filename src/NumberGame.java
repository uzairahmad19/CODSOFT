import java.util.Scanner;
import java.util.Random;

class Game{
    int r, s;
    public int getRandm(){
        Random random = new Random();
        r = random.nextInt(101);
        return r;
    }
    public int getInput(){
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        return s;
    }
    public boolean isCorrectNmbr(int s, int r){
        if (s==r) {
            System.out.printf("!!! YOU GUESSED THE NUMBER CORRECTLY !!!\n...IT IS %d...\n", r);
            return true;
        }
        else if (s>r){
            System.out.println("TOO HIGH...");
            return false;
        }
        else {
            System.out.println("TOO LOW...");
            return false;
        }
    }
}

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------\n~~WELCOME TO GUESS THE NUMBER~~\nPress 1 to Play\nPress 2 to Exit");
        int inp = sc.nextInt();
        while(inp==1){
            System.out.println("***INSTRUCTIONS***\nA number is generated in the range 0 to 100, user have to guess the number correctly within 10 attempts");
            int i = 0, j = 10;
            boolean score = false;
            Game gg = new Game();
            int r_num = gg.getRandm();
            while (j>0){
                System.out.println("CHANCES REMAINING: " + j + "\n~~GUESS PLEASE~~");
                int p_input = gg.getInput();
                score = gg.isCorrectNmbr(p_input, r_num);
                i++;
                if(score) break;
                j--;
            }
            if(score) System.out.println("YOU TOOK " + i + " GUESSES TO CORRECTLY GUESS THE NUMBER");
            else System.out.println("GAME OVER\nCorrect Answer: " + r_num);
            System.out.println("Press 1 to Restart\nPress 2 to Exit");
            inp = sc.nextInt();
        }
    }
}