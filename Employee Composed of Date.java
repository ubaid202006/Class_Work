class Date {
     int day;
     int month;
     int year;;

    public Date(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }
}

class Employee {
    private String name;
    private Date joiningDate;   // Employee HAS-A Date

    public Employee(String n, Date d) {
        this.name = n;
        this.joiningDate = d;
    }

    public void show() {
        System.out.println(name);
        System.out.println(joiningDate.day + "/" +joiningDate.month + "/" +joiningDate.year);
    }
}

public class Main {
    public static void main(String[] args) {
        Date d = new Date(6, 9, 2026);
        Employee e = new Employee("Ubaid", d);

        e.show();
    }
}
