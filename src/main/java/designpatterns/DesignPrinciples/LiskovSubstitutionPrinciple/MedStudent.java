package designpatterns.DesignPrinciples.LiskovSubstitutionPrinciple;

public class MedStudent extends Student implements Med{
    @Override
    public void studyBiology(){
        System.out.println("Student is studying Biology");
    }
}
