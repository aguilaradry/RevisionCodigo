
public class CodeReviewExample {
    public static void main(String[] args) {
        System.out.println("Iniciando ejemplo de revisión de código...");
        int resultado = calcularSuma(5, 15);
        System.out.println("El resultado es: " + resultado);
    }

    public static int calcularSuma(int a, int b) {
        if (a > 0 && b > 0) {
            return a + b;
        }
        return 0;
    }
}
