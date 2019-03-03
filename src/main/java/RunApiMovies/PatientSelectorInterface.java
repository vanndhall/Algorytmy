package RunApiMovies;

import models.Patient;

public interface PatientSelectorInterface {
    Patient[] getPatientsByName();
    Patient[] getPatientsByAge();
    Patient[] getCustomSort();
}
