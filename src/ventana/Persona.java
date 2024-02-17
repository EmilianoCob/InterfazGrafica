
package ventana;

public class Persona {
    private String nombre, apellidos, email,celular, direcccion;

    public Persona(String nombre, String apellidos, String email, String celular, String direcccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.celular = celular;
        this.direcccion = direcccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDirecccion() {
        return direcccion;
    }

    public void setDirecccion(String direcccion) {
        this.direcccion = direcccion;
    }
    
    @Override
    public String toString(){ //Sobreescribimos el metodo para que nos aparezca el nombre de nuestro objeto y NO nos aparezca en el comboBox la referencia del objeto. 
        return this.nombre+ " " +this.apellidos;
    }
    
}
