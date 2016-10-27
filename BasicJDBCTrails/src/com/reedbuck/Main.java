package com.reedbuck;

import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String dbString="jdbc:mysql://localhost:3306/datacrate?user=root&password=mysql&useSSL=false";
        try {
            Connection connection= DriverManager.getConnection(dbString);
            ResultSet resultSet=null;
            Statement statement=connection.createStatement();
            statement.executeUpdate("CREATE TABLE students(id INTEGER,name VARCHAR(20),age INTEGER,sex VARCHAR(1))");
            ArrayList<Student> studentsList=new ArrayList<>();
            studentsList.add(new Student(1,"Zara",18,'F'));
            studentsList.add(new Student(2,"Justin",21,'M'));
            studentsList.add(new Student(3,"Alan",25,'M'));
            studentsList.add(new Student(4,"Taylor",26,'F'));
            studentsList.add(new Student(5,"Mike",35,'M'));
            studentsList.add(new Student(6,"Donna",40,'F'));
            PreparedStatement preparedStatement=null;
            preparedStatement=connection.prepareStatement("INSERT INTO students VALUES(?,?,?,?)");
            for (Student student:studentsList) {
                preparedStatement.setInt(1,student.getId());
                preparedStatement.setString(2,student.getName());
                preparedStatement.setInt(3,student.getAge());
                preparedStatement.setString(4, String.valueOf(student.getSex()));
                preparedStatement.executeUpdate();
            }
            resultSet=statement.executeQuery("SELECT * FROM students");
            int id=0;
            String name=null;
            int age=0;
            char sex='\0';
            System.out.println("Id\tName\tAge\tSex");
            while (resultSet.next()){
                id=resultSet.getInt("id");
                name=resultSet.getString("name");
                age=resultSet.getInt("age");
                sex=resultSet.getString("sex").charAt(0);
                System.out.println(id+"\t"+name+"\t"+age+"\t"+sex);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
