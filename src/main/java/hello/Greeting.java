package hello;

import org.springframework.lang.Nullable;

public class Greeting {

    private final long id;
    private final String name;
    private final String greeting;

    public Greeting(long id, String name, @Nullable String greeting) {
        this.id = id;
        this.name = name;
        this.greeting = greeting;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGreeting() {
        return greeting;
    }
}
