package oop._025spring_practice;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DataCreationViewController {
    @javafx.fxml.FXML
    private DatePicker openingDatePicker;
    @javafx.fxml.FXML
    private TextField tradeLicenseNumberTF;
    @javafx.fxml.FXML
    private TextField areaTF;
    @javafx.fxml.FXML
    private ComboBox<String> locationTypeCB;
    @javafx.fxml.FXML
    private TextField pharmacyNameTF;
    @javafx.fxml.FXML
    private TextField ownerTF;
    @javafx.fxml.FXML
    private CheckBox chainCheckBox;
    @javafx.fxml.FXML
    private ComboBox<Integer> zipCodeCB;

    public void initialize() {
        locationTypeCB.getItems().addAll("Mall", "City", "Market");
        zipCodeCB.getItems().addAll(1229, 1230, 1231);

    }

    @javafx.fxml.FXML
    public void onValidateAndAddButtonClicked(ActionEvent actionEvent) {
        float area = Float.parseFloat(areaTF.getText());

        boolean isChainPharmacy = chainCheckBox.isSelected();

        if (isChainPharmacy) {
            if (!(area >= 500)) {
                showAlert("Validation Error", "Chain pharmacies must have an area of at least 500 sq ft.");
                return;
            }
        } else {
            if (!(area >= 100 && area <=499)) {
                showAlert("Validation Error", "Non-chain pharmacies must have an area between 100 and 499 sq ft.");
                return;
            }
        }

        Pharmacy pharmacy = new Pharmacy(pharmacyNameTF.getText(), zipCodeCB.getValue(), area, ownerTF.getText(), openingDatePicker.getValue(), isChainPharmacy, locationTypeCB.getValue(), tradeLicenseNumberTF.getText());

        File file = new File("pharmacies.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;

        try  {
            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new ObjectOutputStream(fos);

            } else {
                fos = new FileOutputStream(file);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(pharmacy);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showAlert(String title, String content) {
        new Alert(Alert.AlertType.WARNING, content).showAndWait();
    }

    @javafx.fxml.FXML
    public void onSceneSwitchButtonClicked(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DataProcessingView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Data Processing View");
        stage.show();

    }
}
