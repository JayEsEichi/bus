package sparta.project.bus.package1;

public class Course {
    String title = "";
    String tutor = "";
    int days = 0;


    public static void main(String[] args) {
    }

    public String getTitle(String title){
        return title;
    }

    public int getDays(int days){
        return days;
    }

    public String getTutor(String tutor){
        return tutor;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setDays(int days){
        this.days = days;
    }

    public void setTutor(String tutor){
        this.tutor = tutor;
    }


}
