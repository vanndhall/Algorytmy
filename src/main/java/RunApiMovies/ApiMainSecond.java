package RunApiMovies;

import dao.DaoProvider;
import models.Patient;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class ApiMainSecond {
    public static void main(String[] args){
        DaoProvider daoProvider = new DaoProvider();
        Patient[] mojaLista = daoProvider.getPatientArray();

        Arrays.sort(mojaLista, new Comparator<Patient>() {
            @Override
            public int compare(Patient o1, Patient o2) {
                // return o1.getName().compareTo(o2.getName());
                return o1.getAge() - o2.getAge();
            }

        });
        System.out.println(Arrays.asList(mojaLista));
    }
}
