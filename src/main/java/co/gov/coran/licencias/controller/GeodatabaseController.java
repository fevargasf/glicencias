package co.gov.coran.licencias.controller;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import co.gov.coran.licencias.utils.UtilFilesRed;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/geo-database")
public class GeodatabaseController {

    @GetMapping("/")
    public List<String> listDatabases() throws Exception {
        String dir  = "DocLicenciasAmbientalesyTE/";
        return UtilFilesRed.listFiles(dir);
    }
    @GetMapping("/folder")
    public List<String> listFolder(@RequestParam String dir) throws Exception {
       // String dir  = "DocLicenciasAmbientalesyTE/";
        //return UtilFilesRed.testFileGMD(dir);
        return UtilFilesRed.listFiles(dir);
    }
    @PostMapping("/newfolder")
    public void newFolder(@RequestParam(value = "name") String name, @RequestParam(value = "paths") String paths) throws Exception {
        //Validar el nivel del directorio
        // [0,1,3]
        UtilFilesRed.createDir(paths, name);
    }
    @GetMapping("/download/")
    public void getDatabase(HttpServletResponse response, @RequestParam String file) throws Exception {
        String origin = response.getHeader("Origin");

        response.setHeader("Access-Control-Allow-Origin", origin);
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "OPTIONS,POST, GET");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With");
        String mimeType = "application/zip";
        response.setContentType(mimeType);
        response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", fileName(file)));
        response.setHeader("Access-Control-Expose-Headers","Content-Disposition");
        //file = "AN1-2017-238\\OBLIGACION-1/";
       // file = "AN1-2017-238\\OBLIGACION-1\\"+file;
        byte [] inStream = UtilFilesRed.testFileGMD(file);;
        response.setContentLength(inStream.length);

        FileCopyUtils.copy(inStream, response.getOutputStream());
    }


    @PostMapping("/fileGeodatabase")
    public @ResponseBody
    String guardarArchivo(@RequestParam(value = "dir") String pathDir,@RequestParam(value = "file", required = false) MultipartFile file

    ) throws Exception {
        UtilFilesRed.createFile(pathDir, file);

        try {

        } catch (NumberFormatException ignored) {
        }
        try {

        } catch (DateTimeParseException ignored) {
        }


        return null;
    }


    public String fileName(String path){
        //  AbURRA/ZA-aXXX/1.Evaluacion/ZN-YYY/cartografia/geodatabase.gdb
        String name = "";
        String dirs[] = path.split("/");
        String sep = "__";
        name = dirs[0]+sep+dirs[1]+sep+"E"+sep+dirs[3]+sep+dirs[5];
        return name;
    }

    @PostMapping("/login")
    public @ResponseBody
    String user(@RequestParam(value = "email") String email,
                @RequestParam(value = "password") String password) throws Exception {
        return user(email, password);

    }

}
