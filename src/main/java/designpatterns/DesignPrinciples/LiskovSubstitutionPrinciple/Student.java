package designpatterns.DesignPrinciples.LiskovSubstitutionPrinciple;

public abstract class Student {
    public void studyEnglish(){
        System.out.println("Student is studying English");
    }

    public void studyPhysics(){
        System.out.println("Student is studying Physics");
    }

    public void studyChemistry(){
        System.out.println("Student is studying Chemistry");
    }

    public void studyPhysicalEducation(){
        System.out.println("Student is studying Physical Education");
    }
}
