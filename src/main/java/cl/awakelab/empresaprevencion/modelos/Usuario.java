package cl.awakelab.empresaprevencion.modelos;

import java.util.Scanner;

public class Usuario {

    private int idUsuario;
    private String nombre;
    private String nacimiento;
    private Integer run;
    private String tipo;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String nacimiento, Integer run, String tipo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.run = run;
        this.tipo = tipo;
    }

    public Usuario(String nombre, String nacimiento, Integer run, String tipo) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.run = run;
        this.tipo = tipo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Integer getRun() {
        return run;
    }

    public void setRun(Integer run) {
        this.run = run;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", nacimiento='" + nacimiento + '\'' +
                ", run=" + run +
                ", tipo='" + tipo + '\'' +
                '}';
    }


}

