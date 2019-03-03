import dao.DaoProvider;
import models.Patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class ApiMainFive {
    public static void main(String[] args) {
        FilmSelector filmSelector = new FilmSelector(new DaoProvider());
        System.out.println("Lista filmów przed sortowaniem: \n");
        System.out.println(Arrays.asList(filmSelector.getAllFilms()));

        System.out.println("\nLista filmów po sortowaniu tytułów filmów: \n");
        System.out.println(Arrays.asList(filmSelector.getFilmListByNameSort()));
    }
}
