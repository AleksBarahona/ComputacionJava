import java.util.InputMismatchException;
import java.util.Scanner;
//Aleks Barahona Hernandez #AL02891318
//18/10/23
public class main {
    public static void main(String[] args) {
        //creacion de dos objetos perro y un objeto Scanner
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        Scanner teclado = new Scanner(System.in);

        //se le pide al usuario que ingrese el nombre de los 2 objetos perro
        System.out.print("Ingrese el nombre del 1er perro: ");
        perro1.setNombre(teclado.next());
        System.out.print("Ingrese el nombre del 2do perro: ");
        perro2.setNombre(teclado.next());


        //se le pide al usuario que introduzca la raza de los 2 perros
        System.out.print("Ingrese la raza del 1er perro: ");
        perro1.setRaza(teclado.next());
        System.out.print("Ingrese la raza del 2do perro: ");
        perro2.setRaza(teclado.next());

        //se le pide al usuario que ingrese la edad de los 2 objetos perro
        //excepcion
        try {
            System.out.print("Ingrese la edad del 1er perro: ");
            perro1.setEdad(teclado.nextInt());
            System.out.print("Ingrese la edad del 2do perro: ");
            perro2.setEdad(teclado.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("El tipo de dato ingresado es incorrecto");
        }

        //invocacion de los 2 metodos de cada clase perro
        System.out.println("Hora de alimentar al perro " + perro1.getNombre());
        System.out.println("Que le dara de comer? ");
        String tipoComida;
        tipoComida = teclado.next();
        //excepcion
        int gramos = 0;
        try {
            System.out.println("Cuantos gramos?");
            gramos = teclado.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("El tipo de dato ingresado es incorrecto");
        }
        ;
        perro1.comer(tipoComida, gramos);
        System.out.println("El perro " + perro1.getNombre() + " dice " + perro1.ladrar());

        System.out.println("Hora de alimentar al perro " + perro2.getNombre());
        System.out.println("Que le dara de comer?");
        tipoComida = teclado.next();
        //excepcion
        try {
            System.out.println("Cuantos gramos?");
            gramos = teclado.nextInt();
        }catch (InputMismatchException e){
            System.out.println("El tipo de dato ingresado es incorrecto");
        };
        perro2.comer(tipoComida, gramos);
        System.out.println("El perro " + perro2.getNombre() + " dice " + perro2.ladrar());
    }
}
