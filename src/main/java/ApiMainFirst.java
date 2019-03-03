import dao.DaoProvider;
import models.Patient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ApiMainFirst {
    public static void main(String[] args){
        DaoProvider daoProvider = new DaoProvider();
        List<Patient> mojaLista = daoProvider.getPatientList();

        //System.out.println(Arrays.asList(mojaLista));
       // Arrays.sort(mojaLista.toArray());

        List<Patient> wiek = mojaLista
                .stream()
                .sorted((p1,p2)->p1.getAge() -p2.getAge())
                .collect(Collectors.toList());

        List<Patient> alfabetycznie = mojaLista
                .stream()
                .sorted((p1,p2)->p1.getName().compareTo(p2.getName()))
                .collect(Collectors.toList());
        System.out.println("\nNie posortowane:  \n");
        System.out.println(Arrays.asList(mojaLista));
        System.out.println("\nPosortowane wiekiem: \n");
        System.out.println(Arrays.asList(wiek));
        System.out.println("\nPosortowane alfabetycznie: \n");
        System.out.println(Arrays.asList(alfabetycznie));


//        System.out.println(daoProvider.getData());
//        System.out.println(Arrays.asList(daoProvider.getPatientList()));

        String ala ="ala ma kota";
        String iza ="ala ma kota";

        // to tak nie dziala
        if(ala == iza){
            System.out.println("\nSą równe");
        }
        else
            System.out.println("nie są równe");

        // tylko tak:
        if(ala.equals(iza)){
            System.out.println("Są równe");
        }
        else
            System.out.println("nie są równe");

    }
}
