import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    }
    public static void FightTank(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Здравствуй путник, ты прибыл на бои у тебя есть выбор и 3 классов \n1)Tank\n2)Health\n3)Damage");
        int player = sc.nextInt();
        if(player==1){
            System.out.println("Выбери героя за которого хочешь играть\n1)Райнхард\n2)Tiny\n3)Голем");
            player= sc.nextInt();
            if (player==1){
                Tank tn = new Tank(1000,75,25,60,100,"Райнхард",5,250);
            }
            else if (player == 2){
                Tank tn = new Tank(900,95,30,50,100,"Tiny",5,250);
            }
            else if (player == 3){
                Tank tn = new Tank(1200,65,20,60,100,"Голем",5,250);
            }

        }
    }
}
