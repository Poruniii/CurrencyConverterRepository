package com.example.currencyconverter;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class HelloController {

    public enum ErrorCode{ //Error table
        ERROR_001("Error: 001", "Invalid character entered!"),
        ERROR_002("Error: 002", "Invalid expression entered!"),
        ERROR_003("Error: 003", "Empty container"),
        ERROR_004("Error: 004", "Rates not selected");

        private final String code;
        private final String message;

        ErrorCode(String code, String message){
            this.code = code;
            this.message = message;
        }
        public String getCode(){
            return code;
        }
        public String getMessage(){
            return message;
        }
    }
    private CallRates callRates = new CallRates(); //Calls the java file CallRates

    @FXML
    private TextField inputField; //handles the input textField
    @FXML
    private TextField outputField; //handles the output textField
    @FXML
    private ComboBox<String> fromCurrency; //dropdown menu for source currency
    @FXML
    private ComboBox<String> toCurrency; //dropdown menu for desired currency

    @FXML
    public void initialize(){ //handles the table for the currencies in the comboBox
        ObservableList<String> currencies = FXCollections.observableArrayList( "USD", "EUR", "GBP", "JPY","PHP","CAD", "AUD", "CHF", "CNY", "HKD", "NZD","SGD","INR");
        fromCurrency.setItems(currencies);
        toCurrency.setItems(currencies);
    }
    @FXML
    private void convertBox(){ //Selecting the currencies in the comboBox
        String from = fromCurrency.getValue();
        String to = toCurrency.getValue();

        double exchangeRate = callRates.getConversionRate(from,to);// Handles the output of currency conversion
        double inputValue = evaluate(inputField.getText());
        double convertedValue = inputValue * exchangeRate;
        outputField.setText(Double.toString(convertedValue));
    }

    @FXML
    private void numberHandler(ActionEvent e){ //handles the number pad output //Update the logic in scene builder
        Button button =(Button) e.getSource();
        String buttonText = button.getText();
        inputField.appendText(buttonText);
    }
    @FXML
    private void allClear(ActionEvent e){ //handles the allClear button action
        inputField.clear();
    }
    @FXML
    private void clear(ActionEvent e){ //handles the clear button action
        String currentText = inputField.getText();
        if(!currentText.isEmpty()){
            String newText = currentText.substring(0, currentText.length()-1);
            inputField.setText(newText);
        }
    }
    @FXML
    private void equal(ActionEvent e){ //handles the equal button action
        String enteredText = inputField.getText();
        String enteredFrom = fromCurrency.getValue();
        String enteredTo = toCurrency.getValue();

        if (isTextFieldEmpty(enteredText)){ //checks for any errors that can happen in the output
            errorMessages(ErrorCode.ERROR_003);
        }else if (isValidComboBox(enteredFrom,enteredTo)) {
            errorMessages(ErrorCode.ERROR_004);
            }else if (isValidInput(enteredText)){
            try {
                convertBox();
            }catch (NumberFormatException ex){
                errorMessages(ErrorCode.ERROR_001);
            }
        }else{
            errorMessages(ErrorCode.ERROR_002);
        }
//        System.out.println(number + 1); //Debug handler
    }
    private boolean isValidInput(String currentText){ //Error 001 and Error 002
        return currentText.matches("-?\\d*\\.?\\d*");
    }
    private boolean isValidComboBox(String enteredFrom, String enteredTo){ //handles the comboBox if Empty
        return enteredFrom != null && !enteredFrom.isEmpty() && enteredTo != null && !enteredTo.isEmpty();
    }
    private boolean isTextFieldEmpty(String enteredText){ //Error 003
        return enteredText.isEmpty();
    }
    private double evaluate(String expression){ //Makes the String into Double via parse
        return Double.parseDouble(expression);
    }
    private void errorMessages(ErrorCode errorCode){ //Error message handling
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(errorCode.getCode());
        alert.setHeaderText(null);
        alert.setContentText(errorCode.getMessage());
        alert.showAndWait();
    }
}
