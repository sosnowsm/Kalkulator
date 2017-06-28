package application;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Controller {
	@FXML
	private Button viewBtn;
	@FXML
	private Button oneBtn;
	@FXML
	private Button twoBtn;
	@FXML
	private Button threeBtn;
	@FXML
	private Button fourBtn;
	@FXML
	private Button fiveBtn;
	@FXML
	private Button sixBtn;
	@FXML
	private Button sevenBtn;
	@FXML
	private Button eightBtn;
	@FXML
	private Button nineBtn;
	@FXML
	private Button zeroBtn;
	@FXML
	private Button dotBtn;
	@FXML
	private Button equalsBtn;
	@FXML
	private Button multiplyBtn;
	@FXML
	private Button divideBtn;
	@FXML
	private Button plusBtn;
	@FXML
	private Button minusBtn;
	@FXML
	private Button cBtn;
	private double x;
	private double y;
	private String function = ("x");
	private int clear = 0;

	public void zero() {
		type("0");
	}

	public void one() {
		type("1");
	}

	public void two() {
		type("2");
	}

	public void three() {
		type("3");
	}

	public void four() {
		type("4");
	}

	public void five() {
		type("5");
	}

	public void six() {
		type("6");
	}

	public void seven() {
		type("7");
	}

	public void eight() {
		type("8");
	}

	public void nine() {
		type("9");
	}

	public void dot() {
		type(".");
	}

	public void type(String i) {
		if (clear == 0) {
			if (viewBtn.getText().length() < 9) {
				viewBtn.setText(viewBtn.getText() + i);
			}
		} else {
			viewBtn.setText("" + i);
			clear = 0;
		}
	}

	public void add() {
		count();
		function = ("plus");
	}

	public void sub() {
		count();
		function = ("minus");
	}

	public void multiply() {
		count();
		function = ("multiply");
	}

	public void divide() {
		count();
		function = ("divide");
	}

	public void equals() {
		if (function.equals("plus")) {
			y = x + Double.parseDouble(viewBtn.getText());
		}
		if (function.equalsIgnoreCase("minus")) {
			y = x - Double.parseDouble(viewBtn.getText());
		}
		if (function.equalsIgnoreCase("multiply")) {
			y = x * Double.parseDouble(viewBtn.getText());
		}
		if (function.equalsIgnoreCase("divide")) {
			y = x / Double.parseDouble(viewBtn.getText());
		} else {
		}

		viewBtn.setText("" + y);
		// viewBtn.setText("" + String.format("%.7f", y));
		clear = 1;

	}

	public void count() {
		x = Double.parseDouble(viewBtn.getText());
		clear = 1;

	}

	public void clear() {
		viewBtn.setText("0");
	}
	
	public void close(){
		Platform.exit();
	}
	
	public void about() throws Exception {
		Stage stageAbout = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("About.fxml"));
		Scene scene = new Scene(root);
		stageAbout.setTitle("O programie");
		stageAbout.setResizable(false);
		stageAbout.setScene(scene);
		stageAbout.getIcons().add(new Image("icoCalc.jpg"));
		stageAbout.show();

	}

}
