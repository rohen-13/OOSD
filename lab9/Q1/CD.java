package Q1;

public class CD extends LibraryItem implements LoanItem {
    String band;
    String title;
    int numTracks;

    public CD(String ID, String band, String title, int numTracks) {
        super("Q1.CD", ID);
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    @Override
    public double calculatePrice() {
        return numTracks * 0.5;
    }
}