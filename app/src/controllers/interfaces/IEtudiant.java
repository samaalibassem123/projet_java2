package controllers.interfaces;

import models.Etudiant;

public interface IEtudiant {
    static void AddStudent(Etudiant e);
    void FindStudent(Etudiant e);
    void UpdateStudent(Etudiant e);
    void DeleteStudent(Etudiant e);
}
