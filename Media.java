// Klasse, die ein Film oder eine Serie repräsentiert
public class Media {
    private String title;    // Titel des Films/Serie
    private String type;     // Typ: Film oder Serie
    private String review;   // Rezension
    private int rating;      // Sternebewertung (1-5)
    private String status;   // Status: Geschaut, Abgebrochen, Geplant, Laufend

    // Konstruktor: Initialisiert ein Media-Objekt mit allen Attributen
    public Media(String title, String type, String review, int rating, String status) {
        this.title = title;
        this.type = type;
        this.review = review;
        this.rating = rating;
        this.status = status;
    }

    // Getter für alle Attribute
    public String getTitle() {
        return title; // Gibt den Titel zurück
    }

    public String getType() {
        return type; // Gibt den Typ (Film oder Serie) zurück
    }

    public String getReview() {
        return review; // Gibt die Rezension zurück
    }

    public int getRating() {
        return rating; // Gibt die Sternebewertung zurück
    }

    public String getStatus() {
        return status; // Gibt den Status zurück
    }

    // Überschreibt die toString()-Methode, um die Informationen des Objekts als String zurückzugeben

    public String toString() {
        return "Titel: " + title + ", Typ: " + type + ", Bewertung: " + rating + " Sterne, Status: " + status;
    }

    // Methode, um zu prüfen, ob die Bewertung hoch ist (≥ 4 Sterne)
    public boolean isHighlyRated() {
        return rating >= 4;
    }
}
