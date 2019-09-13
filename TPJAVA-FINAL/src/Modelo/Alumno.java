package Modelo;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

import java.sql.*;

public class Alumno {

    private IntegerProperty codigoAlumno;
    private StringProperty nombre;
    private StringProperty apellido;
    private StringProperty genero;
    private Date fechaIngreso;
    private Carrera carrera;


    public Alumno(Integer codigoAlumno, String nombre, String apellido, String genero, Date fechaIngreso, Carrera carrera) {
        this.codigoAlumno = new SimpleIntegerProperty(codigoAlumno);
        this.nombre = new SimpleStringProperty(nombre);
        this.apellido = new SimpleStringProperty(apellido);
        this.genero = new SimpleStringProperty(genero);
        this.fechaIngreso = fechaIngreso;
        this.carrera = carrera;
    }

    public Integer getCodigoAlumno() {
        return codigoAlumno.get();
    }

    public void setCodigoAlumno(Integer codigoAlumno) {
        this.codigoAlumno = new SimpleIntegerProperty(codigoAlumno);
    }

    public String getNombre() {
        return nombre.get();
    }

    public void setNombre(String nombre) {
        this.nombre = new SimpleStringProperty(nombre);
    }

    public String getApellido() {
        return genero.get();
    }

    public void setGenero(String genero) {
        this.genero = new SimpleStringProperty(genero);
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public IntegerProperty codigoAlumnoProperty() {
        return codigoAlumno;
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public StringProperty apellidoProperty() {
        return apellido;
    }

    public StringProperty generoProperty() {
        return genero;
    }


/*
    public int guardarRegistro(Connection connection){
        try {
            //Evitar inyeccion SQL.
            PreparedStatement instruccion =
                    connection.prepareStatement("INSERT INTO ingresoalumnos.alumno (idAlumno,Nombre, Apellido, Sexo, Materia, "
                            + "Carrera, FechaNac, NumeroAula) "+
                            "VALUES (?, ?, ?, ?, ?, ?, ?)");
            instruccion.setString(1, nombre.get());
            instruccion.setString(2, apellido.get());
            instruccion.setString(3, genero.get());
            instruccion.setDate(4, fechaIngreso);
            return instruccion.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
*/
}


