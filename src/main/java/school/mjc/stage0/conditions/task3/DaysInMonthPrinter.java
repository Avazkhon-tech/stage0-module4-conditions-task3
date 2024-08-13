package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {

        if (month > 12 || month < 0) {
            System.out.println("wrong number!");
            return;
        }

        if (month == 2) {
            System.out.println(28);
            return;
        }

        int[] months30 = {4, 6, 9, 11};
        for (int i : months30) {
            if (month == i) {
                System.out.println(30);
                return;
            }
        }

        System.out.println(31);



    }
}
