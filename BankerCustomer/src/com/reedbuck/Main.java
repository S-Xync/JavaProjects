package com.reedbuck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        List<Customer> customersList=new ArrayList<>();
        List<Employee> employeeList=new ArrayList<>();
        customersList.add(new Customer("Raj",101,50000));
        customersList.add(new Customer("Sunil",156,4000));
        customersList.add(new Customer("Amal",204,61000));
        employeeList.add(new Employee("Rithik",101,50000));
        employeeList.add(new Employee("Sumit",1007,80000));
        employeeList.add(new Employee("Ankur",2005,20000));
        System.out.println("Customer Login --> 1\n" +
                "Employee Login --> 2\n");
        int opt=scanner.nextInt();
        if (opt==1){
            customerAlgorithm(customersList);
        }else if (opt==2){
            employeeAlgorithm(employeeList,customersList);
        }
    }
    public static void customerAlgorithm(List<Customer>customers){
        Customer processingCustomer=null;
        int proId;
        boolean flag=false;
        int option=5;
        System.out.println("Please Enter your Id\n");
        proId=scanner.nextInt();
        for (Customer customer:customers) {
            if (proId==customer.getId()){
                processingCustomer=customer;
                flag=true;
                break;
            }
        }
        try{//checking
            if (!flag){
                throw new UserNotFound();
            }
            //customer found
            System.out.println("Here are your details\n");
            optionProcessorCus(4,processingCustomer);
            System.out.println("\n");
            optionProcessorCus(option,processingCustomer);
            while (option!=6){
                System.out.println("Give Your Input : ");
                option=scanner.nextInt();
                optionProcessorCus(option,processingCustomer);
            }
        }catch (UserNotFound e){
            System.out.println(e);
            System.out.println("Check your Id");
        }
        return;
    }
    public static void employeeAlgorithm(List<Employee>employees,List<Customer>customers){
        Employee processingEmployee=null;
        boolean flag=false;
        int proId;
        int option=3;
        System.out.println("Please Enter your Id\n");
        proId=scanner.nextInt();
        for (Employee employee:employees) {
            if (proId==employee.getId()){
                processingEmployee=employee;
                flag=true;
                break;
            }
        }
        try{//checking
            if (!flag){
                throw new UserNotFound();
            }
            //employee found
            System.out.println("Here are your details\n");
            optionProcessorEmp(2,processingEmployee,customers);
            System.out.println("\n");
            optionProcessorEmp(option,processingEmployee,customers);
            while (option!=4){
                System.out.println("Give Your Input : ");
                option=scanner.nextInt();
                optionProcessorEmp(option,processingEmployee,customers);
            }
        }catch (UserNotFound e){
            System.out.println(e);
            System.out.println("Check your Id");
        }
        return;
    }

    public static void printOptionsCus(){
        System.out.println("1 --> Get Balance\n" +
                "2 --> Withdraw Money\n" +
                "3 --> Deposit Money\n" +
                "4 --> Get Details\n" +
                "5 --> Get Available Options\n"+
                "6 --> Exit\n");
    }
    public static void optionProcessorCus(int option,Customer customer) {
        switch (option){
            case 1:
                System.out.println(customer.getBalance());
                break;
            case 2:
                System.out.println("How much do you want to Withdraw?\n");
                System.out.println(customer.withdrawMoney(scanner.nextInt()));
                break;
            case 3:
                System.out.println("How much do you want to deposit?\n");
                System.out.println(customer.depositMoney(scanner.nextInt()));
                break;
            case 4:
                System.out.println(customer);
                break;
            case 5:
                printOptionsCus();
                break;
            case 6:
                return;

        }
    }

    public static void printOptionsEmp(){
        System.out.println("1 --> Display Customer List\n" +
                "2 --> Display Employee Details\n" +
                "3 --> Get Available Options\n"+
                "4 --> Exit\n");
    }
    public static void optionProcessorEmp(int option, Employee employee, List<Customer> customers){
        switch (option){
            case 1:
                employee.displayCustomerList(customers);
                break;
            case 2:
                System.out.println(employee);
                break;
            case 3:
                printOptionsEmp();
                break;
            case 4:
                return;
        }
    }

}
