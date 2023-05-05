package com.projinter.projinter;

import javafx.beans.property.ObjectProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class HelloController {

    @FXML
    private VBox vbox_btns;
    @FXML
    private Button btn_cadastrarVenda;
    @FXML
    private Button btn_buscarPeca;
    @FXML
    private Button btn_buscarCliente;
    @FXML
    private Button btn_buscarServico;
    @FXML
    private Button btn_relatorios;



    @FXML
    public void mudaCorBotao(MouseEvent event) {
        Button enteredButton = (Button) event.getSource();
        if (enteredButton == btn_cadastrarVenda) {
            btn_cadastrarVenda.setStyle("-fx-background-color: #f3e1b6; -fx-font-size: 22; -fx-text-fill: #23998e");
        }else if (enteredButton == btn_buscarPeca) {
            btn_buscarPeca.setStyle("-fx-background-color: #f3e1b6; -fx-font-size: 22; -fx-text-fill: #23998e");
        }else if (enteredButton == btn_buscarCliente) {
            btn_buscarCliente.setStyle("-fx-background-color: #f3e1b6; -fx-font-size: 22; -fx-text-fill: #23998e");
        }else if (enteredButton == btn_buscarServico) {
            btn_buscarServico.setStyle("-fx-background-color: #f3e1b6; -fx-font-size: 22; -fx-text-fill: #23998e");
        }else if (enteredButton == btn_relatorios) {
            btn_relatorios.setStyle("-fx-background-color: #f3e1b6; -fx-font-size: 22; -fx-text-fill: #23998e");
        }
    }

    @FXML
    public void voltaCorBotao(MouseEvent event) {
        Button exitedButton = (Button) event.getSource();
        Paint white = Color.WHITE;
        if (exitedButton == btn_cadastrarVenda) {
            if(btn_cadastrarVenda.getTextFill() != white) {
                btn_cadastrarVenda.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
            }
        } else if (exitedButton == btn_buscarPeca) {
            if(btn_buscarPeca.getTextFill() != white) {
                btn_buscarPeca.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
            }
        }else if (exitedButton == btn_buscarCliente) {
            if(btn_buscarCliente.getTextFill() != white) {
                btn_buscarCliente.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
            }
        }else if (exitedButton == btn_buscarServico) {
            if(btn_buscarServico.getTextFill() != white) {
                btn_buscarServico.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
            }
        }else if (exitedButton == btn_relatorios) {
            if(btn_relatorios.getTextFill() != white) {
                btn_relatorios.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
            }
        }
    }

    @FXML
    public void botaoClicado(ActionEvent event){
        Button clickedButton = (Button) event.getSource();
        String id = clickedButton.getId();
        System.out.println(clickedButton.getTextFill());
        switch(id) {
            case "btn_cadastrarVenda": btn_cadastrarVenda.setStyle("-fx-background-color: #1d5e69; -fx-font-size: 22; -fx-text-fill: white");
                btn_cadastrarVenda.setDisable(true);
                btn_buscarPeca.setDisable(false);
                btn_buscarPeca.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_buscarCliente.setDisable(false);
                btn_buscarCliente.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_buscarServico.setDisable(false);
                btn_buscarServico.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_relatorios.setDisable(false);
                btn_relatorios.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_cadastrarVenda.setOpacity(100);
                break;

            case "btn_buscarPeca": btn_buscarPeca.setStyle("-fx-background-color: #1d5e69; -fx-font-size: 22; -fx-text-fill: white");
                btn_buscarPeca.setDisable(true);
                btn_cadastrarVenda.setDisable(false);
                btn_cadastrarVenda.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_buscarCliente.setDisable(false);
                btn_buscarCliente.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_buscarServico.setDisable(false);
                btn_buscarServico.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_relatorios.setDisable(false);
                btn_relatorios.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_buscarPeca.setOpacity(100);
                break;

            case "btn_buscarCliente": btn_buscarCliente.setStyle("-fx-background-color: #1d5e69; -fx-font-size: 22; -fx-text-fill: white");
                btn_buscarCliente.setDisable(true);
                btn_cadastrarVenda.setDisable(false);
                btn_cadastrarVenda.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_buscarPeca.setDisable(false);
                btn_buscarPeca.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_buscarServico.setDisable(false);
                btn_buscarServico.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_relatorios.setDisable(false);
                btn_relatorios.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_buscarCliente.setOpacity(100);
                break;

            case "btn_buscarServico": btn_buscarServico.setStyle("-fx-background-color: #1d5e69; -fx-font-size: 22; -fx-text-fill: white");
                btn_buscarServico.setDisable(true);
                btn_cadastrarVenda.setDisable(false);
                btn_cadastrarVenda.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_buscarPeca.setDisable(false);
                btn_buscarPeca.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_buscarCliente.setDisable(false);
                btn_buscarCliente.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_relatorios.setDisable(false);
                btn_relatorios.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_buscarServico.setOpacity(100);
                break;

            case "btn_relatorios": btn_relatorios.setStyle("-fx-background-color: #1d5e69; -fx-font-size: 22; -fx-text-fill: white");
                btn_relatorios.setDisable(true);
                btn_cadastrarVenda.setDisable(false);
                btn_cadastrarVenda.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_buscarPeca.setDisable(false);
                btn_buscarPeca.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_buscarCliente.setDisable(false);
                btn_buscarCliente.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_buscarServico.setDisable(false);
                btn_buscarServico.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
                btn_relatorios.setOpacity(100);
                break;

        }
    }

}