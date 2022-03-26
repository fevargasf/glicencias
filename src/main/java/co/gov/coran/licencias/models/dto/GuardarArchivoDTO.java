package co.gov.coran.licencias.models.dto;

import java.sql.Blob;

public class GuardarArchivoDTO {
    private String name;
    private  String url;
    private Blob archivo;

    public GuardarArchivoDTO(String name, String url,Blob archivo) {
        this.name = name;
        this.url = url;
        this.archivo = archivo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Blob getArchivo() {
        return archivo;
    }

    public void setArchivo(Blob archivo) {
        this.archivo = archivo;
    }
}
