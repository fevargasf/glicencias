package co.gov.coran.licencias.utils;

public class Documento {
    private String ruta;
    private byte[] archivo;
    private String prefijoServidor;

    public Documento(String ruta, byte[] archivo){
        this.ruta = ruta;
        this.archivo = archivo;
        this.prefijoServidor = "";
    }

    public Documento(String ruta, byte[] archivo, String prefijo){
        this.ruta = ruta;
        this.archivo = archivo;
        this.prefijoServidor = prefijo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public byte[] getArchivo() {
        return archivo;
    }

    public void setArchivo(byte[] archivo) {
        this.archivo = archivo;
    }

    public String getPrefijoServidor() {
        return prefijoServidor;
    }

    public void setPrefijoServidor(String prefijoServidor) {
        this.prefijoServidor = prefijoServidor;
    }
}
