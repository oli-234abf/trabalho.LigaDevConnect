public class ConversorTemperatura {
    
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Conversor de Temperatura");
        System.out.println("-----------------------");
        
        System.out.println("Escolha a conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        
        if (opcao == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusParaFahrenheit(celsius);
            System.out.printf("%.1f°C = %.1f°F\n", celsius, fahrenheit);
        } 
        else if (opcao == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitParaCelsius(fahrenheit);
            System.out.printf("%.1f°F = %.1f°C\n", fahrenheit, celsius);
        }
        else{
            System.out.println("Opção inválida!");
        }
        
        scanner.close();
    }
}