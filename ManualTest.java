public class ManualTest {

    public static void main(String[] args) {
        // Test 1: Film mit hoher Bewertung
        Media highRatedMedia = new Media("Inception", "Film", "Ein Meisterwerk", 5, "Geschaut");
        if (highRatedMedia.isHighlyRated()) {
            System.out.println("Test 1 bestanden: Hoch bewerteter Film korrekt erkannt.");
        } else {
            System.out.println("Test 1 fehlgeschlagen: Hoch bewerteter Film nicht erkannt.");
        }

        // Test 2: Film mit mittlerer Bewertung
        Media mediumRatedMedia = new Media("Avatar", "Film", "Visuell beeindruckend", 4, "Geplant");
        if (mediumRatedMedia.isHighlyRated()) {
            System.out.println("Test 2 bestanden: Mittelhohe Bewertung korrekt erkannt.");
        } else {
            System.out.println("Test 2 fehlgeschlagen: Mittelhohe Bewertung nicht erkannt.");
        }

        // Test 3: Film mit niedriger Bewertung
        Media lowRatedMedia = new Media("Schlechter Film", "Film", "Nicht so gut", 2, "Abgebrochen");
        if (!lowRatedMedia.isHighlyRated()) {
            System.out.println("Test 3 bestanden: Niedrig bewerteter Film korrekt erkannt.");
        } else {
            System.out.println("Test 3 fehlgeschlagen: Niedrig bewerteter Film nicht erkannt.");
        }
    }
}
