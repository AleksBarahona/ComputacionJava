//Aleks Barahona Hernandez #AL02891318
public class Perro {
    //variables(atributos)
    private String nombre;
    private String raza;
    private int edad;
    private int peso;

    //metodos getters setters
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //metodo comer que no devuelve ningun valor
    public void comer(String tipoComida, double gramos){
        double nuevoPeso = gramos + peso;
    }

    //metodo ladrar que retorna un String
    public String ladrar() {
        String ladrido = "guau guau";
       return ladrido;
    }
}
