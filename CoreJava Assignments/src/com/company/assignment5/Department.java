package com.company.assignment5;

/**
 * Created by DEEPU on 1/21/2017.
 */
public class Department {
   private int deptId;
   private String deptName;
   private String location;

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object Otherdept) {
        if (this == Otherdept) return true;
        if (Otherdept == null || getClass() != Otherdept.getClass()) return false;

        Department that = (Department) Otherdept;

        if (deptId != that.deptId) return false;
        if (!deptName.equals(that.deptName)) return false;
        return location.equals(that.location);

    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = deptId;
        result = 31 * result + deptName.hashCode();
        result = 31 * result + location.hashCode();
        return result;
    }
}
