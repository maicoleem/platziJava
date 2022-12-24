public class Doctor {
    //atributos
    static int id = 0;
    String name;
    String speciality;

    //metodo constructor, no es necesario sentenciarlo (escribirlo)
    Doctor(){
        //se puede añadir el comportamiento pero no es necesario por ahora.
        Doctor.id++;
    }
    //se puede tener dos opciones de construcción
    Doctor(String name){
        System.out.println("El nombre del doctor es: " + name);
        Doctor.id++;
    }

    //comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("El ID del Doctor es: " + id);
    }

}
