import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //rock 0 paper 1 scissor 2
        System.out.println("enter your choice rock paper or scissor!!");
        Scanner sc =new Scanner(System.in);
        int userinput=sc.nextInt();
        Random r=new Random();
        int computerinput=r.nextInt(3);

                if(userinput==0){
                    System.out.println("You choose rock");
                }else if(userinput==1){
                    System.out.println("you choice paper");
                } else if (userinput==2) {
                    System.out.println("you choose scissor!!");
                }
                if(computerinput==0){
                    System.out.println("computer choose rock");
                }
       else if(computerinput==1){
            System.out.println("computer choose paper");
        }
      else  if(computerinput==2){
            System.out.println("computer choose scissor");
        }
        if(userinput==computerinput){
            System.out.println("draw");
        } else if ((userinput==0 && computerinput==2)||(userinput==1 && computerinput==0)||(userinput==2 && computerinput==1)) {
            System.out.println("you won");

        }else{
            System.out.println("computer won!!");
        }
        System.out.println("computer input "+computerinput);
    }
}