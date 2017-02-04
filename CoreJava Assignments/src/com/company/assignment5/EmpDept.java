package com.company.assignment5;

import java.util.Scanner;

public class EmpDept {
    private static  Scanner scan= new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        EmpDept ede =new EmpDept();
        Employee[] uniqueEmpArray = ede.recieveInputsFromConsole();
        ede.displayResults(uniqueEmpArray);
    }

    /**
     * method to receive inputs from console
     * @return
     */
    Employee[] recieveInputsFromConsole(){
        scan = new Scanner(System.in);
        System.out.println("enter Employee count:");
        int EmployeeCount = scan.nextInt();
        Employee[] originalEmpArray = new Employee[EmployeeCount];
        Employee[] uniqueEmpArray = new Employee[EmployeeCount];
        System.out.println("");
        for(int i=0;i<=EmployeeCount-1;i++){
            System.out.println("Employee Details"+i+" :");
            System.out.println("Employee Id:");
            int eId =scan.nextInt();
            System.out.println("Employee Name:");
            String eName = scan.next();
            System.out.println("Dept Name:");
            String edeptName = scan.next();
            System.out.println("Salary:");
            Double esalary = scan.nextDouble();

            Employee ed =populateEmployeeDetails(eId,eName,edeptName,esalary);
            originalEmpArray[i] =ed;
        }
        uniqueEmpArray = eliminateDuplicateEmployeeRecords(originalEmpArray);
        return uniqueEmpArray;
    }


    Employee populateEmployeeDetails(int eId, String eName, String edeptName, double esalary){

        Employee ed = new Employee();
        ed.setId(eId);
        ed.setName(eName);
        ed.setDept(edeptName);
        ed.setSalary(esalary);

        return ed;

    }

    /**
     * Logic to eliminate the duplicates
     * @param orignialEmpArray
     * @return
     */
    Employee[] eliminateDuplicateEmployeeRecords(Employee[] orignialEmpArray){
        Employee[] filteredArray = new Employee[orignialEmpArray.length];
        filteredArray = orignialEmpArray.clone();
        for(int i=0; i<=orignialEmpArray.length-1; i++){
            Employee ed1 = orignialEmpArray[i];
            for(int j=i+1,y=0;j<=orignialEmpArray.length-1;j++){
                Employee ed2 = orignialEmpArray[j];
                if(ed1.equals(ed2)){
                    filteredArray[j] =null;
                }
            }
        }


        return filteredArray;

    }

    /**
     * This method used for displaying the results after filtering the results.
     * @param array
     */
    void displayResults(Employee[] array){
        System.out.println("****************************************");
        System.out.println("********Unique Student Records**********");
        System.out.println("****************************************");
        System.out.println("Id"+"     "+"Name"+"     "+"     "+"deptName"+"     "+"Salary");
        for(int i=0;i<=array.length-1;i++){
            if(array[i]!=null){
                Employee ed = array[i];
                System.out.println(ed.toString());
            }
        }
    }
}
