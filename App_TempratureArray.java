import java.util.Scanner;

public class App_TempratureArray 
{
    public static final int NUM_TEMPERATURES = 10;
    public static final double FREEZING_POINT = 32.0;
   
    public static void main(String[] args) 
    {
        double[] temperatures = new double[NUM_TEMPERATURES];
        Scanner scanner = new Scanner(System.in);
    
    // Input temperatures

    for (int i = 0; i < NUM_TEMPERATURES; i++) 
    {
        System.out.print("Enter temperature " + (i + 1) + ": ");
        temperatures[i] = scanner.nextDouble();
    }
   
    // Print temperatures

        System.out.print("Temperatures: ");
        for (double temp : temperatures) 
        {
            System.out.print(temp + " ");
        }
        System.out.println();
   
        double sum = 0;
        for (double temp : temperatures) 
        {
            sum += temp;
        }
           double average = sum / NUM_TEMPERATURES;
           System.out.println("Average temperature: " + average);
   
    // Count number of temps below freezing and number above freezing
        int numBelowFreezing = 0;
        int numAboveFreezing = 0;

        for (double temp : temperatures) 
           {
            if (temp < FREEZING_POINT) 
            {
                numBelowFreezing++;
            } 
            else 
            {
                 numAboveFreezing++;
            }
           }
           System.out.println("Number of temperatures below freezing: " + numBelowFreezing);
           System.out.println("Number of temperatures above freezing: " + numAboveFreezing);
   
    // Find highest temperature
        double highestTemp = temperatures[0];
        for (int i = 1; i < NUM_TEMPERATURES; i++) 
        {
            if (temperatures[i] > highestTemp) 
            {
                highestTemp = temperatures[i];
            }
        }
        System.out.println("Highest temperature: " + highestTemp);
   
    // Find lowest temperature
        double lowestTemp = temperatures[0];
        for (int i = 1; i < NUM_TEMPERATURES; i++) 
        {
            if (temperatures[i] < lowestTemp) 
            {
                lowestTemp = temperatures[i];
            }
        }
        System.out.println("Lowest temperature: " + lowestTemp);

    // Input temperatures

    for (int i = 0; i < NUM_TEMPERATURES; i++) 
    {
        System.out.print("Enter temperature " + (i + 1) + ": ");
        temperatures[i] = scanner.nextDouble();
    }
    
    boolean quit = false;
    
        while (!quit) {
            System.out.println("1. Print temperatures");
            System.out.println("2. Count number of temps below freezing");
            System.out.println("3. Count number of temps above freezing");
            System.out.println("4. Find highest temperature");
            System.out.println("5. Find lowest temperature");
            System.out.println("6. Search for temperature index");
            System.out.println("7. Quit");
    
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
    
                switch (choice) {
                    case 1:
                        printTemperatures(temperatures);
                        break;
                    case 2:
                        countTempsBelowFreezing(temperatures);
                        break;
                    case 3:
                        countTempsAboveFreezing(temperatures);
                        break;
                    case 4:
                        findHighestTemperature(temperatures);
                        break;
                    case 5:
                        findLowestTemperature(temperatures);
                        break;
                    case 6:
                        System.out.print("Enter temperature to search for: ");
                        double searchTemp = scanner.nextDouble();
                        int index = searchTemperatureIndex(temperatures, searchTemp);
                        if (index == -1) 
                        {
                            System.out.println(searchTemp + " not found");
                        } 
                        else 
                        {
                            System.out.println(searchTemp + " found at index " + index);
                        }
                        break;
                    case 7:
                        quit = true;
                        break;
                    default:
                        System.out.println("Invalid choice, please try again");
                }
            }
        }

// Method to count number of temps below freezing

private static int printTemperatures(double[] temperatures) 
{
    return 0;

}

private static int searchTemperatureIndex(double[] temperatures, double searchTemp) 
{
    return 0;
}

public static void countTempsBelowFreezing(double[] temperatures) 
{
    int count = 0;
    for (double temp : temperatures) 
    {
        if (temp < FREEZING_POINT) 
        {
            count++;
        }
    }
    System.out.println("Number of temperatures below freezing: " + count);
}

// Method to count number of temps above freezing

public static void countTempsAboveFreezing(double[] temperatures) 
{
    int count = 0;
    for (double temp : temperatures) 
    {
        if (temp > FREEZING_POINT) 
        {
            count++;
        }
    }
    System.out.println("Number of temperatures above freezing: " + count);
}

// Method to find highest temperature

public static void findHighestTemperature(double[] temperatures) 
{
    double maxTemp = temperatures[0];
    for (int i = 1; i < temperatures.length; i++) 
    {
        if (temperatures[i] > maxTemp) 
        {
            maxTemp = temperatures[i];
        }
    }
    System.out.println("Highest temperature: " + maxTemp);
}

// Method to find lowest temperature
public static void findLowestTemperature(double[] temperatures) 
{
    double minTemp = temperatures[0];
    for (int i = 1; i < temperatures.length; i++)
    {
        if (temperatures[i] < minTemp)
        {
            minTemp =temperatures[i];
        }
    }
    System.out.println("lowest temperature: " + minTemp);

}
}
