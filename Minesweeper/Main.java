package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Optional;
import java.util.Random;

import static java.lang.Integer.valueOf;

public class Main extends Application {


    static int zellenHeight;
    static int zellenWidth;
    static int minenZahl;
    static int spielfeldheight=600;
    static int spielfeldwidth=800;
    static Zelle[][] zellenArray;
    private Scene scene;
    static int flagCount = 0;
    static double BUTTON_MAX_HEIGTH;
    static double BUTTON_MAX_WIDTH;


    public void reset() throws Exception {
        flagCount = 0;
        scene.setRoot(gameSettings());
    }

    public void groeseSelection(int hoehe, int breite){
        zellenHeight = hoehe;
        zellenWidth = breite;
        //spielfeldheight = zellenHeight*30;
        //spielfeldwidth = zellenWidth*30;
        zellenArray = new Zelle[zellenWidth][zellenHeight];
        BUTTON_MAX_HEIGTH = spielfeldheight/zellenHeight;
        BUTTON_MAX_WIDTH = spielfeldwidth/zellenWidth;

    }

    public HBox gameSettings() throws Exception {

        ToggleGroup groesse = new ToggleGroup();
        ToggleGroup difficulty = new ToggleGroup();

        Button spielStart = new Button("Spiel starten");

        RadioButton klein = new RadioButton("Kleines Spielfeld");
        RadioButton mittel = new RadioButton("Mittleres Spielfeld");
        RadioButton gross = new RadioButton("Großes Spielfeld");
        RadioButton benutzer = new RadioButton("Benutzerdefiniert");

        RadioButton easy = new RadioButton("Leicht");
        RadioButton advanced = new RadioButton("Mittelschwer");
        RadioButton hard = new RadioButton("Schwer");
        RadioButton uInput = new RadioButton("Benutzerdefiniert");

        klein.setToggleGroup(groesse);
        mittel.setToggleGroup(groesse);
        gross.setToggleGroup(groesse);
        benutzer.setToggleGroup(groesse);

        easy.setToggleGroup(difficulty);
        advanced.setToggleGroup(difficulty);
        hard.setToggleGroup(difficulty);
        uInput.setToggleGroup(difficulty);

        TextField uInputwidth = new TextField();
        TextField uInputheight = new TextField();
        TextField uIMinen = new TextField();
        Label hoehe = new Label("Höhe: ");
        Label breite = new Label("Breite: ");
        Label mine = new Label("Minenanzahl: ");

        HBox hoehenIn = new HBox(hoehe,uInputheight);
        HBox breitenIn = new HBox(breite, uInputwidth);
        HBox minenIn = new HBox(mine,uIMinen);

        VBox spielGroesse = new VBox(klein,mittel,gross,benutzer,hoehenIn,breitenIn);
        VBox schwieirgkeit = new VBox(easy,advanced,hard,uInput,minenIn);
        VBox spielStarten = new VBox(spielStart);



        HBox fenster = new HBox(spielGroesse,schwieirgkeit,spielStarten);


        fenster.setPrefSize(800,600);

        spielStart.setOnMousePressed(e ->{
            try {
                if(klein.isSelected()){
                    groeseSelection(5,10);
                }
                if(mittel.isSelected()){
                    groeseSelection(15,15);
                }
                if(gross.isSelected()){
                    groeseSelection(20,25);
                }
                if(benutzer.isSelected()){
                    if(valueOf(uInputheight.getText())>0 &&valueOf(uInputwidth.getText())>0) {
                        groeseSelection(valueOf(uInputwidth.getText()), valueOf(uInputheight.getText()));
                    }
                }
                if(easy.isSelected()){
                    minenZahl = zellenWidth*zellenHeight/25;
                }
                if(advanced.isSelected()){
                    minenZahl=zellenWidth*zellenHeight/10;
                }
                if(hard.isSelected()){
                    minenZahl=zellenWidth*zellenHeight/5;
                }
                if(uInput.isSelected()){
                    if((valueOf(uIMinen.getText()) > 0)){
                        minenZahl = valueOf(uIMinen.getText());
                    }
                }
                scene.setRoot(initSpielfeld());
            } catch (Exception e1) {
                e1.printStackTrace();
            }

        });


        return(fenster);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("SEP Minesweeper");
        scene = new Scene(gameSettings());
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }

    private Parent initSpielfeld() throws Exception {
        GridPane spielfeld = new GridPane();
        spielfeld.setPrefSize(spielfeldheight, spielfeldwidth);
        for (int i = 0; i < zellenHeight; i++) {
            for (int j = 0; j < zellenWidth; j++) {
                Zelle neuesFeld = new Zelle(j, i);
                neuesFeld.setPrefSize(BUTTON_MAX_WIDTH,BUTTON_MAX_HEIGTH);
                spielfeld.add(neuesFeld, j, i, 1, 1);
                zellenArray[j][i] = neuesFeld;
            }
        }
        bombenSetzen();
        for (int i = 0; i < zellenHeight; i++) {
            for (int j = 0; j < zellenWidth; j++) {
                Zelle aktuelleZelle = zellenArray[j][i];
                if (aktuelleZelle.hatBombe) {
                    continue;
                }
                int zellenZahl = checkNachbaren(aktuelleZelle,"cN");
                if (zellenZahl > 0) {
                    aktuelleZelle.zelleninhalt.setText(Integer.toString(zellenZahl));
                }
            }
        }
        return (spielfeld);
    }

    public void bombenSetzen() {
        Random r = new Random();
        for (int i = 0; i < minenZahl; i++) {
            int k = r.nextInt(zellenWidth);
            int l = r.nextInt(zellenHeight);
            if (zellenArray[k][l].hatBombe==false) {
                zellenArray[k][l].hatBombe = true;
                zellenArray[k][l].zelleninhalt.setText("X");
            }
            else if(zellenArray[k][l].hatBombe){
                i--;
            }
        }
    }

    private int checkNachbaren(Zelle mittelZelle, String codeWord) throws Exception {
        int countInhalt = 0;
        for (int i = mittelZelle.yKoord - 1; i <= mittelZelle.yKoord + 1; i++) {
            for (int j = mittelZelle.xKoord - 1; j <= mittelZelle.xKoord + 1; j++) {
                if (codeWord == "cN") {
                    try {
                        if (zellenArray[j][i].hatBombe) {
                            countInhalt++;
                        }
                    } catch (ArrayIndexOutOfBoundsException e1) {
                        continue;
                    }
                } else if (codeWord == "rO") {
                    try {
                        if (zellenArray[j][i].hatBombe) {
                            continue;
                        }
                        openZelle(zellenArray[j][i]);
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        continue;
                    }
                }
            }

        }
        return (countInhalt);
    }

    void checkVictoryCond() throws Exception {
        int feldOhneMinen = (((zellenWidth)*(zellenHeight))-minenZahl);
        for (int i = 0; i < zellenHeight; i++) {
            for (int j = 0; j < zellenWidth; j++) {
                if (zellenArray[j][i].isOpen) {
                    feldOhneMinen--;
                }
            }
        }
        if (feldOhneMinen == 0) {
            showBombs();
            popUP("Gewonnen!");
        }
    }

    public void popUP(String codeword) throws Exception{
        Alert gewonnen = new Alert(Alert.AlertType.CONFIRMATION);
        gewonnen.setTitle(codeword);
        gewonnen.setHeaderText("Neues Spiel starten?");
        ButtonType neuesSpiel = new ButtonType("Neues Spiel starten");
        ButtonType beenden = new ButtonType("Beenden", ButtonBar.ButtonData.CANCEL_CLOSE);
        gewonnen.getButtonTypes().setAll(neuesSpiel,beenden);
        Optional<ButtonType> result = gewonnen.showAndWait();
        if(result.get() == neuesSpiel){
            reset();
        }
        else{
            System.exit(0);
        }
    }

    public void showBombs(){
        for (int i = 0; i < zellenHeight; i++){
            for (int j = 0; j < zellenWidth; j++){
                if (zellenArray[j][i].hatBombe && zellenArray[j][i].getText() != "P") {
                    zellenArray[j][i].setText(zellenArray[j][i].zelleninhalt.getText());
                } else if (zellenArray[j][i].hatBombe==false && zellenArray[j][i].getText() == "P") {
                    zellenArray[j][i].setText("F");
                    zellenArray[j][i].setTextFill(Color.web("#ff0000"));
                }
            }
        }
    }


    public void openZelle(Zelle aktuelleZelle) throws Exception {
        if (aktuelleZelle.isOpen || aktuelleZelle.getText() =="P") {
            return;
        }
        if (aktuelleZelle.hatBombe) {
            showBombs();
            popUP("Game Over");
        }
        aktuelleZelle.isOpen = true;
        aktuelleZelle.setDisable(true);
        if (aktuelleZelle.zelleninhalt.getText() == "") {
            int tmp = checkNachbaren(aktuelleZelle,"rO");
        }
        aktuelleZelle.setText(aktuelleZelle.zelleninhalt.getText());
        checkVictoryCond();
    }


    public void setFlag(Zelle aktuellezelle) throws Exception {
        if (aktuellezelle.getText() == "" && flagCount < minenZahl) {
            aktuellezelle.setText("P");
            flagCount++;
        }
        else if (aktuellezelle.getText() == "P") {
            aktuellezelle.setText("");
            flagCount--;
        }
        checkVictoryCond();
    }


    private class Zelle extends Button {
        private int xKoord;
        private int yKoord;
        private boolean hatBombe = false;
        private Text zelleninhalt = new Text();
        boolean isOpen = false;

        public Zelle(int xKoord, int yKoord) {
            this.xKoord = xKoord;
            this.yKoord = yKoord;
            if (hatBombe) {
                zelleninhalt.setText("X");
            } else {
                zelleninhalt.setText("");
            }

            setOnMousePressed(event -> {
                if (event.isPrimaryButtonDown()) {
                    try {
                        openZelle(this);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                else if (event.isSecondaryButtonDown()) {
                    try {
                        setFlag(this);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
