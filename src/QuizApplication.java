import java.util.*;

public class QuizApplication {
    private static final int TIMER_SECONDS = 15;

    public static void main(String[] args) {
        ArrayList<String> Questions = new ArrayList<>();
        Questions.add("Which of the following is an object-oriented programming language?");
        Questions.add("Who is the founder of Java Programming language?");
        ArrayList<ArrayList<String>> Options = new ArrayList<>();
        Options.add(new ArrayList<>(List.of("C", "Html", "Java")));
        Options.add(new ArrayList<>(List.of("James Gosling", "Dennis Ritchie", "Guido van Rossum")));
        ArrayList<String> correctAns = new ArrayList<>();
        correctAns.add("Java");
        correctAns.add("James Gosling");

        Scanner sc = new Scanner(System.in);
        System.out.println("Answer the questions correctly within the time limit of: 15 seconds");
        int c = 0, w =0;

        for (int i=0; i<Questions.size(); i++){
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Time's up...");
                    System.exit(0);
                }
            };
            timer.schedule(task, TIMER_SECONDS * 1000);
            System.out.println("Question" + (i+1) +": " + Questions.get(i));
            System.out.println("Options: " + Options.get(i) + "\nYour answer: ");
            String answer = sc.nextLine();
            if(answer.equalsIgnoreCase(correctAns.get(i))) {
                System.out.println("Correct!");
                c++;
            }else{
                System.out.println("Incorrect. The correct answer is " + correctAns.get(i));
                w++;
            }
            timer.cancel();
        }
        System.out.println("CORRECT ANSWERS: " + c + "\nWRONG ANSWERS: " + w);
    }
}

