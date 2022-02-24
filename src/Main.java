public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        //height - рост;
        //weight - вес;

        double bmi = service.calculate(1.71, 78);
        System.out.printf("Индекс массы тела - %.2f %n",  bmi);

    }
}