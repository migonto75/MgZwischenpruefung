package de.mgonzales.model;

import de.mgonzales.settings.AppTexts;

public class Game {
    //region Konstanten
    // Bereich für Konstanten (aktuell nichts definiert)
    //endregion

    //region Attribute
    // Attribute der Klasse
    private String gameName;       // Speichert den Namen des Spiels
    private String gameGenre;      // Speichert das Genre des Spiels
    private boolean gameCoopMode;  // Zeigt an, ob das Spiel einen Koop-Modus unterstützt
    //endregion Attribute

    //region Konstruktoren
    // Konstruktoren der Klasse
    // Standardkonstruktor, der die Werte aus AppTexts setzt
    public Game() {
        gameName = AppTexts.DEFAULT_GAME_NAME;
        gameGenre = AppTexts.DEFAULT_GAME_GENRE;
        gameCoopMode = AppTexts.DEFAULT_GAME_COOP_MODE;
    }

    // Konstruktor, um ein Spiel mit bestimmten Werten zu erstellen
    public Game(String gameName, String gameGenre, boolean gameCoopMode) {
        this.gameName = gameName;
        this.gameGenre = gameGenre;
        this.gameCoopMode = gameCoopMode;
    }
    //endregion Konstruktor

    //region Methoden
    // Methode, um ein Spiel aus einer CSV-Zeile zu erstellen
    private void setFromCsvLine(String csvLine) {
        String[] attributes = csvLine.split(AppTexts.DELIMITER);
        // Hier könntest du die Attribute des Spiels aus dem Array "attributes" setzen
    }
    //endregion Methoden


    // region Getter, Setter
        // Gibt den Namen des Spiels zurück
    public String getGameName() {
        return gameName;
    }

    // Setzt den Namen des Spiels
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    // Gibt das Genre des Spiels zurück
    public String getGameGenre() {
        return gameGenre;
    }

    // Setzt das Genre des Spiels
    public void setGameGenre(String gameGenre) {
        this.gameGenre = gameGenre;
    }

    // Überprüft, ob das Spiel einen Koop-Modus hat
    public boolean isGameCoopMode() {
        return gameCoopMode;
    }

    // Setzt den Koop-Modus des Spiels
    public void setGameCoopMode(boolean gameCoopMode) {
        this.gameCoopMode = gameCoopMode;
    }
    //endregion Getter und Setter

    //region toString
    // Gibt eine benutzerfreundliche Darstellung des Spiels zurück
    @Override
    public String toString() {
        return "Games{" +
                "gameName='" + gameName + '\'' +
                ", gameGenre='" + gameGenre + '\'' +
                ", gameCoop=" + gameCoopMode +
                '}';
    }
    //endregion toString
}
