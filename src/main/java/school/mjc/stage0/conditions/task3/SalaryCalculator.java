package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        /*
        Basic Salary <= 10000: taxes - 15%.
        10000 < Basic Salary <= 20000: taxes - 18%
        Basic Salary > 20000 : taxes - 20%
        Basic salary < 0 -> "wrong input!"

         */

        double afterTax = 0;
        if (salary <= 0) {
            System.out.println("wrong input!");
            return;
        }

        if (salary <= 10000) {
            afterTax = salary - salary/100 * 15;
            System.out.println(afterTax);
            return;
        }

        if (salary <= 20000) {
            afterTax = salary - salary/100 * 18;
            System.out.println(afterTax);
            return;
        }

        afterTax = salary - salary / 5.0;
        System.out.println(afterTax);



    }
}
