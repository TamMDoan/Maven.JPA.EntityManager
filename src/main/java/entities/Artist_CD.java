package entities;

public class Artist_CD {
    int cd_id;
    int artist_id;

    public Artist_CD(int cd_id, int artist_id){
        this.cd_id = cd_id;
        this.artist_id = artist_id;
    }

    public int getCd_id() {
        return cd_id;
    }

    public void setCd_id(int cd_id) {
        this.cd_id = cd_id;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }
}
