/* Name: M. Sandeep

Internship name: OASIS INFOBYTE

Domain: JAVA DEVELOPMENT

Task-1 : Online Reservation System

Task-2 : Number Guessing Game

Task-3 : ATM Interface
 */




import java.util.*;
class Rinput{
    public int input(){
        Random r=new Random();
        return r.nextInt(99)+1;
    }
}
class GuessTheNumber {
    public static void main(String[] args){
        Rinput ri=new Rinput();
        Scanner sc=new Scanner(System.in);
        boolean f=true;
        System.out.println("-------------------------------------------");
        System.out.println("      GUESS THE NUMBER                 ");
        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("      A GAME OF GUESSES1             ");
        System.out.println("-------------------------------------------");
        while(f){
            System.out.println("ENTER YOUR CHOICE:");
            System.out.println("1.START ROUND");
            System.out.println("2.EXIT");
            int l=sc.nextInt();
            if(l==1) {
                System.out.println("YOUR ROUND HAS STARTED");
                int r = ri.input();
                int k,i;
                for ( i = 0; i < 10; i++) {
                    System.out.print("guess the random number:"+(i+1)+" attempt:");
                    k = sc.nextInt();
                    if (k == r) {
                        switch (i) {
                            case 0:
                                System.out.println("your guess is correct, your score is:100");
                                break;
                            case 1:
                                System.out.println("your guess is correct, your score is:90");
                                break;
                            case 2:
                                System.out.println("your guess is correct, your score is:80");
                                break;
                            case 3:
                                System.out.println("your guess is correct, your score is:70");
                                break;
                            case 4:
                                System.out.println("your guess is correct, your score is:60");
                                break;
                            case 5:
                                System.out.println("your guess is correct, your score is:50");
                                break;
                            case 6:
                                System.out.println("your guess is correct, your score is:40");
                                break;
                            case 7:
                                System.out.println("your guess is correct, your score is:30");
                                break;
                            case 8:
                                System.out.println("your guess is correct, your score is:20");
                                break;
                            case 9:
                                System.out.println("your guess is correct, your score is:10");
                                break;
                        }
                        break;
                    }else if(k<r){
                        System.out.println("YOUR VALUE IS LOW");
                    }else{
                        System.out.println("YOUR VALUE IS HIGH");
                    }
                }
                if(i==10){
                    System.out.println("YOU EXCEEDED YOUR LIMIT BETTER LUCK NEXT TIME BUDDY!!!!");
                }
            }else if(l==2){
                f=false;
            }else{
                System.out.println("ENTER VALID OPTION");
            }
        }
    }
}