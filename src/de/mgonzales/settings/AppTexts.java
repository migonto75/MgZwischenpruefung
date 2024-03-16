package de.mgonzales.settings;

public class AppTexts {

    //region Konstanten
    // Bereich für Konstantendeklarationen
    // Text für den Namen der App
    public static final String TXT_APP_NAME = """
            ================
            = Mg Game List =
            ================
            """;

    // Text für das Hauptmenü der App
    public static final String TXT_MENU = """                
            \n%s > Anlegen
            %s > Anzeigen                       
            ---------------
            %s > Beenden\n\n""";

    // Standardtexte für Spiele, falls keine gültigen Werte eingegeben werden
    public static final String DEFAULT_GAME_NAME = "No valid name";
    public static final String DEFAULT_GAME_GENRE = "No valid Genre";
    public static final boolean DEFAULT_GAME_COOP_MODE = false;

    // Text für ungültige Auswahl im Menü
    public static final String INVALID_CHOICE = "Ungültige Auswahl.";

    // Text, der angezeigt wird, wenn die App beendet wird
    public static final String TXT_END_APP = "Programm wird beendet...";

    // Trennzeichen für CSV-Dateien
    public static final String DELIMITER = ";";

    // Pfad zur CSV-Datei, in der die Spiele gespeichert werden
    public static final String FILE_PATH = "resources/games.csv";

    // Fehlermeldung, die angezeigt wird, wenn beim Erstellen der Datei oder beim Schreiben der Überschriften ein Fehler auftritt
    public static final String TXT_FILE_CREATE_ERROR = "Fehler beim Erstellen der Datei oder Schreiben der Überschriften: ";

    // Überschriften für die CSV-Datei
    public static final String TXT_CSV_FILE_HEADERS = "Name,Genre,Coop-Mode\n";

    // Fehlermeldung, die angezeigt wird, wenn beim Schreiben in die Datei ein Fehler auftritt
    public static final String TXT_FILE_WRITE_ERROR = "Fehler beim Schreiben in die Datei: ";

    // Fehlermeldung, die angezeigt wird, wenn beim Lesen der Datei ein Fehler auftritt
    public static final String TXT_FILE_READ_ERROR = "Fehler beim Lesen der Datei: ";

    // Text, der "Ja" repräsentiert (z.B. für den Koop-Modus eines Spiels)
    public static final String TXT_YES = "Ja";

    // Text, der "Nein" repräsentiert (z.B. für den Koop-Modus eines Spiels)
    public static final String TXT_NO = "Nein";

    // Text-Konstanten für die Benutzeroberfläche
    // Aufforderungstext, um ein neues Spiel zur Liste hinzuzufügen
    public static final String TXT_WHICH_GAME_TO_ADD = "Welches Spiel möchtest du anlegen?\n";

    // Warnmeldung für Zeilen in der CSV-Datei, die nicht die erwartete Anzahl von Werten haben
    public static final String TXT_INVALID_NUMBERS_OF_VALUES = "Unerwartete Anzahl von Werten in der Zeile: ";

    // Aufforderungstext, um den Namen des Spiels einzugeben
    public static final String TXT_ADD_NAME = "Gib den Namen des Spiels ein:";

    // Aufforderungstext, um das Genre des Spiels einzugeben
    public static final String TXT_ADD_GENRE = "Gib das Genre des Spiels ein:";

    // Aufforderungstext, um zu bestätigen, ob das Spiel einen Koop-Modus hat
    public static final String TXT_ADD_COOP_MODE = "Hat das Spiel einen Koop-Modus?";

    // Meldung, die angezeigt wird, wenn keine Spiele in der Liste vorhanden sind
    public static final String TXT_NO_GAMES_IN_LIST = "Es sind keine Spiele in der Liste vorhanden";

    // Einleitungstext, um die Spiele in der Liste anzuzeigen
    public static final String FOLLOWING_GAMES_IN_LIST = "Folgende Spiele sind in deiner Liste vorhanden:";
    //endregion Konstanten

    //region Attribute
    // Bereich für Attributdeklarationen (aktuell leer)
    //endregion Attribute

    //region Konstruktoren
    // Bereich für Konstruktoren (aktuell leer, da es sich um eine Klasse mit statischen Attributen handelt)
    //endregion Konstruktoren

    //region Methoden
    // Bereich für Methoden (aktuell leer, da keine Methoden definiert sind)
    //endregion Methoden
}
