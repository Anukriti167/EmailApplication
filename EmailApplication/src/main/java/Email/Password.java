package Email;

import java.util.Random;
import java.util.UUID;

public class Password {
    private String name;
    private String id;
    public Password(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getPassword(){
        return id;
    }

    public String changePassword(){
        id = UUID.randomUUID().toString();
        return id;
    }
}
