package co.gov.coran.licencias.service;

import co.gov.coran.licencias.models.dto.GuardarArchivoDTO;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;

import java.nio.file.Path;
import java.util.stream.Stream;

public interface ConsultaObligaArchivoServicee {
    /*
   Metodo para guardar los archivos
    */
    public void save(MultipartFile file);

    /*
    Metodo para cargar un archivo
     */
    public Resource load(String filename);

    /*
    Metodo para borrar todos los archivos cada vez que se inicie el servidor
     */
    //public void deleteAll();

    /*
    Metodo para Cargar todos los archivos
     */
    public Stream<Path> loadAll();

    /*
    Metodo para Borrar un archivo
     */
    public String deleteFile(String filename);

    String guardarArchivo(GuardarArchivoDTO guardarArchivoDTO) throws Exception;

}
