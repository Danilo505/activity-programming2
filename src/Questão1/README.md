
# Seleção de quadrante e último dígito fatorial

Esse projeto aborda a resolução dos problemas I e II da primeira questão da Lab Week1.




## Seleção de Quadrante

O objetivo desse desafio é ler dois números x e y,levando em conta se seu valor é negativo ou positovo, estaremos imprimindo o quadrante.

### Código
No código abaixo, estamos lendo um número x e realizando validações para verificar se ele está dentro do limite de (-1000 a 1000). Se o número fornecido estiver dentro desse limite, o código continua sua execução. Em seguida, lemos um valor y e aplicamos a mesma validação.


Após a validação dos valores, verificamos se o valor de x é negativo ou positivo e, com base nessa validação, aplicamos a mesma verificação ao valor de y.


Por fim, imprimimos na tela o quadrante correspondente, dependendo das validações realizadas.

    package Questão1;

    import java.util.Scanner;

    public class SelecaoQuadrante {
        Scanner teclado = new Scanner(System.in);
        private int numberX, numberY;


        public SelecaoQuadrante() {
            System.out.print(ConsoleColors.YELLOW_BOLD + "Digite um número inteiro de x(-1000 à 1000): ");
            this.numberX = teclado.nextInt();
            do{
                if ( this.numberX >= -1000 && this.numberX <= 1000 && this.numberX != 0){
                    break;
                }else{
                    System.out.println(ConsoleColors.RED_BOLD + "Número invalido! Tente novamente");
                    System.out.print(ConsoleColors.YELLOW_BOLD + "Digite um número inteiro de x(-1000 à 1000): ");
                    this.numberX = teclado.nextInt();
                }

            }while (true);

            System.out.print(ConsoleColors.YELLOW_BOLD + "Digite um número inteiro de y(-1000 à 1000): ");
            this.numberY = teclado.nextInt();
            do{
                if ( this.numberY >= -1000 && this.numberY <= 1000 && this.numberY != 0){
                    break;
                }else{
                    System.out.println(ConsoleColors.RED_BOLD + "Número invalido! Tente novamente");
                    System.out.print(ConsoleColors.YELLOW_BOLD + "Digite um número inteiro de y(-1000 à 1000): ");
                    this.numberY = teclado.nextInt();
                }

            }while (true);
            quadrante();
        }

        public void quadrante(){
            if (this.numberX < 0){
                if (this.numberY < 0){
                    System.out.println(ConsoleColors.WHITE_BOLD + "Quadrante 3");
                }else{
                    System.out.println(ConsoleColors.WHITE_BOLD + "Quadrante 1");
                }
            }else{
                if (this.numberY < 0){
                    System.out.println(ConsoleColors.WHITE_BOLD + "Quadrante 4");
                }else{
                    System.out.println(ConsoleColors.WHITE_BOLD + "Quadrante 2");
                }
            }
        }

    }

### Resultado da execução

![Imagem Terminal](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o1/Imagens1/ResultadoEmExecucao1.1.jpeg)



### Fluxograma

![Fluxograma](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o1/Imagens1/Fluxograma1.1.jpeg)

## Último Dígito Fatorial

O segundo desafio consiste em calcular o valor de n números fornecidos pelo usuário (esses números são os casos de teste). Após a digitação de todos os números, procedemos ao cálculo do fatorial de cada valor e exibimos apenas o último dígito do resultado.


## Código

Neste código abaixo, vemos uma validação para o número de casos, aonde esse número não pode ser menor que 1 e nem maior que 10.Com o número  validado, pedimos que o usuário adicione um total de valores correspondete ao total de casos.

Para finalizar, calculamos o fatorial de cada valor dígitado anteriormente, convertemos esse valor em String e imprimimos o último dígito do valor resultante do fatorial.

    package Questão1;

    import java.util.Scanner;

    public class FatorialLD {
        Scanner teclado = new Scanner(System.in);
        private int quantidade;


        public FatorialLD() {
            System.out.print(ConsoleColors.YELLOW_BOLD + "Digite o número de casos de prova: ");
            this.quantidade = teclado.nextInt();

            do{
                if (this.quantidade > 1 && this.quantidade < 10){
                    break;
                }else{
                    System.out.println(ConsoleColors.RED_BOLD + "Você digitou um número de casos invalidos");
                    System.out.print(ConsoleColors.GREEN_BOLD + "Digite o número de casos de prova t(2 à 9): ");
                    this.quantidade = teclado.nextInt();
                }
            }while (true);

            int[] numbers = new int[this.quantidade];

            for (int i = 0; i < numbers.length; i++) {
                int numberCaso;
                System.out.print(ConsoleColors.WHITE_BOLD + "Digite um número: ");
                numberCaso = teclado.nextInt();

                numbers[i] = numberCaso ;
            }

            this.ultimo_digits(numbers);

        }

        public void ultimo_digits(int[] numbers){
            int[] calcs = new int[this.quantidade];
            int calcIndex = 0;

            for (int number : numbers ) {
                int fatorial = 1;
                for (int i = 1; i <= number ; i++) {
                    fatorial *= i;
                }
                calcs[calcIndex] = fatorial;
                calcIndex += 1;
            }

            for (int calc: calcs ) {
                String calcString = String.valueOf(calc);
                int index = calcString.length();
                System.out.println(calcString.charAt(index - 1));
            }
        }
    }

### Resultado da execução
![Imagem Terminal](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o1/Imagens1/ResultadoEmExecu%C3%A7%C3%A3o1.2.jpeg)

### Fluxograma
![Fluxograma](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o1/Imagens1/Fluxograma1.2.jpeg)

## Autores

- [@Danilo505](https://github.com/Danilo505)


## Link do Projeto no GitHub


- [Questão 1](https://github.com/Danilo505/activity-programming2/tree/main/src/Quest%C3%A3o1)
