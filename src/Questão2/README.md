# Formas Geométricas

Resolução do problema da segunda questão do Lab Week1.

Neste desafio, tivemos que criar uma classe abstrata de figuras geométricas que possui métodos para o cálculo da área e do perímetro. Este projeto foi dividido em várias classes diferentes.



### Código
Logo abaixo está todo o código das classe usada na resolução desse problema.

#### Class Main

    package Questão2;

    public class Main {
            public static void main(String[] args) {
                Circle circle = new Circle(5);
                circle.toStringR();

                Rectangle rectangle = new Rectangle(15,7);
                rectangle.toStringR();

                Triangle triangle = new EquillateralTriangle(7);
                triangle.toStringR();

                Rectangle square = new Square(2);
                square.toStringR();
            }
        }

#### Class Circle

    package Questão2;

    import Questão1.ConsoleColors;

    public class Circle extends FiguraGeometrica {
        private double raio, area, perimetro;
        public Circle(double raio) {
            this.raio = raio;

            this.area();
            this.perimetro();
        }

        @Override
        public void area() {
            this.area = Math.PI * raio * raio;
        }

        @Override
        public void perimetro() {
            this.perimetro = 2 * Math.PI * raio;
        }

        @Override
        public void toStringR() {
            System.out.println(" ");
            System.out.printf(ConsoleColors.CYAN_BOLD + "Círculo, área: %.2f perímetro: %.2f", this.area, this.perimetro);
            System.out.println(" ");
        }

    }

#### Class EquillateralTriangle

    package Questão2;

    import Questão1.ConsoleColors;

    public class EquillateralTriangle extends Triangle{
        public EquillateralTriangle(double base) {
            super(base, base, base);

        }
        @Override
        public void toStringR() {
            System.out.println(" ");
            System.out.printf(ConsoleColors.YELLOW_BOLD + "Triangulo Equilatero, área: %.2f perímetro: %.2f", area, perimetro);
            System.out.println(" ");

        }
    }

#### Class FiguraGeometrica

    package Questão2;

    public abstract class FiguraGeometrica {

        public abstract void area();
        public abstract void perimetro();

        public abstract void toStringR();

    }

#### Class IsoscelesTriangle

    package Questão2;

    import Questão1.ConsoleColors;

    public class IsoscelesTriangle extends Triangle{
        public IsoscelesTriangle(double base, double Lado1, double Lado2) {
            super(base, Lado1, Lado2);
        }

        @Override
        public void toStringR() {
            System.out.println(" ");
            System.out.printf(ConsoleColors.YELLOW_BOLD + "Triangulo Isósceles, área: %.2f perímetro: %.2f", area, perimetro);
            System.out.println(" ");

        }
    }

#### Class Rectangle

    package Questão2;

    import Questão1.ConsoleColors;

    public class Rectangle extends FiguraGeometrica {
        protected double area;
        private double base,altura, perimetro;

        public Rectangle(double base, double altura) {
            this.base = base;
            this.altura = altura;

            this.area();
            this.perimetro();
        }

        @Override
        public void area() {
            this.area = base * altura;
        }

        @Override
        public void perimetro() {
            this.perimetro = 2 * (base + altura);
        }

        @Override
        public void toStringR() {
            System.out.println(" ");
            System.out.printf(ConsoleColors.RED_BOLD + "Retângulo, área: %.2f perímetro: %.2f", this.area, this.perimetro);
            System.out.println(" ");
        }
    }

#### Class ScleneTriangle

    package Questão2;

    import Questão1.ConsoleColors;

    public class ScleneTriangle extends Triangle{
        public ScleneTriangle(double base, double Lado1, double Lado2) {
            super(base, Lado1, Lado2);
        }
        @Override
        public void toStringR() {
            System.out.println(" ");
            System.out.printf(ConsoleColors.YELLOW_BOLD + "Triangulo Escaleno, área: %.2f perímetro: %.2f", area, perimetro);
            System.out.println(" ");

        }
    }

#### Class Square

    package Questão2;

    import Questão1.ConsoleColors;

    public class Square extends Rectangle {
        private double comprimentoLado, perimetro;


        public Square(double comprimentoLado) {
            super(comprimentoLado,comprimentoLado );
            this.comprimentoLado = comprimentoLado;
            this.perimetro();
        }

        @Override
        public void perimetro() {
            this.perimetro = 4 * comprimentoLado;
        }

        @Override
        public void toStringR() {
            System.out.println(" ");
            System.out.printf(ConsoleColors.WHITE_BOLD + "Quadrado, área: %.2f perímetro: %.2f", area, this.perimetro);
            System.out.println(" ");
        }
    }

#### Class Triangle

    package Questão2;

    import Questão1.ConsoleColors;

    public class Triangle extends FiguraGeometrica {
        private double base, lado1, lado2;
        protected double area, perimetro;

        public Triangle(double base, double Lado1, double Lado2) {
            this.base = base;
            this.lado1 = Lado1;
            this.lado2 = Lado2;

            this.area();
            this.perimetro();
        }

        @Override
        public void area() {
            double semiperimmetro = (base + lado1 + lado2) / 2;
            // Usamos a fórmula de Heron para calcular a área
            this.area = Math.sqrt(semiperimmetro*(semiperimmetro - base)*(semiperimmetro - lado1)*(semiperimmetro - lado2));
        }

        @Override
        public void perimetro() {
            this.perimetro = base + lado1 + lado2 ;
        }

        @Override
        public void toStringR() {
            System.out.println(" ");
            System.out.printf(ConsoleColors.YELLOW_BOLD + "Triangulo, área: %.2f perímetro: %.2f", this.area, this.perimetro);
            System.out.println(" ");

        }
    }

### Resultado da execução

![Imagem Terminal](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o2/Imagens2/ResultadoEmExecucao2.jpeg)



### Diagrama de classes

![Diagrama de classes](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o2/Imagens2/DiagramaDeClasses2.jpeg)

### Fluxograma

![Fluxograma](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o2/Imagens2/Fluxograma2.jpeg)

## Autores

- [@Danilo505](https://github.com/Danilo505)


## Link do Projeto no GitHub

- [Questão 2](https://github.com/Danilo505/activity-programming2/blob/main/src/Quest%C3%A3o2/Main.java)