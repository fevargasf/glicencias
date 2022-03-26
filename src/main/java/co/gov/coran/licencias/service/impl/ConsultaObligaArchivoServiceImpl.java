package co.gov.coran.licencias.service.impl;

import co.gov.coran.licencias.models.dto.GuardarArchivoDTO;
import co.gov.coran.licencias.service.ConsultaObligaArchivoServicee;
import co.gov.coran.licencias.utils.FileUtils;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

@Service
public class ConsultaObligaArchivoServiceImpl implements ConsultaObligaArchivoServicee {
    public String guardarArchivo(GuardarArchivoDTO guardarArchivoDTO) throws Exception {
        //Validar que no sea zip
        if(FileUtils.isCompressed(guardarArchivoDTO.getName())){
            //Guardar zip en servidor
           // String fileName = guardarZip(guardarArchivoDTO);
            //Quitar blob de DTO
            guardarArchivoDTO.setUrl(null);
            String name="";
            guardarArchivoDTO.setName(name);
        }
        return guardarArchivo(guardarArchivoDTO);
    }

    @Override
    public void save(MultipartFile file) {

    }

    @Override
    public Resource load(String filename) {
        return null;
    }

    @Override
    public Stream<Path> loadAll() {
        return null;
    }

    @Override
    public String deleteFile(String filename) {
        return null;
    }
}
