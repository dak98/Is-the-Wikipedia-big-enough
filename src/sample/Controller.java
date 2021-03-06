package sample;

import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;

import javax.imageio.ImageIO;
import java.io.File;

public class Controller {

    private WebEngine webEngine;

    @FXML
    private ImageView imageView;

    @FXML
    private SplitPane splitPane;

    @FXML
    public void initialize(){
        File file = new File("/home/mateusz/Pulpit/logo.png");
        Image img = new Image(file.toURI().toString());
        imageView.setImage(img);
    }
}

