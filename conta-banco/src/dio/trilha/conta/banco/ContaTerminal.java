package dio.trilha.conta.banco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco DIO");

        //Coletando os dados
        System.out.println("Por favor, informe seu nome");
        String nome = sc.nextLine();

        System.out.println("Digite a sua agência: ");
        String agencia = sc.nextLine();

        System.out.println("Digite o número da sua conta:");
        int num = sc.nextInt();

        //Fica meio estranho o próprio cliente digitar o saldo, não?
        System.out.println("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá "+nome+", obrigado por criar uma conta no Banco DIO, sua agência é: "+agencia+", conta: "+num+" e seu saldo é de R$"+saldo);


    }

}
