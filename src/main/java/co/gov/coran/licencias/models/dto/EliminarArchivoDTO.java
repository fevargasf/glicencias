package co.gov.coran.licencias.models.dto;

public class EliminarArchivoDTO  {
    public int niLineaObligacion;
    public int niNroArchivo;

    public int getNiLineaObligacion() {
        return niLineaObligacion;
    }

    public void setNiLineaObligacion(Integer niLineaObligacion) {
        this.niLineaObligacion = niLineaObligacion;
    }

    public  int getNiNroArchivo() {
        return niNroArchivo;
    }

    public void setNiNroArchivo(Integer niNroArchivo) {
        this.niNroArchivo = niNroArchivo;
    }
}
