package de.mgonzales.ui;

import de.mgonzales.logic.FileHandler;
import de.mgonzales.model.Game;
import de.mgonzales.settings.AppCommands;
import de.mgonzales.settings.AppTexts;
import de.rhistel.logic.ConsoleReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Diese Klasse steuert die Benutzeroberfläche (UI) des Programms.
 */
public class UiController {

    //region Konstanten
    //endregion Konstanten

    //region Attribute
    //Liste der Spiele
    private static List<Game> gameList = new ArrayList<>();
    //endregion Attribute

    //region Konstruktoren
    //Standardkonstruktor
    public UiController() {
    }
    //endregion Konstruktoren

    //region Methoden
    /**
     * Startet die Benutzeroberfläche.
     */
    public static void startUi() {
        initialize();
        FileHandler.checkIfFileExists();
        printAppName();
        displayMenu();
    }

    /**
     * Initialisiert die Spieleliste durch Laden der Spiele aus der CSV-Datei.
     */
    private static void initialize() {
        gameList = FileHandler.loadGamesFromCsvFile();
    }

    /**
     * Zeigt den Namen der Anwendung an.
     */
    public static void printAppName() {
        System.out.println(AppTexts.TXT_APP_NAME);
    }

    /**
     * Zeigt das Hauptmenü und verarbeitet die Benutzereingaben.
     */
    private static void displayMenu() {
        boolean isRunning = true;

        while (isRunning) {
            System.out.printf(de.mgonzales.settings.AppTexts.TXT_MENU, 1, 2, 0);
            int userInput = ConsoleReader.in.readInt();

            switch (userInput) {
                case AppCommands.CREATE -> addNewGameToList();
                case AppCommands.SHOW -> displayGameList();
                case AppCommands.EXIT -> endApp();
                default -> System.out.println(AppTexts.INVALID_CHOICE);
            }
        }
    }

    /**
     * Ermöglicht dem Benutzer das Hinzufügen eines neuen Spiels zur Liste.
     */
    private static void addNewGameToList() {
        System.out.println(AppTexts.TXT_WHICH_GAME_TO_ADD);
        System.out.println(AppTexts.TXT_ADD_NAME);
        String userInputGameName = ConsoleReader.in.readMandatoryString();

        System.out.println(AppTexts.TXT_ADD_GENRE);
        String userInputGameGenre = ConsoleReader.in.readMandatoryString();

        System.out.println(AppTexts.TXT_ADD_COOP_MODE);
        boolean userInputGameCoopMode = ConsoleReader.in.readMandatoryAnswerToBinaryQuestion();

        Game game = new Game(userInputGameName, userInputGameGenre, userInputGameCoopMode);
        gameList.add(game);

        FileHandler fileHandler = new FileHandler();
        fileHandler.saveGameToCsvFile(Collections.singletonList(game)); // Verwenden Sie Collections.singletonList, um eine Liste mit nur einem Element zu erstellen
    }

    /**
     * Zeigt die Liste der gespeicherten Spiele an.
     */
    private static void displayGameList() {
        if (gameList.isEmpty()) {
            System.out.println(AppTexts.TXT_NO_GAMES_IN_LIST);
            return;
        }
        for (Game game : gameList) {
            System.out.println("\nName: \t\t" + game.getGameName() + ",\nGenre: \t\t" + game.getGameGenre() + ",\nCoop-Mode: \t" + (game.isGameCoopMode() ? "Ja" : "Nein\n"));
        }
    }

    /**
     * Beendet die Anwendung.
     */
    public static void endApp() {
        System.out.println(AppTexts.TXT_END_APP);
        System.exit(0);
    }
    //endregion Methoden
}