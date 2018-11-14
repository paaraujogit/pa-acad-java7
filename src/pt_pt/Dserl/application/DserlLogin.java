package pt_pt.Dserl.application;


import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.StageStyle;


public class DserlLogin extends Application {

    public static Stage stage;
    private Scene scene;
    private AnchorPane page;


    private Screen ecra = Screen.getPrimary();
    private Rectangle2D window = ecra.getVisualBounds();


    public static void main(String[] args) {
        DserlLogin.launch(DserlLogin.class,(java.lang.String[]) null);
    }

    @Override
    public void start(final Stage stage){
        try {
            DserlLogin.stage = stage;
            page = FXMLLoader.load(DserlLogin.class.getResource("../View/DserlLogin.fxml"));
            scene = new Scene(page);

            stage.initStyle(StageStyle.UNDECORATED);
            stage.setX(window.getMinX());
            stage.setY(window.getMinY());
            stage.setWidth(window.getWidth());
            stage.setHeight(window.getHeight());
            stage.getIcons().addAll(new Image(DserlLogin.class.getResourceAsStream("../Resources/nasaLOGO.png")));
            stage.setScene(scene);
            stage.show();

        }
        catch (Exception e){
            System.out.println("Ocorreu um erro na inicialização da aplicação. Por favor contacte o administrador. --Detalhes do erro-- " + e);
        }
    }

}

