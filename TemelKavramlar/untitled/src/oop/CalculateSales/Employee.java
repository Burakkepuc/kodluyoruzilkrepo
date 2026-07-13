package oop.CalculateSales;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    double bonus() {
        if (this.workHours > 40) {
            return 30 * (this.workHours - 40);
        } else{
            return 0;
        }
    }

    double raiseSalary() {
        int yearsWorked = 2021 - this.hireYear;
        if (yearsWorked < 10) {
            return (this.salary * 0.05);
        } else if (yearsWorked < 20) {
            return (this.salary * 0.10);
        } else {
            return (this.salary * 0.15);
        }
    }

    public String toString() {

        return "Adı : " + this.name + "\n" +
                "Maaşı : " + this.salary + "\n" +
                "Çalışma Saati : " + this.workHours +"\n" +
                "Başlangıç yılı : " + this.hireYear +"\n" +
                "Vergi : " + this.tax() +"\n" +
                "Bonus : " + this.bonus() +"\n" +
                "Maaş artışı : " + this.raiseSalary() +"\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + this.bonus() - this.tax()) +"\n" +
                "Toplam Maaş : " + (this.salary + this.raiseSalary() + this.bonus() - this.tax());
    }
}
