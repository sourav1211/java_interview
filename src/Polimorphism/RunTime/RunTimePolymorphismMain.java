package Polimorphism.RunTime;

public class RunTimePolymorphismMain {

    public static void main(String[] args) {
        CrackCodeTeam projectManager= new ProjectManager();
        CrackCodeTeam programmer= new Programmer();
        CrackCodeTeam assistantProgrammer= new AssistantProgrammer();
        CrackCodeTeam qualityAssurance= new QualityAssurance();
        projectManager.coderName();
        programmer.coderName();
        assistantProgrammer.coderName();
        qualityAssurance.coderName();
    }
}
