package RunApiMovies;

import dao.DaoProvider;
import models.Film;
import java.util.Arrays;
import java.util.Comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilmSelector implements FilmSelectorInterface {

    private List<Film> films = new ArrayList<>();

    public FilmSelector(DaoProvider daoProvider) {
        this.films = daoProvider.getFilmList();
    }

    public List<Film> getFilmListByNameSort() {
        Film[] filmArray = this.films.toArray(new Film[this.films.size()]);
        Arrays.sort(filmArray, (o1, o2) -> o1.getNazwa().compareTo(o2.getNazwa()));
        return Arrays.asList(filmArray);
    }


    @Override
    public List<Film> getAllFilms() {
        return this.films;
    }


    @Override
    public List<Film> getFilmListByName() {
        return null;
    }
    @Override
    public List<Film> getFilmListByNameStream() {
        return null;
    }

    @Override
    public List<Film> getCustomFilter() {
        return null;
    }

    @Override
    public List<Film> getFilmListByYear() {
        List<Film> result = this.films
                .stream()
                .sorted((p1, p2) -> p1.getRok().compareTo(p2.getRok()))
                .collect(Collectors.toList());
        return result;
    }

    @Override
    public List<Film> getFilmListByCountry(String countryName) {
        List<Film> result = this.films
                .stream()
                .filter(film -> film.getKraj().equals(countryName))
                .collect(Collectors.toList());
        return result;
    }
}