package day31_Contructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        // 4 testers objects
        Tester tester1 =new Tester("Edip","QA",4646,110000);
        Tester tester2 =new Tester("Yusuf","SDET",1245,142000);
        Tester tester3 =new Tester("Ali","SE",44,135000);
        Tester tester4 =new Tester("Alex","SDET",23,115000);

        Tester[] testers= {tester2,tester3,tester4};

        //4 developers objects
        Developer developer1=new Developer("Olga",22,"Java Developer",125000);
        Developer developer2=new Developer("Aygun",39,"Java Master",185000);
        Developer developer3=new Developer("Tunc",28,"Software Developer",135000);
        Developer developer4=new Developer("Sinem",213,"Senior Developer",200000);

        Developer [] developers = {developer2,developer3,developer4};

        //1ScrumTeam object
        ScrumTeam scrumTeam = new ScrumTeam("Nigara","Huseyin","Neira", 14);

        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(developers);


        scrumTeam.addTester(tester1);
        scrumTeam.addDeveloper(developer1);
        System.out.println(scrumTeam);

        System.out.println("--------------------------------------------------");
        for (Tester eachTester : scrumTeam.testersList) {
            System.out.println(eachTester.name+ " : " + eachTester.salary);
        }

        System.out.println("--------------------------------------------------");

        for (Developer eachDeveloper : scrumTeam.devopsList) {
            System.out.println(eachDeveloper.name +" : "+ eachDeveloper.salary);
        }

        System.out.println("--------------------------------------------------");

        scrumTeam.removeTester(23);
        scrumTeam.removeDeveloper(22);
        System.out.println(scrumTeam);

    }
}
