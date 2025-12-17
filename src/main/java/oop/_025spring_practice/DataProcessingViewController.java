package oop._025spring_practice;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class DataProcessingViewController {
    @javafx.fxml.FXML
    private TableColumn locationTypeCol;
    @javafx.fxml.FXML
    private TableColumn chainCol;
    @javafx.fxml.FXML
    private TableColumn areaCol;
    @javafx.fxml.FXML
    private TableColumn zipCodeCol;
    @javafx.fxml.FXML
    private ComboBox zipCodeFilterCB;
    @javafx.fxml.FXML
    private TableColumn tradeLicenseCol;
    @javafx.fxml.FXML
    private TableView pharmacyTableView;
    @javafx.fxml.FXML
    private TextField areaFilterTF;
    @javafx.fxml.FXML
    private TableColumn ownerCol;
    @javafx.fxml.FXML
    private TableColumn openingDateCol;
    @javafx.fxml.FXML
    private TableColumn pharmancyNameCol;

    @javafx.fxml.FXML
    public void onLoadTableButtonClicked(ActionEvent actionEvent) {
    }
}
