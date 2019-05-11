package _17_Memento;

import java.util.Date;

public class Ticket {
    private String filmName;
    private Date date;

    public void setData(String filmName) {
        this.filmName = filmName;
        this.date = new Date();
    }

    public Save save() {
        return new Save(filmName);
    }

    public void load(Save save) {
        filmName = save.getFilmName();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "filmName='" + filmName + '\'' +
                ", date=" + date +
                '}';
    }
}
