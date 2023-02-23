package sa.ovodkov.librarian.application;

import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxWeaver;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import sa.ovodkov.librarian.configuration.properties.ApplicationProperties;
import sa.ovodkov.librarian.view.MainWindow;

@RequiredArgsConstructor
@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent> {

    private final FxWeaver fxWeaver;
    private final ApplicationProperties properties;

    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        Stage stage = event.getStage();
        Scene scene = new Scene(fxWeaver.loadView(MainWindow.class), properties.getWidth(), properties.getHeight());
        stage.setTitle(properties.getTitle());
        stage.setScene(scene);
        stage.show();
    }
}
