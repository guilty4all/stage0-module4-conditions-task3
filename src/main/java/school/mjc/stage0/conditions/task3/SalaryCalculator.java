package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float result ;
        if(salary <= 10000){
            result = salary - (salary/100)*15;
            System.out.println(result);
        } else if (salary < 10000 || salary <= 20000) {
            result = salary - (salary/100)*18;
            System.out.println(result);
        } else if (salary > 20000) {
            result = salary - (salary/100)*20;
            System.out.println(result);
        } else if (salary < 0 || salary <= -1.0) {
            System.out.println("wrong input!");
        }
    }
}
