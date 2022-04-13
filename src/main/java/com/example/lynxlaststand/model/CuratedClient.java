package com.example.lynxlaststand.model;

public class CuratedClient {

    private long id;

    private String enrollment;

    private double salary;

    private boolean atRisk;


    public CuratedClient() {
        super();
    }

    public CuratedClient(String enrollment, double salary, boolean atRisk) {
        this.enrollment = enrollment;
        this.salary = salary;
        this.atRisk = atRisk;

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isAtRisk() {
        return atRisk;
    }

    public void setAtRisk(boolean atRisk) {
        this.atRisk = atRisk;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CuratedClient that = (CuratedClient) o;

        if (id != that.id) return false;
        if (Double.compare(that.salary, salary) != 0) return false;
        if (atRisk != that.atRisk) return false;
        return enrollment.equals(that.enrollment);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + enrollment.hashCode();
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (atRisk ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CuratedClient{" +
                "id=" + id +
                ", enrollment='" + enrollment + '\'' +
                ", salary=" + salary +
                ", atRisk=" + atRisk +
                '}';
    }
}