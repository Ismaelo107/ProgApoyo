package Poblacion;

import java.util.Objects;

public class Poblacion {
    private String codPoblacion;
    private String den;

    public String getCodPoblacion() {
        return codPoblacion;
    }

    public void setCodPoblacion(String codPoblacion) {
        this.codPoblacion = codPoblacion;
    }

    public String getDen() {
        return den;
    }

    public void setDen(String den) {
        this.den = den;
    }

    public Poblacion(String codPoblacion, String den) {
        this.codPoblacion = codPoblacion;
        this.den = den;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Poblacion)) return false;
        Poblacion poblacion = (Poblacion) o;
        return codPoblacion.equals(poblacion.codPoblacion) && den.equals(poblacion.den);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPoblacion, den);
    }

    @Override
    public String toString() {
        return "Poblacion{" +
                "codPoblacion='" + codPoblacion + '\'' +
                ", den='" + den + '\'' +
                '}';
    }
}
