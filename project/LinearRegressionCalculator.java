package project;

import java.util.List;

public class LinearRegressionCalculator {
    public void performLinearRegression(List<UsedCar> cars) {
        double sumX = 0, sumY = 0, sumX2 = 0, sumXY = 0;
        int n = cars.size();

        for (UsedCar car : cars) {
            double mileage = car.getMileage();
            double price = car.getPrice();
            sumX += mileage;
            sumY += price;
            sumX2 += Math.pow(mileage, 2);
            sumXY += mileage * price;
        }

        double xMean = sumX / n;
        double yMean = sumY / n;
        double b1 = (sumXY - n * xMean * yMean) / (sumX2 - n * Math.pow(xMean, 2));
        double b0 = yMean - b1 * xMean;

        System.out.println("Linear regression equation: y = " + b0 + " + " + b1 + "x");
    }
}
