public class Main {
    public static void main(String[] args) {
        Doctor firstDoctor = new Doctor();
        Doctor secondDoctor = new Doctor();
        Doctor thirdDoctor = new Doctor("Eskorbuto");
        firstDoctor.name = "Maicol";
        secondDoctor.name = "Daniela";
        firstDoctor.showName();
        secondDoctor.showName();
    }
}