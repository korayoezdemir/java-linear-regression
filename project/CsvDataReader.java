package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvDataReader {
    public List<UsedCar> readDataFromCsv(String pathToCsv) throws IOException {
        List<UsedCar> vwCars = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToCsv))) {
            String line;
            br.readLine(); // Skip the header line

            while ((line = br.readLine()) != null) {
                String[] elements = line.split(",");
                if (elements[1].equalsIgnoreCase("Volkswagen") && elements[5].equalsIgnoreCase("used")) {
                    double mileage = Double.valueOf(elements[0]);
                    double price = Double.valueOf(elements[6]);
                    vwCars.add(new UsedCar(mileage, price));
                }
            }
        }
        return vwCars;
    }
}
