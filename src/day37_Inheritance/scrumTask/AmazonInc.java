package day37_Inheritance.scrumTask;

public class AmazonInc {
    public static void main(String[] args) {
        String company="Amazon Inc";
        ProductOwner po=new ProductOwner("Recep",31,'M',1,160000,company);
        BusinessAnalyst ba=new BusinessAnalyst("Cihad",32,'M',11,11000,company);
        ScrumMaster sm=new ScrumMaster("Asiya",32,'F',17,112000,company);

        Tester tester1=new Tester("Edip",32,'M',"SDET",10,11000,company);
        Tester tester2=new Tester("Yusuf",37,'M',"QA",18,10000,company);
        Tester tester3=new Tester("Muhtar",34,'M',"QE",19,19000,company);
        Tester tester4=new Tester("Nadir",33,'M',"QA",89,17000,company);

        Tester[] testers={tester1,tester2,tester3,tester4};

        Developer developer1=new Developer("Daniel",40,'M',"Java Developer",8,12000,company);

        ScrumTeam scrumTeam= new ScrumTeam(po,ba,sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTester(testers);

        System.out.println(scrumTeam);

        System.out.println("------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name);
        }

    }
}
