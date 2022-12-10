package day09_If_Statement;

public class ChooseLanguage {
    public static void main(String[] args) {

        int selection = 4;
        String language = "";
        if (selection>=1 && selection<=5){
            if (selection==1){
                language= "Hello, thank for your call";
            }else if (selection==2){
                language="Hola, gracias para llamar";
            } else if (selection==3) {
                language="Merhaba, aradiginiz icin tesekkurler";
            } else if (selection==4) {
                language="Privet, spasibo za vash zvonok";
            } else if (selection==5) {
                language="Merci ,pour votre appel";
            }

        }else {
            System.out.println("Invalid Number");
        }


        System.out.println(language);





    }
}
