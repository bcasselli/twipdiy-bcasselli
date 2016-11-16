package com.company;

import java.io.*;
import java.util.*;
// Importing tools

public class Main {

    public Main()
    {

    }
    public void addnew() throws Exception {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader readFile = new BufferedReader(new FileReader("StudentInfo.txt"));
        BufferedWriter writeFile = new BufferedWriter(new FileWriter("StudentInfo.txt", true));

        String f, c;
        System.out.println("Enter Student ID Number: ");
        String h = input.readLine();
        System.out.println("Enter Student's Full Name: ");
        f = input.readLine();
        System.out.println("Enter Course and Grade: ");
        c = input.readLine();

        int lineNum = 0;
        String line;

        while((line = readFile.readLine())!=null)
        {
            lineNum++;

            if (line.equals("Student ID Number: "+ h));
            {
                System.out.println("Student already exists!");
                break;
            } else {
                writeFile.newLine();
                writeFile.write("Student ID Number: "+ h);
                writeFile.newLine();
                writeFile.write("Full Name: "+ f);
                writeFile.newLine();
                writeFile.write("Course and Grade: "+ c);
                System.out.println(h + " " + f + " " + c + " " + "Student Information written to file!");
                break;

            }
        }
        writeFile.close();
        readFile.close();
    }
}
