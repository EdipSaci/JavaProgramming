package day31_Contructors;

import java.util.ArrayList;
import java.util.Arrays;

public class SaciMembers {
    public static void main(String[] args) {
        SaciFamily member1= new SaciFamily("ibrahim","father","yenikent",55,'B',6500);

        SaciFamily member2 = new SaciFamily("emine","mother","yenikent",55,'B', 0);
        SaciFamily member3= new SaciFamily("edip","big son","yenikent",32,'B',0);
        SaciFamily member4= new SaciFamily("Enes","2th son","sincan",25,'A',5500);
        SaciFamily member5= new SaciFamily("Elif","daughter","yenikent",21,'C',5500);

        SaciFamily[] members = {member1,member2,member3,member4,member5};


        ArrayList<SaciFamily> membersList= new ArrayList<>(Arrays.asList(members));
        membersList.removeIf(p-> !p.location.equals("sincan"));
        System.out.println(membersList);



        member1.living();
        member1.money();
    }



}
