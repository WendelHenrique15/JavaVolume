import java.util.Scanner;

public class Java3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio = 0.0, altura = 0.0, lado = 0.0, comprimento = 0.0, largura = 0.0;
        double volume = 0.0;
        int opcao = 0;

        do{
            System.out.println("-----------------------------------------------");
            System.out.println("Programa: calcular volume de figura geometrica ");
            System.out.println("-----------------------------------------------");
            System.out.println("1 - Volume do Cilindro                         ");
            System.out.println("2 - Volume do Cone                             ");
            System.out.println("3 - Volume do Cubo                             ");
            System.out.println("4 - Volume da Esfera                           ");
            System.out.println("5 - Volume do hexagono                         ");
            System.out.println("6 - Volume do paralelepipedo                   ");
            System.out.println("7 - Volume da Piramide                         ");
            System.out.println("0 - Sair                                       ");
            System.out.println("-----------------------------------------------");
            System.out.println("Escolha sua opção:                             ");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Cilindro.calcularCilindro(raio, altura);

                    System.out.printf("O volume do cilindro é: %.2f \n\n\n" ,volume);
                    break;
                case 2:
                    System.out.println("Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Cone.calularCone(raio, altura);

                    System.out.printf("O volume do cone é: %.2f \n\n\n" ,volume);
                    break;
                case 3:
                    System.out.println("Digite o valor do lado: ");
                    lado = sc.nextDouble();

                    volume = Cubo.calcularCubo(lado);

                    System.out.printf("O volume do cubo é: %.2f \n\n\n" ,volume);
                    break;
                case 4:
                    System.out.println("Digite o valor do raio: ");
                    raio = sc.nextDouble();

                    volume = Esfera.calcularEsfera(raio);

                    System.out.printf("O volume do raio é: %.2f \n\n\n" ,volume);
                    break;
                case 5:
                    System.out.println("Digite o valor do lado: ");
                    lado = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Hexagono.calcularHexagono(lado, altura);

                    System.out.printf("O volume do Hexagono é: %.2f \n\n\n" ,volume);
                    break;
                case 6:
                    System.out.println("Digite o valor do comprimento: ");
                    comprimento = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();
                    System.out.println("Digite o valor da largura: ");
                    largura = sc.nextDouble();

                    volume = Paralelepipedo.calcularParalelepipedo(comprimento, largura, altura);

                    System.out.printf("O volume do paralelepipedo é: %.2f \n\n\n" ,volume);
                    break;
                case 7:
                    System.out.println("Digite o valor do lado: ");
                    lado = sc.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Piramide.calcularPiramide(lado, altura);

                    System.out.printf("O volume do piramide é: %.2f \n\n\n" ,volume);
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA");
                    break;
            }

        }while (opcao != 0);
    }
}
