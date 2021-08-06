package controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.collections.*;
import modelos.Calculadora;

public class calculadora_controller {
    private ObservableList<String> itemsOperaciones =  FXCollections.observableArrayList("+","-","*","/");

    @FXML
    private Button btn_calcular;

    @FXML
    private ChoiceBox<String> operaciones;

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private Label resultadoOperacion;

    @FXML
    private void initialize(){
        operaciones.setItems(itemsOperaciones);
    }

    @FXML
    void calcularDato(ActionEvent event) {
        String numero1 = num1.getText();
        String numero2 = num2.getText();
        String operacion =  operaciones.getValue();
       calcular(numero1,numero2,operacion); 
    }

    private void calcular(String numero1,String numero2, String operacion){
        Calculadora clc = new Calculadora(Double.parseDouble(numero1),Double.parseDouble(numero2));

        switch(operacion){
            case "+":
                resultadoOperacion.setText(String.valueOf(clc.sumar()));
                
            break;
            case "-":
                resultadoOperacion.setText(String.valueOf(clc.restar()));
            break;
            case "*":
                resultadoOperacion.setText(String.valueOf(clc.multiplicar()));
            break;
            case "/":
                resultadoOperacion.setText(clc.dividir());
            break;
        }
    }

}
