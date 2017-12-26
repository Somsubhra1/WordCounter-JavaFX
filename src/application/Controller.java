package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML
    private Label words;
    @FXML
    private Label characters;
    @FXML
    private TextArea textArea;
    @FXML
    private Button reset;
    @FXML
    private Button count;
    private Model model=new Model();

    @FXML
    public void process() {
        words.setText("Words: "+model.countWord(textArea.getText()));
        characters.setText("Characters: "+model.countCharacters(textArea.getText()));
    }

    public void onButtonPress(ActionEvent event) {
        if(event.getSource()==reset) {
            words.setText("Words: 0");
            characters.setText("Characters: 0");
            textArea.clear();
        }
        else if(event.getSource()==count) {
            process();
        }
    }
}
