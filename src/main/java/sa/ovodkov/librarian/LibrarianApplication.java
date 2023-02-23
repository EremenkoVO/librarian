package sa.ovodkov.librarian;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import sa.ovodkov.librarian.application.JavaFxApplication;

@SpringBootApplication
@ConfigurationPropertiesScan(basePackages = "sa.ovokodv.librarian.configuration.properties")
public class LibrarianApplication {

    public static void main(String[] args) {
        Application.launch(JavaFxApplication.class, args);
    }
}
