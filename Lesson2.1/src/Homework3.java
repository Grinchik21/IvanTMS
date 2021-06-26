public class Homework3 {
    public static void main(String[] args) {
        int[] mass = {2, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i];
        }
        System.out.println("Сумма равна " + sum);
        int average = sum / 5;
        System.out.println("Среднее значение массива " + average);


    }
}
