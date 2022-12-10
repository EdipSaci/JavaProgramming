package day20_Arrays;

public class task4 {
    public static void main(String[] args) {
/*
4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A

 */
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];



        for (int j = 0; j <names.length; j++) {

            if (scores[j]>=90) grades[j]= 'A';
            else if (scores[j]>=80) grades[j]= 'B';
            else if (scores[j]>=70) grades[j]= 'C';
            else if (scores[j]>=60) grades[j]= 'D';
            else   grades[j]= 'F';
            System.out.println(grades[j]);
        }


        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j] +"'s score is "+ scores[j]+ ", and grade is "+ grades[j]);
        }
    }
}
