import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    @PostMapping("/chat")
    public String chat(@RequestParam("message") String message) {
        // Pass the message to the language model for response generation
        // Return the response to the frontend
        return "Response from the chatbot";
    }
}
