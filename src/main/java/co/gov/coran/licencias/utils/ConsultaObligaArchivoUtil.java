package co.gov.coran.licencias.utils;

import co.gov.coran.licencias.controller.UnidadRed;
import jcifs.smb.SmbFile;

public class ConsultaObligaArchivoUtil {
    public static void asociarArchivoDelDocumento(Documento documento) throws Exception {
        try{
            UnidadRed ur = new UnidadRed();
            SmbFile archivo = new SmbFile(ur.apuntarPath(documento.getPrefijoServidor()) + documento.getRuta(),ur.autenticar());
            ur.copiarBytesAUnidad(documento.getArchivo(),archivo);
        }catch(Exception e){
            //getUrl().setError(e);
            e.printStackTrace();
            throw e;
        }
    }
}
