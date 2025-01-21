# Spectamicus-Manager

Ein Java-Swing-Projekt zur Verwaltung von Filmen und Serien. Mit diesem Programm können Benutzer Filme und Serien hinzufügen, filtern, sortieren und ihre Bewertungen verwalten.

## Funktionen
- **Medienverwaltung:** Hinzufügen, Anzeigen und Ändern von Filmen und Serien.
- **Filter und Sortierung:**
  - Filtern nach Typ (Film/Serie).
  - Filtern nach Bewertung (z. B. 5 Sterne).
  - Sortieren nach Titel oder Bewertung.
- **Bewertungen:** Verwalten von Bewertungen und Status wie "Geschaut" oder "Geplant".
- **Interaktive Benutzeroberfläche:** Benutzerfreundliches Design mit Java Swing.

## Projektstruktur
Die Projektstruktur ist wie folgt organisiert:

```
Spectamicus-Manager/
├── src/               # Enthält den Quellcode des Projekts
│   ├── SpectamicusLayout.java   # Hauptklasse mit der Benutzeroberfläche
│   ├── Media.java                # Datenstruktur für Filme und Serien
│
├── test/              # Testklassen
│   ├── ManualTest.java           # Manuelle Tests für die Media-Klasse
│
├── resources/         # Ressourcen wie Bilder oder Icons
│   ├── logo.png                 # Logo der Anwendung
│
├── README.md          # Dokumentation des Projekts
```

## Nutzung

### Voraussetzungen
- Java Development Kit (JDK) 8 oder höher
- Eine IDE wie IntelliJ IDEA, Eclipse oder Visual Studio Code (optional)

### Installation
1. Klonen Sie das Repository:
   ```bash
   git clone https://github.com/beyz68/Spectamicus
   ```
2. Importieren Sie das Projekt in Ihre IDE.
3. Stellen Sie sicher, dass das JDK korrekt eingerichtet ist.

### Anwendung starten
1. Führen Sie die Methode `main` in der Klasse `SpectamicusLayout` aus.
2. Die Benutzeroberfläche öffnet sich, und Sie können:
   - Filme und Serien hinzufügen.
   - Bewertungen und Status verwalten.
   - Filter- und Sortierfunktionen nutzen.

## Beispielanwendung
1. **Film/Serie hinzufügen:**
   - Titel, Typ, Bewertung und Status auswählen.
   - Speichern und die Liste aktualisieren.

2. **Filter und Sortierung:**
   - Wählen Sie einen Filter aus (z. B. "5 Sterne"), um die Liste einzugrenzen.
   - Sortieren Sie die Einträge alphabetisch oder nach Bewertung.

## Mitwirkende
- BeyzaYavuz: Entwicklung, Design und Dokumentation


