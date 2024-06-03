package quizproject;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[] = new String[5];
    
    public QuestionService(){
        questions[0] = new Question(1, "What is color?", "Red", "White", "Black", "Pink", "Black");
        questions[1] = new Question(2, "What is animal?", "Cat", "Dog", "Zebra", "Pig", "Dog");
        questions[2] = new Question(3, "What is weather?", "Cloudy", "Rain", "Sunny", "Windy", "Sunny");
        questions[3] = new Question(4, "What is name?", "Anh", "Lan", "Ryan", "Peter", "Anh");
        questions[4] = new Question(5, "What is fruit?", "Mango", "Apple", "Orange", "Cherry", "Cherry");

        
    }
    public void playQuiz (){
        int i = 0;
        for (Question q: questions){
            System.out.println("Question " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOp1());
            System.out.println(q.getOp2());
            System.out.println(q.getOp3());
            System.out.println(q.getOp4());

            //Take the user input 
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        for (String s: selection){
            System.out.println(s);
        }
    }

    public void getScore(){
        int score = 0 ;
        for (int i = 0; i < questions.length; i++){
            Question currQuestion = questions[i];
            String currAns = currQuestion.getAnswer();
            if (selection[i].equals(currAns)){
                score +=1;
            }
        }
        System.out.println("Your score is: " + score);
    }
    
}
