package Eksamen_kont2023;

public abstract class Skinnegående {
    final String Id;
    final int sporVidde;
    Skinnegående neste, forrige;

    public Skinnegående(String id, int sporvidde) {
        this.Id = id;
        this.sporVidde = sporvidde;
    }

    public String hentId() {
        return Id;
    }
    public int hentSporvidde() {
        return sporvidde;
    }
}
