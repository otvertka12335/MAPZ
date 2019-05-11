package _17_Memento;

import java.util.Date;

public class Save {
    private final String filmName;
    private final Date date;

    public Save(String filmName) {
        this.filmName = filmName;
        this.date = new Date();
    }

    public String getFilmName() {
        return filmName;
    }

    public Date getDate() {
        return date;
    }
}
