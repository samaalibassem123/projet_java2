package controllers.interfaces;

import models.Etudiant;

public interface IEtudiant {
    static void AddStudent(Etudiant e){};
    static void UpdateStudent(Etudiant e){};
    static void DeleteStudent(Etudiant e){};
}
