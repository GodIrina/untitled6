public class BmiService {
    public double calculate (double height, double weight){
        double cal = weight/(height * height);
        return cal;

    }
}
