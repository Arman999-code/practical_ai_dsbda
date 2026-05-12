import java.io.BufferedReader;
import java.io.StringReader;

public class WeatherAnalysis {

    public static void main(String[] args) throws Exception {

        // Sample weather dataset
        String data =
                "Date,Temperature,DewPoint,WindSpeed\n" +
                "2026-04-01,32.5,18.2,12.3\n" +
                "2026-04-02,34.1,19.0,10.5\n" +
                "2026-04-03,31.8,17.5,14.2\n" +
                "2026-04-04,33.0,18.8,11.0\n" +
                "2026-04-05,35.2,20.1,9.8";

        // Read data line by line
        BufferedReader br = new BufferedReader(new StringReader(data));

        double totalTemp = 0;
        double totalDew = 0;
        double totalWind = 0;

        int count = 0;
        String line;

        // Skip header row
        br.readLine();

        // Process each record
        while ((line = br.readLine()) != null) {

            String[] values = line.split(",");

            double temp = Double.parseDouble(values[1]);
            double dew = Double.parseDouble(values[2]);
            double wind = Double.parseDouble(values[3]);

            totalTemp += temp;
            totalDew += dew;
            totalWind += wind;

            count++;
        }

        // Calculate averages
        double avgTemp = totalTemp / count;
        double avgDew = totalDew / count;
        double avgWind = totalWind / count;

        // Display formatted output
        System.out.printf("Average Temperature: %.2f%n", avgTemp);
        System.out.printf("Average Dew Point: %.2f%n", avgDew);
        System.out.printf("Average Wind Speed: %.2f%n", avgWind);
    }
}
