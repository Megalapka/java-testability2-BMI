/*
Сервис, который рассчитывает Индекс Массы Тела (Body Mass Index).
BMI = кг/м**2
*/

//Рост указывать в метрах
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        System.out.println((float) service.calculate(57.2,1.54));
    }
}

//есть ли у float округление?