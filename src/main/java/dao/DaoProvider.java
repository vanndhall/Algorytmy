package dao;

import models.Film;
import models.Patient;

import java.util.ArrayList;
import java.util.List;

public class DaoProvider implements DaoInterface  {
    private String data = "This is my data";

    public String getData() {return data; }


    private List<Patient> generatePatientList(){
        ArrayList<Patient> lista = new ArrayList<>();
        lista.add(new Patient( "Roman","Kowalski",80));
        lista.add(new Patient("Andrzej","Nowak",54));
        lista.add(new Patient("Janusz","Kowalski",48));

        return lista;
    }
    @Override
    public Patient[] getPatientArray() {
        List<Patient> tempList = generatePatientList();
        Patient[] array = new Patient[tempList.size()];
        tempList.toArray(array);
        return array;
        // return  generatePatientList().toArray(new Patient[generatePatientList().size()]);
    }

    @Override
    public List<Patient> getPatientList() {
        return generatePatientList();
    }

    @Override
    public List<Film> getFilmList() {
        return null;
    }
}
