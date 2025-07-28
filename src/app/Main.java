package app;

public class Main {

    public static void main(String[] args) {

        DataProvider provider = new DataProvider();

        // Обробка масиву даних найменувань товарів
        DataHandler<String> stringDataHandler = new DataHandler<>();
        String namesOutput = stringDataHandler.handleData(provider.getProductNames());
        getOutput("Products: " + namesOutput);

        // Обробка масиву даних про суми продажів
        DataHandler<Double> doubleDataHandler = new DataHandler<>();
        String salesOutput = doubleDataHandler.handleData(provider.getSalesAmounts());
        getOutput("Sales, EUR: " + salesOutput);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
