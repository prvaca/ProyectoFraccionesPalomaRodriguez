package Clases;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        super();
        this.numerador = numerador;
        this.denominador = denominador;
    }
    /*
     * 	Añadir las siguientes operaciones a Fracción
     *
     *
     *
     * */
        public static Fraccion simplifica(Fraccion entrada) {
            int n1 = entrada.getNumerador();
            int n2 = entrada.getDenominador();

            int temp1 = n1;
            int temp2 = n2;

            while (n1 != n2) {
                if (n1 > n2) {
                    n1 = n1 - n2;

                } else {
                    n2 = n2 - n1;
                }
            }
            int n3 = temp1/n1;
            int n4 = temp2/n1;

            return new Fraccion(n3, n4);
        }
        /*

        public static Fraccion suma(Fraccion sumando1, Fraccion sumando2) {
        }
        public static Fraccion multiplicacion(Fraccion sumando1, Fraccion sumando2) {
        }
        public static Fraccion division(Fraccion sumando1, Fraccion sumando2) {
        }
    */
    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }


    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(numerador).append(" / ").append(denominador);
        return sb.toString();
    }

}
