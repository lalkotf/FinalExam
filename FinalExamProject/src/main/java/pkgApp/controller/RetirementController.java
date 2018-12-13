package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML
	private TextField txtYearsToWork;
	
	@FXML
	private Label txtSaveEachMonth;
	
	@FXML
	private TextField txtAnnualReturn;
	
	@FXML
	private TextField txtAnnualReturn2;
	
	@FXML
	private TextField txtRequiredIncome;
	
	@FXML
	private TextField txtYearsRetired;
	
	@FXML
	private TextField txtMonthlySSI;
	
	@FXML
	private Label txtWYNTS;
		
	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	
	@FXML
	public void btnClear(ActionEvent event) {
		System.out.println("Clear Pressed");
		txtYearsToWork.setText("");
		txtSaveEachMonth.setText("$");
		txtAnnualReturn.setText("");
		txtAnnualReturn2.setText("");
		txtRequiredIncome.setText("");
		txtYearsRetired.setText("");
		txtMonthlySSI.setText("");
		txtWYNTS.setText("$");
		
		//	TODO: Clear all the text inputs
	}
	
		
	@FXML
	public void btnCalculate(ActionEvent event) {
		
		System.out.println("Calculate Pressed");
		
		int textYearsToWork = Integer.parseInt(txtYearsToWork.getText());
		double textAnnualReturn = Double.parseDouble(txtAnnualReturn.getText());
		double textAnnualReturn2= Double.parseDouble(txtAnnualReturn2.getText());
		double textRequiredIncome = Double.parseDouble(txtRequiredIncome.getText());
		int textYearsRetired = Integer.parseInt(txtYearsRetired.getText());
		double textMonthlySSI = Double.parseDouble(txtMonthlySSI.getText());
		
		Retirement retirement = new Retirement();
		retirement.setiYearsToWork(textYearsToWork);
		retirement.setdAnnualReturnWorking(textAnnualReturn);
		retirement.setiYearsRetired(textYearsRetired);
		retirement.setdAnnualReturnRetired(textAnnualReturn2);
		retirement.setdRequiredIncome(textRequiredIncome);
		retirement.setdMonthlySSI(textMonthlySSI);
		
		txtSaveEachMonth.setText("$"+ String.format("%.2f", retirement.AmountToSave()));
		txtWYNTS.setText("$"+String.format("%.2f", retirement.TotalAmountSaved()));

//		TODO: Call AmountToSave and TotalAmountSaved and populate 
	}		
	}
	
