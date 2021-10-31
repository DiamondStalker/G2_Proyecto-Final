package com.kkevinchoo.sia.models;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class docenteModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_usuario;
    private String nombre_usuario;
    private String segnombre_usuario;
    private String apellido_usuario;
    private String edad;
    private String genero; 
    private String correo; 
    private String contrasena;
    private String telefono;
    private String direccion;

    
    @OneToMany(mappedBy = "id_cita",cascade = CascadeType.ALL)
    private Set<estudianteModel> estudiantes;


    public int getId_usuario() {
        return this.id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return this.nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getSegnombre_usuario() {
        return this.segnombre_usuario;
    }

    public void setSegnombre_usuario(String segnombre_usuario) {
        this.segnombre_usuario = segnombre_usuario;
    }

    public String getApellido_usuario() {
        return this.apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public String getEdad(String edad) {
        return this.edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero(String genero) {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo(String correo) {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena(String contrasena) {
        return this.contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTelefono(String telefono) {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion(String direccion) {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    /*public void setEstado_usuario(boolean estado_usuario) {
        this.estado_usuario = estado_usuario;
    }*/

    public Set<estudianteModel> getEstudiantes() {
        return this.estudiantes;
    }

    public void setEstudiantes(Set<estudianteModel> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
}
