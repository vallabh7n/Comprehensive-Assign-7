package com.assignment1.Comprehensive_Assignment_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteDate {

    public static void main(String[] args) {
        try {
            // Load the Excel file
            FileInputStream excelFile = new FileInputStream("C:\\Users\\ritik\\OneDrive\\Desktop\\Comprehensive Assignment\\data");
            Workbook workbook = new XSSFWorkbook(excelFile);

            // Get the first sheet in the workbook
            Sheet sheet = workbook.getSheetAt(0);

            // Create a list to store data
            List<Student> students = new ArrayList();

            // Iterate through each row in the sheet, starting from the second row (index 1)
            for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                Row row = sheet.getRow(rowIndex);

                // Read data from the row
                String name = row.getCell(0).getStringCellValue();
                String course = row.getCell(1).getStringCellValue();
                double fee = row.getCell(2).getNumericCellValue();

                // Create a Student object and add it to the list
                students.add(new Student(name, course, fee));
            }

            // Close the workbook
            workbook.close();

            // Display the data
            for (Student student : students) {
                System.out.println(student);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    static class Student {
        private String name;
        private String course;
        private double fee;

        public Student(String name, String course, double fee) {
            this.name = name;
            this.course = course;
            this.fee = fee;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Course: " + course + ", Fee: $" + fee;
        }
    }
}
