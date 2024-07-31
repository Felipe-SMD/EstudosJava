import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159265359;
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.print("1-Quadrado \n2-Retângulo \n3-Paralelogramo \n4-Losango \n5-Trapézio \n6-Triângulo \n7-Círculo \n0-Encerrar \nDigite de 0 a 7 para selecionar a figura: ");
                int figura = scanner.nextInt();

                switch (figura) {
                    case 1:
                        System.out.println("Calculando a área do Quadrado");
                        System.out.print("Lado: ");
                        double ladoQuadrado = scanner.nextDouble();
                        double areaQuadrado = Math.pow(ladoQuadrado, 2);
                        System.out.println("Área do quadrado = " + areaQuadrado);
                        break;
                    case 2:
                        int opcaoRetangulo = -1;
                        boolean entradaValida = false;
                    
                        while (!entradaValida) {
                            try {
                                System.out.println("Calculando a área do Retângulo");
                                System.out.print("1-Largura e altura \n2-A diagonal e um lado \nDigite 1 ou 2 para o que possuir: ");
                                opcaoRetangulo = scanner.nextInt();
                    
                                if (opcaoRetangulo < 1 || opcaoRetangulo > 2) {
                                    System.out.println("Erro: Opção inválida");
                                } else {
                                    entradaValida = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Erro: Opção inválida");
                                scanner.next(); 
                            }
                        }
                    
                        switch (opcaoRetangulo) {
                            case 1:
                                try {
                                    System.out.print("Largura: ");
                                    double larguraRetangulo = scanner.nextDouble();
                                    System.out.print("Altura: ");
                                    double alturaRetangulo = scanner.nextDouble();
                                    double areaRetangulo1 = larguraRetangulo * alturaRetangulo;
                                    System.out.println("Área do retângulo = " + areaRetangulo1);
                                } catch (InputMismatchException e) {
                                    System.out.println("Erro: Opção inválida");
                                    scanner.next();
                                }
                                break;
                    
                            case 2:
                                try {
                                    System.out.print("Diagonal: ");
                                    double diagonal = scanner.nextDouble();
                                    System.out.print("Lado: ");
                                    double ladoRetangulo = scanner.nextDouble();
                                    double areaRetangulo2 = ladoRetangulo * Math.sqrt(Math.pow(diagonal, 2) - Math.pow(ladoRetangulo, 2));
                                    System.out.println("Área do retângulo = " + areaRetangulo2);
                                } catch (InputMismatchException e) {
                                    System.out.println("Erro: Opção inválida");
                                    scanner.next();
                                }
                                break;
                    
                            default:
                                System.out.println("Erro: Opção inválida");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Calculando a área do Paralelogramo");
                        int opcaoParalelogramo = -1;
                        System.out.print("1-Base e altura \n2-Dois lados adjacentes e o ângulo entre eles \n3-Vetores u=(ux,uy) e v=(vx,vy)\nDigite de 1 a 3 para o que possuir: ");
                        opcaoParalelogramo = scanner.nextInt();
                        while (opcaoParalelogramo < 1 || opcaoParalelogramo > 3) {
                            System.out.println("Opção inválida. Tente novamente.");
                            System.out.print("1-Base e altura \n2-Dois lados adjacentes e o ângulo entre eles \n3-Vetores u=(ux,uy) e v=(vx,vy)\nDigite de 1 a 3 para o que possuir: ");
                            opcaoParalelogramo = scanner.nextInt();
                        }
                        switch (opcaoParalelogramo) {
                            case 1:
                                System.out.print("Base: ");
                                double baseParalelogramo = scanner.nextDouble();
                                System.out.print("Altura: ");
                                double alturaParalelogramo = scanner.nextDouble();
                                double areaParalelogramo1 = baseParalelogramo * alturaParalelogramo;
                                System.out.println("Área do Paralelogramo = " + areaParalelogramo1);
                                break;
                            case 2:
                                System.out.print("Lado 1: ");
                                double ladoParalelogramo1 = scanner.nextDouble();
                                System.out.print("Lado 2: ");
                                double ladoParalelogramo2 = scanner.nextDouble();
                                System.out.print("Ângulo: ");
                                double anguloParalelogramo = scanner.nextDouble();
                                double areaParalelogramo2 = ladoParalelogramo1 * ladoParalelogramo2 * Math.sin(Math.toRadians(anguloParalelogramo));
                                System.out.println("Área do Paralelogramo = " + areaParalelogramo2);
                                break;
                            case 3:
                                System.out.print("Vetor ux: ");
                                double ux = scanner.nextDouble();
                                System.out.print("Vetor uy: ");
                                double uy = scanner.nextDouble();
                                System.out.print("Vetor vx: ");
                                double vx = scanner.nextDouble();
                                System.out.print("Vetor vy: ");
                                double vy = scanner.nextDouble();
                                double areaParalelogramo3 = Math.abs(ux * vy - uy * vx);
                                System.out.println("Área do Paralelogramo = " + areaParalelogramo3);
                                break;
                            default:
                                System.out.println("Erro: Opção inválida");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Calculando a área do Losango");
                        int opcaoLosango = -1;
                        System.out.print("1-Diagonal maior e Diagonal menor \n2-Lado e ângulo interno entre lados adjacentes \nDigite 1 ou 2 para o que possuir: ");
                        opcaoLosango = scanner.nextInt();
                        while (opcaoLosango < 1 || opcaoLosango > 2) {
                            System.out.println("Opção inválida. Tente novamente.");
                            System.out.print("1-Diagonal maior e Diagonal menor \n2-Lado e ângulo interno entre lados adjacentes \nDigite 1 ou 2 para o que possuir: ");
                            opcaoLosango = scanner.nextInt();
                        }
                        switch (opcaoLosango) {
                            case 1:
                                System.out.print("Diagonal Maior: ");
                                double diagonalMaior = scanner.nextDouble();
                                System.out.print("Diagonal Menor: ");
                                double diagonalMenor = scanner.nextDouble();
                                double areaLosango = (diagonalMaior * diagonalMenor) / 2;
                                System.out.println("Área do Losango = " + areaLosango);
                                break;
                            case 2:
                                System.out.print("Lado: ");
                                double ladoLosango = scanner.nextDouble();
                                System.out.print("Ângulo: ");
                                double anguloLosango = scanner.nextDouble();
                                double areaLosango2 = Math.pow(ladoLosango, 2) * Math.sin(Math.toRadians(anguloLosango));
                                System.out.println("Área do Losango = " + areaLosango2);
                                break;
                            default:
                                System.out.println("Erro: Opção inválida");
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("Calculando a área do Trapézio");
                        System.out.print("Base maior: ");
                        double baseMaior = scanner.nextDouble();
                        System.out.print("Base menor: ");
                        double baseMenor = scanner.nextDouble();
                        System.out.print("Altura: ");
                        double alturaTrapezio = scanner.nextDouble();
                        double areaTrapezio = (baseMaior + baseMenor) * alturaTrapezio / 2;
                        System.out.println("Área do Trapézio = " + areaTrapezio);
                        break;
                    case 6:
                        System.out.println("Calculando a área do Triângulo");
                        int opcaoTriangulo = -1;
                        while (opcaoTriangulo < 1 || opcaoTriangulo > 3) {
                            System.out.print("1-Base e altura \n2-Todos os lados \n3-Dois lados e um ângulo entre eles \nDigite de 1 a 3 para o que possuir: ");
                            opcaoTriangulo = scanner.nextInt();
                            if (opcaoTriangulo < 1 || opcaoTriangulo > 3) {
                                System.out.println("Erro: Opção inválida. Tente novamente.");
                            }
                        }
                        switch (opcaoTriangulo) {
                            case 1:
                                System.out.print("Base: ");
                                double baseTriangulo = scanner.nextDouble();
                                System.out.print("Altura: ");
                                double alturaTriangulo = scanner.nextDouble();
                                double areaTriangulo1 = (baseTriangulo * alturaTriangulo) / 2;
                                System.out.println("Área do Triângulo = " + areaTriangulo1);
                                break;
                            case 2:
                                System.out.print("Lado 1: ");
                                double ladoTriangulo1 = scanner.nextDouble();
                                System.out.print("Lado 2: ");
                                double ladoTriangulo2 = scanner.nextDouble();
                                System.out.print("Lado 3: ");
                                double ladoTriangulo3 = scanner.nextDouble();
                                double semiPerimetro = (ladoTriangulo1 + ladoTriangulo2 + ladoTriangulo3) / 2;
                                double areaTriangulo2 = Math.sqrt(semiPerimetro * (semiPerimetro - ladoTriangulo1) * (semiPerimetro - ladoTriangulo2) * (semiPerimetro - ladoTriangulo3));
                                System.out.println("Área do Triângulo = " + areaTriangulo2);
                                break;
                            case 3:
                                System.out.print("Lado 1: ");
                                double ladoTrianguloA = scanner.nextDouble();
                                System.out.print("Lado 2: ");
                                double ladoTrianguloB = scanner.nextDouble();
                                System.out.print("Ângulo: ");
                                double anguloTriangulo = scanner.nextDouble();
                                double areaTriangulo3 = 0.5 * ladoTrianguloA * ladoTrianguloB * Math.sin(Math.toRadians(anguloTriangulo));
                                System.out.println("Área do Triângulo = " + areaTriangulo3);
                                break;
                            default:
                                System.out.println("Erro: Opção inválida");
                                break;
                        }
                        break;
                    case 7:
                        System.out.println("Calculando a Área do Círculo");
                        int opcaoCirculo = -1;
                        while (opcaoCirculo < 1 || opcaoCirculo > 5) {
                            System.out.print("1-Raio \n2-Diâmetro \n3-Coroa Circular \n4-Setor Circular(ângulo) \n5-Setor Circular(arco) \nDigite de 1 a 5 para o que possuir: ");
                            opcaoCirculo = scanner.nextInt();
                            if (opcaoCirculo < 1 || opcaoCirculo > 5) {
                                System.out.println("Erro: Opção inválida. Tente novamente.");
                            }
                        }
                        switch (opcaoCirculo) {
                            case 1:
                                System.out.print("Raio: ");
                                double raio = scanner.nextDouble();
                                double areaCirculo1 = PI * Math.pow(raio, 2);
                                System.out.println("Área do Círculo = " + areaCirculo1);
                                break;
                            case 2:
                                System.out.print("Diâmetro: ");
                                double diametro = scanner.nextDouble();
                                double areaCirculo2 = PI * (Math.pow(diametro, 2)) / 4;
                                System.out.println("Área do Círculo = " + areaCirculo2);
                                break;
                            case 3:
                                System.out.print("Raio maior: ");
                                double raioMaior = scanner.nextDouble();
                                System.out.print("Raio menor: ");
                                double raioMenor = scanner.nextDouble();
                                double areaCoroaCircular = (PI * Math.pow(raioMaior, 2)) - (PI * Math.pow(raioMenor, 2));
                                System.out.println("Área da Coroa Circular = " + areaCoroaCircular);
                                break;
                            case 4:
                                System.out.print("Ângulo: ");
                                double anguloSetor = scanner.nextDouble();
                                System.out.print("Raio: ");
                                double raioSetor = scanner.nextDouble();
                                double areaSetor1 = (anguloSetor * PI * Math.pow(raioSetor, 2)) / 360;
                                System.out.println("Área do Setor Circular = " + areaSetor1);
                                break;
                            case 5:
                                System.out.print("Arco: ");
                                double arcoSetor = scanner.nextDouble();
                                System.out.print("Raio: ");
                                double raioSetor2 = scanner.nextDouble();
                                double areaSetor2 = (arcoSetor * raioSetor2) / 2;
                                System.out.println("Área do Setor Circular = " + areaSetor2);
                                break;
                            default:
                                System.out.println("Erro: Opção inválida");
                                break;
                        }
                        break;

                    case 0:
                        System.out.println("Programa encerrado.");
                        continuar = false;
                        break;

            default:
                System.out.println("Erro: Número inválido");
                break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite somente números");
                scanner.next();
            }
        }

        scanner.close();
    }
}
