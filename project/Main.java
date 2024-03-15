package project;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String pathToCsv = "project/autoscout24-germany-dataset.csv";
        CsvDataReader reader = new CsvDataReader();
        LinearRegressionCalculator calculator = new LinearRegressionCalculator();

        try {
            List<UsedCar> vwCars = reader.readDataFromCsv(pathToCsv);
            calculator.performLinearRegression(vwCars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
