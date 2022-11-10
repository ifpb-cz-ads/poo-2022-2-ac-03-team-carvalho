import java.util.Scanner;
public class CTExercicio01 {
    public static void main(String[] args) {
        System.out.println("Informe a idade do participante: ");
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        if(idade < 16){
            System.out.println("O candidato não pode votar");
        }
        else if(idade >= 16 && idade <= 17 || idade > 65 ){
            System.out.println("Votar é facultativo");
        }
        else if(idade >=18 && idade <= 65){
            System.out.println("O voto do candidato é obrigatório");
        }
        sc.close();
    }
}
