// Hauptklasse des Programms
package de.mgonzales.main;
// Importieren des UiController-Pakets, um die Benutzeroberfläche zu steuern
import de.mgonzales.ui.UiController;


public class Main {

    //region Methoden
    // Hauptmethode, die beim Starten des Programms aufgerufen wird
    public static void main(String[] args) {
        // Aufruf der startUi-Methode des UiController, um die Benutzeroberfläche zu starten
        UiController.startUi();
    }
    //endregion Methoden
}
