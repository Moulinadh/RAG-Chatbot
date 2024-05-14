import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadController {

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        // Process the uploaded file (text or document)
        // Convert text into chunks
        // Generate embeddings for each chunk
        // Store embeddings in the vector database
        return "File uploaded successfully!";
    }
}
