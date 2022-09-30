package Problem4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();
        System.out.println("...Welcome to Employee Management System....");
        System.out.println("Do you want to Enter the detail of Employee: ? (Y/N)");
        String res = sc.next();
        int i =1;
        while(res.equals("y")){
            System.out.println("Enter the Employee Details: "+ i);
            System.out.println("------------");
            System.out.println("Enter the Employee Id: ");
            int empId = sc.nextInt();
            System.out.println("Enter the Employee Name:");
            String name = sc.next();
            System.out.println("Enter the Employee Salary:");
            double salary = sc.nextDouble();
            System.out.println("Enter the Department Id:");
            int depId = sc.nextInt();
            System.out.println("Enter the Department Name:");
            String depName = sc.next();
            Employee employee = new Employee(empId,name,salary,new Department(depId,depName));
            employeeList.add(employee);
            System.out.println("Employee Details added successfully..");
            i++;
            System.out.println("Do you want to Enter the detail of Employee: ? (Y/N)");
            res = sc.next();
        }
        System.out.println("Thanks you---");
        while(res.equals("n")){

            System.out.println("Enter the your choice");
            System.out.println("1: Find Employee in Particular Department");
            System.out.println("2: Remove Particular Employee");
            System.out.println("3: Print Employees in All Departments");
            int result = sc.nextInt();
            if(result == 3){
                if(employeeList.isEmpty())
                    System.out.println("Employee doesn't exists..");

            else
                for (Employee employeeDetails: employeeList){
                    System.out.println(employeeDetails);
                    System.out.println("------------");
                }

                System.out.println("Do you want to Exit: ? (Y/N)");
                res = sc.next();
                continue;
                }
            if(result == 1){
                System.out.println("Enter the Department Id:");
                int matchId = sc.nextInt();
                System.out.println("Employee in Department: "+ matchId);
                if(!employeeList.isEmpty()) {
                    for (Employee employeeDetails : employeeList) {
                        if (employeeDetails.getDepartment().getDepartmentId() == matchId) {
                            System.out.println("Employee Name: " + employeeDetails.getEmployeeName());
                            System.out.println("Employee Id: " + employeeDetails.getEmployeeId());
                            System.out.println("Employee Salary: " + employeeDetails.getEmployeeSalary());
                            System.out.println("=====================");

                        }
                    }
                }
                System.out.println("Do you want to Exit: ? (Y/N)");
                res = sc.next();
                continue;
            }
            if(result==2){
                System.out.println("Enter Department Id:");
                int matchDepId = sc.nextInt();
                System.out.println("Enter the Employee Id:");
                int matchEmpId = sc.nextInt();
            if(employeeList.size()>0) {
                for (Employee employeeDetails : employeeList) {
                    if ((employeeDetails.getEmployeeId() == matchEmpId) && (employeeDetails.getDepartment().getDepartmentId() == matchDepId)) {

//                        System.out.println(employeeDetails.getEmployeeName()+" Employee is removed from the department"+ matchDepId+"successfully");
                        employeeList.remove(employeeDetails);
                        System.out.println(employeeDetails.getEmployeeName() + " Employee is removed from the department " + matchDepId + " successfully");
                            break;
                    }
                    else {
                        System.out.println("Employee doesn't exists..");
                    }
                }
            }
            else{
                System.out.println("Employee doesn't exists..");
            }
                System.out.println("Do you want to Exit: ? (Y/N)");
                res = sc.next();
                continue;
            }

            }
        System.out.println("Thanks you---");

        }

    }

