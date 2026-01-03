package designpatterns.DesignPrinciples.LiskovSubstitutionPrinciple;

public class NonMedStudent extends Student implements NonMed{
    @Override
    public void studyMaths(){
        System.out.println("Student is studying Maths");
    }
}
