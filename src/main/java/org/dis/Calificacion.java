package org.dis;


public class Calificacion
{
    private double nota;
    private String asignatura;

    public Calificacion(double nota, String asignatura) {
        this.nota = nota;
        this.asignatura = asignatura;
    }

    public boolean iguales(Calificacion c2) {
        if(this.nota == c2.getNota() && this.asignatura.equals(c2.getAsignatura()))
            return true;
        return false;
    }

    public double getNota() {
        return nota;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String descripcionNota() {
        if(this.nota < 5)
            return "Suspenso";
        else if(this.nota < 7)
            return "Bien";
        else if(this.nota < 9)
            return "Notable";
        else
            return  "Sobresaliente";
    }

    public boolean mismaAsig(Calificacion c2) {
        if(this.asignatura.equals(c2.getAsignatura()))
            return true;
        return false;
    }

    public boolean esMayor(Calificacion c2) {
        if(this.nota >= c2.getNota())
            return true;
        return false;
    }
}