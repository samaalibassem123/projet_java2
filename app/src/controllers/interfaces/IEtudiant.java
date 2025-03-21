package controllers.interfaces;

import models.Etudiant;

public interface IEtudiant {
    void AddStudent(Etudiant e);
    void FindStudent(Etudiant e);
    void UpdateStudent(Etudiant e);
    void DeleteStudent(Etudiant e);
}
