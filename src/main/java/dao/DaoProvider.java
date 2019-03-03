package dao;

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
    public List<Patient> getPatientList() {
        return generatePatientList();
    }
}
