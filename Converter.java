import java.util.Scanner;

public class Converter {
    // Método para converter Celsius para Fahrenheit
    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Método para converter Fahrenheit para Celsius
    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        // Solicita ao usuário a entrada em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheitConvertido = converter.celsiusParaFahrenheit(celsius);
        System.out.println("Temperatura em Fahrenheit: " + fahrenheitConvertido);

        // Solicita ao usuário a entrada em Fahrenheit
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsiusConvertido = converter.fahrenheitParaCelsius(fahrenheit);
        System.out.println("Temperatura em Celsius: " + celsiusConvertido);

        scanner.close();
    }
}
