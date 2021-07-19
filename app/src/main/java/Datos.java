import java.util.Date;

public class Datos {
    private String nombre;
    private Date fechaNac;
    private int telefono;
    private String e_mail;
    private String descripcion;

    public Datos(String nombre, Date fechaNac, int telefono,String e_mail,String descripcion){
        this.nombre=nombre;
        this.fechaNac=fechaNac;
        this.telefono=telefono;
        this.e_mail=e_mail;
        this.descripcion=descripcion;
    }

    public String   getNombre()                         { return nombre; }
    public void     setNombre(String nombre)            { this.nombre = nombre; }
    public Date     getFechaNac()                       { return fechaNac; }
    public void     setFechaNac(Date fechaNac)          { this.fechaNac = fechaNac; }
    public int      getTelefono()                       {  return telefono; }
    public void     setTelefono(int telefono)           {  this.telefono = telefono; }
    public String   getE_mail()                         {  return e_mail; }
    public void     setE_mail(String e_mail)            { this.e_mail = e_mail; }
    public String   getDescripcion()                    { return descripcion;  }
    public void     setDescripcion(String descripcion)  { this.descripcion = descripcion; }


}
