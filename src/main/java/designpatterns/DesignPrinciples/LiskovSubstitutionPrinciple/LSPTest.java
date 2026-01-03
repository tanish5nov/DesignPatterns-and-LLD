package designpatterns.DesignPrinciples.LiskovSubstitutionPrinciple;

public class LSPTest {
    public static void start(){
        Student student = new MedStudent();
        student.studyChemistry();
        /*
        * Here We cannot access the studyBiology() method from MedStudent()
        * and It actually does not violate the LSP
        * Why? because the core of LSP is that what promises are made by the Parent
        * class must be fulfilled by the child class and here we are able to access
        * all those promised methods from parent class student. Parent class student guaranteed
        * studyEnglish(), studyPhysics(), studyChemistry(), studyPhysicalEducation() methods
        * and child class student = MedStudent() actually fulfilled that promise so there is no such
        * violation of LSP. Instead this is the correct representation of LSP.
        * */
        NonMedStudent nonMedStudent = new NonMedStudent();
        nonMedStudent.studyMaths();

        Student student2 = nonMedStudent;
        student2.studyChemistry();

        /*
        * See here when we are giving back the nonMedStudent to Student (parent class)
        * we are able to access the promised functionalities by Parent Class Student
        * and this is LSP.
        * */
    }
}
