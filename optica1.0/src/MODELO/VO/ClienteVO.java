/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO.VO;

/**
 *
 * @author alexisruiz
 */
public class ClienteVO {
    private String documento, nombres, apellidos, fechaNaci,direccion,telefono, Email,Escolaridad,LugarNaci,Ocupacion,EPS,EstadoCivil,
            Genero,LugarProcedencia,observacion;

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setEscolaridad(String Escolaridad) {
        this.Escolaridad = Escolaridad;
    }

    public void setLugarNaci(String LugarNaci) {
        this.LugarNaci = LugarNaci;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setLugarProcedencia(String LugarProcedencia) {
        this.LugarProcedencia = LugarProcedencia;
    }
    
        public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNaci(String fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    public String getEmail() {
        return Email;
    }

    public String getEscolaridad() {
        return Escolaridad;
    }

    public String getLugarNaci() {
        return LugarNaci;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public String getEPS() {
        return EPS;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public String getGenero() {
        return Genero;
    }

    public String getLugarProcedencia() {
        return LugarProcedencia;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNaci() {
        return fechaNaci;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getObservacion() {
        return observacion;
    }


    
    
}
