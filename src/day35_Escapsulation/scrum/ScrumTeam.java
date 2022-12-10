package day35_Escapsulation.scrum;

import java.util.ArrayList;

public class ScrumTeam {
    private String PO ,BA,SM;
    private ArrayList<Tester> testersList = new ArrayList<>();
    private ArrayList<Developer> devopsList = new ArrayList<>();

    public ScrumTeam(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public String getPO() {
        return PO;
    }
    public void setPO(String PO) {
        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public ArrayList<Tester> getTestersList() {
        return testersList;
    }


    public ArrayList<Developer> getDevopsList() {
        return devopsList;
    }

    public void hireTester(Tester tester){
        testersList.add(tester);
    }
    public void hireDeveloper(Developer developer){
        devopsList.add(developer);
    }
    public void removeTester(Tester tester){
        testersList.removeIf(p-> p.equals(tester));
    }
    public void removeDeveloper(Developer developer){
        devopsList.removeIf(p-> p.equals(developer));
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", testersList=" + testersList +
                ", devopsList=" + devopsList +
                '}';
    }
}
