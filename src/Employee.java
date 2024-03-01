public class Employee {
    String name;
    double salary;
    int workHours, hireYears;

    public Employee(String name, double salary, int workHours, int hireYears) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYears = hireYears;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int calismaYili = 2021 - this.hireYears;
        if (calismaYili < 10) {
            return this.salary * 0.05;
        } else if (calismaYili >= 10 && calismaYili < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }


    public String toString(Employee emp) {
        System.out.println("Adı: " + emp.name + "\nMaaşı: " + emp.salary + "\nÇalışma Saati: " + emp.workHours + "\nBaşlangıç Yılı: " + emp.hireYears);
        System.out.println("Bonus: " + emp.bonus());
        System.out.println("RaiseSalary: " + emp.raiseSalary());
        System.out.println("Total Salary with tax and bonus: " + (emp.salary + emp.bonus() - emp.tax()));
        System.out.println("Total Salary: " + (emp.salary + emp.bonus() + emp.raiseSalary() - emp.tax()));
        return null;
    }
}


