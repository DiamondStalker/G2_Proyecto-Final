package com.kkevinchoo.sia.models;

import javax.persistence.*;

@Entity
@Table(name = "cita")
public class estudianteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private int id_cita;
    private String eps;
    private int id_usuario;
    private String horario;
    private String tipo_vacuna;
    private int dosis;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private docenteModel profesor_id_profesor;

    public int getid_cita() {
        return this.id_cita;
    }

    public void setid_cita(int id_cita) {
        this.id_cita = id_cita;
    }

    public String geteps() {
        return this.eps;
    }

    public void seteps(String eps) {
        this.eps = eps;
    }

    public int getid_usuario() {
        return this.id_usuario;
    }

    public void setid_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String gethorario() {
        return this.horario;
    }

    public void sethorario(String horario) {
        this.horario = horario;
    }

    public String gettipo_vacuna() {
        return this.tipo_vacuna;
    }

    public void settipo_vacuna(String tipo_vacuna) {
        this.tipo_vacuna = tipo_vacuna;
    }

    public int getdosis() {
        return this.dosis;
    }

    public void setdosis(int dosis) {
        this.dosis = dosis;
    }


}
