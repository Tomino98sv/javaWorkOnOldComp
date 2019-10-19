package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Controller {

    public TextField txtOutput1;
    public TextField txtOutput2;
    public TextArea  result;
    public TextField date;
    public TextField time;
    public CheckBox checkB;
    private static final String IDLE_BUTTON_STYLE = "-fx-background-color: transparent;";
    private static final String HOVERED_BUTTON_STYLE = "-fx-background-color: -fx-shadow-highlight-color, -fx-outer-border, -fx-inner-border, -fx-body-color;";


    public void btnClick(ActionEvent actionEvent) {
        System.out.println("java zase ma trapis");
        String number1 = txtOutput1.getText();
        String number2 = txtOutput2.getText();
        int nm1 = Integer.parseInt(number1);
        int nm2 = Integer.parseInt(number2);
        int result = nm1+nm2;
        this.result.setText(Integer.toString(result));
    }

    public void getDate(ActionEvent actionEvent) {
        SimpleDateFormat formattime = new SimpleDateFormat("HH:mm:ss");
        String time = formattime.format(new Date());

        SimpleDateFormat formatdate = new SimpleDateFormat("dd:MM:YYYY");
        String date = formatdate.format(new Date());
        this.date.setText(date);
        this.time.setText(time);
    }

    public void showhide(ActionEvent actionEvent) {
        boolean show = checkB.isSelected();
        if(show){
            result.setVisible(false);
        }else{
            result.setVisible(true);
        }

    }


    public void erasecontent(MouseEvent mouseEvent) {

        if (mouseEvent.getButton().equals(MouseButton.PRIMARY)){
            if (mouseEvent.getClickCount() == 2){

                if (mouseEvent.getSource() == txtOutput1){
                    txtOutput1.clear();
                }
                if (mouseEvent.getSource() == txtOutput2){
                    txtOutput2.clear();
                }
            }
        }
    }

    public void markit(MouseEvent mouseEvent) {
        txtOutput1.setStyle(IDLE_BUTTON_STYLE);
        txtOutput1.addEventHandler(MouseEvent.MOUSE_ENTERED,
                e -> txtOutput1.setStyle(HOVERED_BUTTON_STYLE));
        txtOutput1.addEventHandler(MouseEvent.MOUSE_EXITED,
                e -> txtOutput1.setStyle(IDLE_BUTTON_STYLE));
    }
}
