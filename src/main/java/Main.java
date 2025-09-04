public class Main {
  public static void main(String[] args){
    Student student1 = new Student("Mireau", "Appel");
    Student student2 = new Student("François", "Ragot");
    Student student3 = new Student("Luca", "Cerezuela");
    Student student4 = new Student("Pavlo", "Konovalov");
    //étudiants de la promo

    student1.addResult("Programmation 2", new Grade(19.5));
    student2.addResult("Programmation 2", new Grade(13));
    student3.addResult("Programmation 2", new Grade(16.5));
    student4.addResult("Programmation 2", new Grade(20));
    //notes des étudiants en Java

    student1.addResult("Structures discrètes", new Grade(18.5));
    student2.addResult("Structures discrètes", new Grade(17));
    student3.addResult("Structures discrètes", new Grade(16.5));
    student4.addResult("Structures discrètes", new Grade(19));
    //notes des étudiants en structures discrètes

    student1.addResult("Bases de données relationnelles", new Grade(20));
    student2.addResult("Bases de données relationnelles", new Grade(18));
    student3.addResult("Bases de données relationnelles", new Grade(12.5));
    student4.addResult("Bases de données relationnelles", new Grade(19.5));
    //notes des étudiants en bases de données relationnelles

    Cohort promotion = new Cohort("L2 Informatique");
    promotion.addStudent(student1);
    promotion.addStudent(student2);
    promotion.addStudent(student3);
    promotion.addStudent(student4);

    promotion.printStudentsResults();
  }
}
