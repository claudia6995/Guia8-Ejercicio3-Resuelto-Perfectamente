
package Class;
public class Persona {
   private String Nombre;
   private int edad;
   private String sexo;
   private double peso;
   private double altura;

    public Persona() {
    }

    public Persona(String Nombre, int edad, String sexo, double peso, double altura) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

/** @verride
   public String toSring(){
   return "Persona  {" + " Nombre ="+ Nombre  + ", edad= " + edad + ", sexo " + sexo + ", peso" + peso +t "altura " +altura+ "}";
   }*/
}
