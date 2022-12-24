import javax.print.Doc;

import static UI.UImenu.*;
public class Main {
    public static void main(String[] args) {
        Doctor firstDoctor = new Doctor();
        firstDoctor.name = "Maicol";
        firstDoctor.showId();


        Doctor secondDoctor = new Doctor();
        secondDoctor.name = "Daniela";
        secondDoctor.showId();

        //Doctor thirdDoctor = new Doctor("Eskorbuto");

        firstDoctor.showName();
        secondDoctor.showName();

        //showMenu();

    }
}