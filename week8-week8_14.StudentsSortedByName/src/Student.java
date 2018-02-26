public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student student){
       if(this.name.compareToIgnoreCase(student.getName())>0){
           return 1;
       }else if(this.name.compareToIgnoreCase(student.getName())==0){
           return 0;
       }else{
           return -1;
       }
    }

}
