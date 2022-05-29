public class BmiService {
    public double calculate(double weight, double growthInMeter) {
        double bmi = weight / (growthInMeter * growthInMeter);
        return bmi;
    }
}
