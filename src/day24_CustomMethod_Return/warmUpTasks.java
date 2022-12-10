package day24_CustomMethod_Return;

public class warmUpTasks {
    public static void main(String[] args) {

        initial("Walter", "White");
        domain("edipsaci@gmail.com");

        System.out.println("--------------------------");
        String[] emails ={"gelsene@gmail.com","jim@yahoo.com","ramda@cydeo.com","ride@gmail.com"};

        for (String email : emails) {
            domain(email);
        }
        months(95);
        nameOfDays(5);
    }

    //1. Create a method that can display the initials of the person
    public static void initial (String firstName , String lastName){
        String initial =firstName.charAt(0)+ "."+ lastName.charAt(0);
        initial= initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    //2. Create a method that can display the domain of the email
    public static void domain(String email){
        String ch =email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + ch);
    }


    //3. Create a method that can display the name of the month based on the given number to the method
    public static void months (int numberOfMonths){
        String name ="";
        if (numberOfMonths>=1  && numberOfMonths<=12){
            name= (numberOfMonths==1)? "Jan" :(numberOfMonths==2)? "Feb"  :(numberOfMonths==3)? "Mar" :(numberOfMonths==4)? "Apr" :(numberOfMonths==5)? "May" :(numberOfMonths==6)? "Jun" :(numberOfMonths==7)? "Jul" :(numberOfMonths==8)? "Aug" :(numberOfMonths==9)? "Sep" :(numberOfMonths==10)? "Oct" :(numberOfMonths==11)? "Nov": "Dec";

        }else {
            name= "Invalid";
        }
        System.out.println("Month Name: "+ name);
    }
    public static void nameOfDays(int number){
        String result = "";
        if (number>=1 && number<=7){
           result= (number==1)? "Mon" :(number==2)?"Tue":(number==3)?"Wed":(number==4)?"Thu":(number==5)?"Fri":(number==6)?"Sat": "Sun";
        }else
            result="Invalid";
        System.out.println("Name of day "+result );
    }
}
/*
	5. Create a method that can print how many days a month has

*/