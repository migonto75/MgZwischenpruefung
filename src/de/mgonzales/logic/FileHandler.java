package de.mgonzales.logic;

import de.mgonzales.model.Game;
import de.mgonzales.settings.AppTexts;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Diese Klasse bietet Methoden zum Verwalten von Dateioperationen, insbesondere zum Lesen und Schreiben von Spielen in einer CSV-Datei.
 */
public class FileHandler {
    //region Konstanten
    //endregion Konstanten

    //region Attribute
    //endregion Attribute

    //region Konstruktoren
    //endregion Konstruktoren

    //region Methoden
    /**
     * Überprüft, ob die CSV-Datei bereits existiert. Wenn nicht, wird sie erstellt und die Überschriften werden hinzugefügt.
     */
    public static void checkIfFileExists() {
        File games = new File(AppTexts.FILE_PATH);

        if (!games.exists()) {
            try {
                // Erstellt die notwendigen Verzeichnisse
                games.getParentFile().mkdirs();
                // Erstellt die Datei
                games.createNewFile();

                // Schreibt die Überschriften in die Datei
                try (FileWriter writer = new FileWriter(AppTexts.FILE_PATH, true)) {
                    writer.append(AppTexts.TXT_CSV_FILE_HEADERS);
                }
            } catch (IOException e) {
                System.out.println(AppTexts.TXT_FILE_CREATE_ERROR + e.getMessage());
            }
        }
    }

    /**
     * Speichert eine Liste von Spielen in der CSV-Datei.
     *
     * @param games Die Liste der Spiele, die gespeichert werden sollen.
     */
    public void saveGameToCsvFile(List<Game> games) {
        try (FileWriter writer = new FileWriter(AppTexts.FILE_PATH, true)) { // true für das Anhängen an die Datei
            for (Game game : games) {
                writer.append(game.getGameName());
                writer.append(AppTexts.DELIMITER);
                writer.append(game.getGameGenre());
                writer.append(AppTexts.DELIMITER);
                writer.append(game.isGameCoopMode() ? AppTexts.TXT_YES : AppTexts.TXT_NO);
                writer.append("\n");
            }
        } catch (IOException e) {
            System.out.println(AppTexts.TXT_FILE_WRITE_ERROR + e.getMessage());
        }
    }

    /**
     * Lädt die Spiele aus der CSV-Datei und gibt sie als Liste zurück.
     *
     * @return Eine Liste von Spielen, die aus der CSV-Datei geladen wurden.
     */
    public static List<Game> loadGamesFromCsvFile() {
        List<Game> games = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(AppTexts.FILE_PATH))) {
            String line;
            // Überspringen Sie die Überschriftszeile
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(AppTexts.DELIMITER);
                if (values.length < 3) {
                    System.out.println(AppTexts.TXT_INVALID_NUMBERS_OF_VALUES + line);
                    continue;  // Gehe zur nächsten Zeile
                }
                String name = values[0];
                String genre = values[1];
                boolean coopMode = AppTexts.TXT_YES.equals(values[2]);
                games.add(new Game(name, genre, coopMode));
            }
        } catch (IOException e) {
            System.out.println(AppTexts.TXT_FILE_READ_ERROR + e.getMessage());
        }
        return games;
    }

    /**
     * Gibt den Pfad zur CSV-Datei zurück.
     *
     * @return Der Pfad zur CSV-Datei.
     */
//    public static String getFilePath() {
//        return AppTexts.FILE_PATH;
//    }
    //endregion Methoden
}