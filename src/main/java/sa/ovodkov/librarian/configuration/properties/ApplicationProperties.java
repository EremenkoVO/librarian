package sa.ovodkov.librarian.configuration.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "application")
public class ApplicationProperties {

    /**
     * Заголовок приложения.
     */
    private String title = "Библиотекарь";

    /**
     * Ширина окна приложения.
     */
    private Integer width = 800;

    /**
     * Высота окна приложения.
     */
    private Integer height = 600;
}
