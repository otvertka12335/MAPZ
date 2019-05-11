package _18_Observable;

import java.util.ArrayList;
import java.util.List;

public class Films implements Observed {
    List<String> films = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addFilms(String film) {
        this.films.add(film);
        notifyObservers();
    }

    public void removeFilm(String film) {
        this.films.remove(film);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: subscribers) {
            observer.handlEvent(this.films);
        }
    }
}
