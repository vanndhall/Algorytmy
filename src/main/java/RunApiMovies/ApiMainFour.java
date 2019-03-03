package RunApiMovies;

import dao.DaoProvider;
import models.Patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ApiMainFour {
    public static void main(String[] args) {

    DaoProvider daoProvider = new DaoProvider();
        System.out.println(daoProvider.getFilmList());

    }

}
