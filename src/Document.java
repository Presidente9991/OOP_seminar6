
import java.util.UUID;

public class Document {

    private final UUID id;
    private final String number;
    private final String name;
    private final String text;

    public Document(UUID id, String number, String name, String text) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.text = text;
    }

}
