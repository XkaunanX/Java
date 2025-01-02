import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class VentanaJavaFX extends Application {

    @Override
    public void start(Stage stage) {
        // Crear un botón
        Button boton = new Button("Haz clic aquí");
        boton.setOnAction(e -> System.out.println("¡Botón presionado!"));

        // Crear un contenedor para el botón
        StackPane root = new StackPane();
        root.getChildren().add(boton);

        // Crear una escena y agregarla al escenario
        Scene escena = new Scene(root, 400, 300);
        stage.setTitle("Ventana JavaFX");
        stage.setScene(escena);

        // Mostrar la ventana
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
