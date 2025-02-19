package Employee;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    int year;
    double raise;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax = 0;
        this.bonus = 0;
        this.year = 2021;
        this.raise = 0;

    }

    void employeeInfo() {
        System.out.println("ADI     :" + this.name);
        System.out.println("MAAŞI   :" + this.salary);
        System.out.println("ÇALIŞMA SAATİ   :" + this.workHours);
        System.out.println("İŞE BAŞLANGIÇ TARİHİ    :" + this.hireYear);

    }

    void tax() {
        if (this.salary < 1000) {
            System.out.println("Vergi   : Vergi Dilimine Girmemektedir.");
        } else {
            this.tax = this.salary * 0.03;
            System.out.println("Vergi   :" + this.tax);
        }
    }

    void bonus() {
        if (this.workHours <= 40) {
            System.out.println("Bonus   :Çalışma Saati Yetersiz.");
        } else {
            int extraTime = workHours - 40;
            this.bonus = extraTime * 30;
            System.out.println("Bonus   :" + this.bonus);
        }
    }

    void raiseSalary() {
        if (this.year - this.hireYear < 10) {
            this.raise=this.salary*0.05;
            System.out.println("Maaş Artışı    :" + this.raise);
        }
        if (this.year - this.hireYear >= 10 && this.year - this.hireYear < 20) {
            this.raise=this.salary*0.1;
            System.out.println("Maaş Artışı    :" + this.raise);
        }
        if (this.year - this.hireYear > 20) {
            this.raise=this.salary*0.15;
            System.out.println("Maaş Artışı    :" + this.raise);
        }
    }
    void salaryInfo(){
        System.out.println("Vergi ve Bonuslar ile birlikte Maaş    :"+(this.salary+this.bonus-this.tax));
        System.out.println("Net Maaş    :"+(this.salary+this.bonus+this.raise-this.tax));
    }

    void run() {
        employeeInfo();
        bonus();
        tax();
        raiseSalary();
        salaryInfo();
    }
}
