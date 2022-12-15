public class Variables {
    public static void main(String[] args){
        //Declarando variables
        int speed;
        speed = 10;
        System.out.println(speed);
        speed = speed + 20;
        System.out.println(speed);
        speed += 40;
        System.out.println(speed);

        //variable tipo texto
        String employedName = "Maicol";
        System.out.println(employedName);
        employedName += " Escobar";
        System.out.println(employedName);
        var alberto ="alberto";
        System.out.println(alberto);

        //operadores de incremento
        int lifes = 5;
            //prefija
        int attempt = 15 + ++lifes;
        System.out.println("intentos: "+ attempt +" Vidas: "+ lifes);
            //posfija
        lifes = 5;
        int failures = 2 + lifes++;
        System.out.println("fallos: "+ failures + " Vidas: "+ lifes);

    }
}
