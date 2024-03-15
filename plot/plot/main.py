import numpy as np
import matplotlib.pyplot as plt

mileage = np.array([10000, 50000, 90000])  # Example mileage values
prices = np.array([20000, 18000, 16000])   # Example sale prices

# Regression equation coefficients
b0 = 20842.531586695608
b1 = -0.07168147520192905

# Calculate the predicted prices based on the regression equation
predicted_prices = b0 + b1 * mileage

# Plot the actual data points
plt.scatter(mileage, prices, color='blue', label='Actual Prices')

# Plot the regression line
plt.plot(mileage, predicted_prices, color='red', label='Regression Line')

# Add labels and legend
plt.xlabel('Mileage')
plt.ylabel('Price')
plt.title('Linear Regression: Price of VW Used Cars based on Mileage')
plt.legend()

# Show the plot
plt.show()
