import java.util.Scanner;
public class BMExercicio05 {
    public static void main(String[] args) {
        System.out.println("inform the day of the week: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1: day = 1;
            System.out.println("Sunday");
            break;
            case 2: day = 2;
            System.out.println("Monday");
            break;
            case 3: day = 3;
            System.out.println("Tuesday");
            break;
            case 4: day = 4;
            System.out.println("Fourth");
            break;
            case 5: day = 5;
            System.out.println("Fifth");
            break;
            case 6: day = 6;
            System.out.println("Friday");
            break;
            case 7: day = 7;
            System.out.println("Saturday");
            break;
        }
        sc.close();
    }
}
