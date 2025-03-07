
import java.util.Random;
import java.util.Scanner;
// let arr = [a to z]
public class Example {
   public static void main(String[] args) throws Exception {
     int num;
     int num2;
     int tries = 3; 
     int paitence = 5;
     int save;
     String password;
     String key = "";
     String answer = ""; // Will make it so password is in a different file
     Random para = new Random();
     int mathing = para.nextInt(4);
     Scanner scnr = new Scanner(System.in);

     System.out.println("Currently loading... please wait"); 
     System.out.println(mathing); 
     if(mathing == 0 || mathing == 1){
      System.out.println("Ok, all good to go");
     }
     else{
      System.out.println("Error, please try running the program again.");
      System.out.println(System.nanoTime());
      System.exit(0);
     }
     try{
     while (tries != 0){
      System.out.println( "please enter your password");
      password = scnr.next();
        if(password.contains(answer)){
          System.out.println( "well damn you smart.");
          break;
        }
        else{
          tries--;
          sanity(paitence);
          System.out.println( "Nope! You only have " + tries + " left.");
        }
     }
     if (tries == 0){
      System.out.println( "well dang. Try next time.");
      System.exit(0);
     }
     System.out.println( "You had " + tries +" tries left.");
     System.out.println( "Greetings! lemme guess what number you put." );
      num = scnr.nextInt();
     
     System.out.println( "You inputted " + num); 
     System.out.println("Lol");  
     System.out.println("Ok now let's try this. Gimme a number and I'll add a random num to it");  
     System.out.println("So tell me: ");  
     num2 = scnr.nextInt();
     num2 = num2 + mathing;
     System.out.println("Ok now you have " + num2 + " Pretty neat huh?");  
     System.out.println( "So now... let's do something fun.");
     System.out.println( "Here I'll make a little game BUT here's the catch.");
     System.out.println( "You get to choose the game you want to play out of the three I list. So let me start off.");
     System.out.println( "1 will be a guessing game where you guess my number whatever it can be three times.");
     System.out.println( "2 will be tic tac toe where it'll be you vs me.");
     System.out.println( "3 will be trying to make a mini little ai thingy. Coming soon.");
     System.out.println( "4 will be coming soon.");
     System.out.println( "So take your pick.");
     int choice = scnr.nextInt();
     rules(choice);
     System.out.println( "So lets start.");
     
     if (choice == 1){
      rules(choice);
      int times = 5;
      int track;
       // simple user input and random num generator
       while (choice == 1){
       System.out.println("Want a repeat of the instructions?");
       answer = scnr.nextLine();
       if (answer.contains("yes")){
       rules(choice);
       break;
       }
       else{
        if (times == 5){
         track = sanity(times); times--;
        }
        else if(times == 4){
        track = sanity(times); times--;
        }
        else if(times == 3){
       track = sanity(times); times--;
        }
        else if(times == 2){
       track = sanity(times); times--;
        }
        else if(times == 1){
        track = sanity(times); times--;
        }
        else if(times == 0){
          track = sanity(times); times--;
          }
       }
       }
       System.out.println("Alright then, let's get started then.");
       System.out.println("Please guess my number. You only have one shot but your hint is its between 60 and 70.");
       int dundun = scnr.nextInt();
       if (dundun == 64){
        System.out.println("Neat, you got it.");
       }
       else{
        System.out.println("Nope. Nice try thoough.");
       }
       
     }
     else if (choice == 2){
      // double array that identifies a letter already in a certain space. Also certain algorithm to the random numbers
      rules(choice);
      String AI;
       System.out.println("Want a repeat? of the instructions?");
       answer = scnr.next();
       if (answer.contains("yes") || answer.contains("Yes")){
       rules(choice);
       }
      
     System.out.println("Alright then, let's get started then.");
     System.out.println("Please enter your name! ");
     String peep = scnr.next();
     System.out.println("Solo or playing with someone?");
     String option = scnr.next();
     if (option.contains("Solo") ){
       System.out.print("Alright! Then let's start shortly! Your opponent will be called AI");
        AI = "AI";
     }
     else{
       System.out.print("Alright! Then let's start shortly! Please enter 2nd person's name!");
     AI = scnr.nextLine();
     }
     System.out.println("Before we start, pick either X or O: ");
    char player1 = scnr.next().charAt(0);
    TicTacToe.TicTacToe(peep, AI);
     }
     else if (choice == 3){
      // make another file that stores all the input given to it ever in a possible date and time format. Then organize it like a brain with methods for its tools
      rules(choice);
      String AI;
      
       System.out.println("Want a repeat of the instructions?");
       answer = scnr.next();
       if (answer.contains("yes")){
       rules(choice);
       }
       else{
        System.out.println("Alright! Let's start then!");
       }
     }
    }
     catch (Exception e){ save = sanity(paitence); paitence--;}
   }
   
   
   
   public static void rules(int list){
    System.out.println("So here's basically the run down.");
    if (list == 1){
      System.out.println("This guessing game will have the numbers starting from 1 to 5, 1 to 10, 1 to 50, 1 to 100, and 1 to 1000.");
      System.out.println("Ya that's basically it. You ironically have a better chance getting the number right than getting a 5 star from your favorite gacha game.");
      System.out.println("Plus, you spend less all in all and you don't sell your house away.");
    }
    if (list == 2){
      System.out.println("Tic tac toe you'll be saying two numbers to either put your X or O into the board");
      System.out.println("The first number will be the diagnonal row (hamburger style if it helps you think what that means) and second is vertical (hot dog) style.");
      System.out.println("The ai will randomly choose who goes first (You can choose if your heads or tails.) and you can also choose X or O.");
      System.out.println("Tic tac toe you'll be saying two numbers to either put your X or O into the board");
      System.out.println("Of course, you cant cheese the system to edit out your opponents letter.");
      System.out.print("Then the rest is straightforward?");
    }
    if (list == 3) {
      System.out.println("Now for this mini ai. we're gonna have to get some data of the stuff it can do.");
      System.out.println("So basically, I'll take each of your inputs individually and associate them with a number.");
      System.out.println("And these numbers will be divided to type of responses, 1 to 10 can be sassy");
      System.out.println("11 to 20 can be smart");
      System.out.println("And 21 to 30 can be friendly/greetings. Now all of the inputs that you provided will ALLLLLL be added to this little ai");
      System.out.println("Meaning it'll adapt some stuff that you type. Depending how you type.");
      System.out.print("But it can also have some methods that help it do some stuff such as simple math hw and possibly genre recommendations");
    }
    else{
      System.out.println("Can't help if I dunno What you're saying.");
    }
   }

    public static int sanity(int list){
      int san = 0;
    if (list == 5){
      System.out.println("Ok no worries. You get a pass cuz you're cool :)");
      san = list - 1;
    }
    else if (list == 4){
      System.out.println("Again no worries. You stil get a pass alright?");
      san = list - 1;
    }
    else if (list == 3) {
      System.out.println("Ok just curious, but you doing this on purpose?");
      san = list - 1;
    }
    else if (list == 2) {
      System.out.println("Ok I feel like now you're doing it on purpose.");
      san = list - 1;
    }
    else if (list == 1) {
      System.out.println("Ok you're really pushing it so far. Stop messing with me or else...");
      san = list - 1;
    }
    else if (list == 0) {
      System.out.println("Ok no more passes. Goodbye");
      System.exit(0);
    }
    else{
      System.out.println("Can't help if I dunno .");
    }
    return san;
   }

   class TicTacToe{
   public TicTacToe(){
    System.out.print("Welcome!");
}
public static void TicTacToe(String one, String two){
    System.out.print("Greetings " + one + "!");
    System.out.print("Greetings " + two + "!");
}
public static void TicTacToe(int one, int two){
    System.out.print("Greetings " + one + " !");
    System.out.print("Greetings " + two + " !");
}
public void turn(int order, char letter){
    int pointa = 0;
    int pointb = 0;
    if(order == 0){
       pointa = pointa + player(order, letter);
    }
    else if(order == 1){
    player(order, letter);
    }
    else{
    if (pointa < pointb){
    System.out.print ("Player one wins!");
    }
    else {
    System.out.print ("Player two wins!");
    }
    }
}

public int player(int order, char letter){
 int [][] board = new int [3][3]; 
 Scanner scnr = new Scanner (System.in);
 int i = 0;
 int j = 0;
 System.out.println("[");
 for (i = 0; i < 3; i++){
    for(j = 0; j < 3; j++)
 System.out.print(board[i][j] + " ");
 }
 System.out.print("]");
 System.out.println("Please input two coordinates");
 i = scnr.nextInt();
 j = scnr.nextInt();
 scnr.close();
 while (board[i][j] == letter){
 System.out.println("Spot's taken! Choose another space!");
 i = scnr.nextInt();
 j = scnr.nextInt();
 }
 board[i][j] = letter;
 System.out.println("[");
 for (i = 0; i < 3; i++){
    for(j = 0; j < 3; j++)
 System.out.print(board[i][j] + " ");
 }
 System.out.print("]");
 return 0;
}
}

}
