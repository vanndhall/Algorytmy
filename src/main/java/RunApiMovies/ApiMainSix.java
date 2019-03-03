package RunApiMovies;

import dao.DaoProvider;
import models.Patient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class ApiMainSix {
    public static void main(String[] args) throws IOException {

        String nazwa;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Program do filtrowania filmów z internetu.");


        FilmSelector filmSelector = new FilmSelector(new DaoProvider());


        System.out.println("######################################");
        System.out.println(Arrays.asList(filmSelector.getAllFilms()));

        System.out.println("\nPo jakim kraju pofiltrować?: ");
        nazwa = br.readLine();
        System.out.println(Arrays.asList(filmSelector.getFilmListByCountry(nazwa)));
    }
}