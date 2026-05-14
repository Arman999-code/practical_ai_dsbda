public static void main(String[] args) {

    // Sample dataset (Date, Temperature, DewPoint, WindSpeed)
    String data =
            "2023-01-01,25.5,18.2,12.0\n" +
            "2023-01-02,28.0,19.5,10.5\n" +
            "2023-01-03,22.3,17.0,8.0\n" +
            "2023-01-04,26.7,18.8,11.2";

    String[] lines = data.split("\n");

    double tempSum = 0, dewSum = 0, windSum = 0;
    int count = 0;

    for (String line : lines) {
        String[] parts = line.split(",");

        double temperature = Double.parseDouble(parts[1]);
        double dewPoint = Double.parseDouble(parts[2]);
        double windSpeed = Double.parseDouble(parts[3]);

        tempSum += temperature;
        dewSum += dewPoint;
        windSum += windSpeed;

        count++;
    }

    double avgTemp = tempSum / count;
    double avgDew = dewSum / count;
    double avgWind = windSum / count;

    System.out.println("Average Temperature: " + avgTemp);
    System.out.println("Average Dew Point: " + avgDew);
    System.out.println("Average Wind Speed: " + avgWind);
}
