public class Doctor {
    //atributos
    int id;
    String name;
    String speciality;

    //metodo constructor, no es necesario sentenciarlo (escribirlo)
    Doctor(){
        //se puede añadir el comportamiento pero no es necesario por ahora.
    }
    //se puede tener dos opciones de construcción
    Doctor(String name){
        System.out.println("El nombre del doctor es: " + name);
    }

    //comportamientos
    public void showName(){
        System.out.println(name);
    }

}
