package com.academy.BookwormRobot.gui;

import java.util.ArrayList;
import java.util.List;

import com.academy.BookwormRobot.App;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class AppGui extends Application {

	public static final String HELION = "1";
	public static final String GKN = "2";
	public static final String SK = "3";
	public static final String SELKAR = "4";

	List<String> list = new ArrayList<String>();

	CheckBox cbHelion;
	CheckBox cbGKN;
	CheckBox cbSK;
	CheckBox cbSelkar;

	Label response;
	Label selected;
	String libraries;

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage myStage) {
		myStage.setTitle("Select Libraries");
		FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10);
		rootNode.setAlignment(Pos.CENTER);
		Scene myScene = new Scene(rootNode, 500, 400);
		myStage.setScene(myScene);
		Label heading = new Label("What Libraries would you like to follow?");
		response = new Label("");
		selected = new Label("");

		Button button = new Button("Accept");

		button.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				response.setText("You pressed Up.");
				StringBuffer builder = new StringBuffer();

				for (int i = 0; i < list.size(); i++) {
					builder.append(list.get(i));
					builder.append(" ");
				}

				String str[] = { "1", "2", "3", "4" };
				App.main(str);

			}

		});

		cbHelion = new CheckBox("Helion");
		cbGKN = new CheckBox("Glowna Ksiegarnia Naukowa");
		cbSK = new CheckBox("Swiat Ksiazki");
		cbSelkar = new CheckBox("Selkar");

		cbHelion.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				if (cbHelion.isSelected()) {
					list.add(HELION);
					response.setText("Helion was just selected.");
				} else {
					list.remove(HELION);
					response.setText("Helion was just cleared.");
				}
				showAll();
			}
		});

		cbGKN.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				if (cbGKN.isSelected()) {
					list.add(GKN);
					response.setText("Glowna Ksiegarnia Naukowa was just selected.");
				} else {
					list.remove(GKN);
					response.setText("Glowna Ksiegarnia Naukowa was just cleared.");
				}
				showAll();
			}
		});

		cbSK.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				if (cbSK.isSelected()) {
					list.add(SK);
					response.setText("Swiat Ksiazki was just selected.");
				} else {
					list.remove(SK);
					response.setText("Swiat Ksiazki was just cleared.");
				}
				showAll();
			}
		});

		cbSelkar.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				if (cbSelkar.isSelected()) {
					list.add(SELKAR);
					response.setText("Selkar was just selected.");
				} else {
					list.remove(SELKAR);
					response.setText("Selkar was just cleared.");
				}
				showAll();
			}
		});

		rootNode.getChildren().addAll(heading, cbHelion, cbGKN, cbSK, cbSelkar, response, selected, button);

		myStage.show();
		showAll();

	}

	void showAll() {
		libraries = "";
		if (cbHelion.isSelected())
			libraries = "Helion ";
		if (cbGKN.isSelected())
			libraries += "GKN ";
		if (cbSK.isSelected())
			libraries += "SK ";
		if (cbSelkar.isSelected())
			libraries += "Selkar ";

		selected.setText("Libraries selected: " + libraries);
	}

}
