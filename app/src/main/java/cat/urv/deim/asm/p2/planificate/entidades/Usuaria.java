package cat.urv.deim.asm.p2.planificate.entidades;


//Contiene la informacion de las usuarias
public class Usuaria {
    private  String nombre;
    private  String email;
    private  String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
