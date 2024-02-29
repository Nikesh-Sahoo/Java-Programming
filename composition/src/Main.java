
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nikesh","1221#7#9");
        Sessions Second_year = new Sessions ("2026",student1);
        Floor ThirdFloor = new Floor(3,1000);
        Branch CSE = new Branch("CSE",new Sessions("2nd yr.",new Student("Niku","#122157#9")));
        Library Central = new Library("CentralLibrary","2013",10000,ThirdFloor);
        College LPU = new College("Lovely Professional University",Central,CSE);
        University LP_U = new University("LPU",LPU);
        LP_U.getCollege().OpeningDate();
        LP_U.getCollege().getLibrary().SearchaBook();
        LP_U.getCollege().getLibrary().getFloor().Cleanthefloor();
    }
}