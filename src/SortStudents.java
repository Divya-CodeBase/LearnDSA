import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStudents {

    int rollNo;
    String name, address;

    public SortStudents(int rollNo,String name,String address){
        this.rollNo=rollNo;
        this.name=name;
        this.address=address;
    }

    public String toString(){
        return this.rollNo+" "+this.name+" "+this.address;
    }





    public static void main(String[] args){
        List<SortStudents> al = new ArrayList<SortStudents>();

        al.add(new SortStudents(3,"tad","Chennai"));
        al.add(new SortStudents(8,"tom","Kolkata"));
        al.add(new SortStudents(2,"ravi","Pune"));
        al.add(new SortStudents(6,"arjun","Alwarpet"));
        System.out.println(al.toString());




        for(int i=0;i<al.size();i++){
            Collections.sort(al,new SortByRollNo());
        }
        System.out.println(al.toString());
        for(int i=0;i<al.size();i++){
            Collections.sort(al,new SortByName());
        }
        System.out.println(al.toString());
    }


}
class SortByRollNo implements Comparator<SortStudents> {

    public int compare(SortStudents o1, SortStudents o2) {
        return o1.rollNo-o2.rollNo;
    }

}
    class SortByName implements Comparator<SortStudents> {

public int compare(SortStudents o1, SortStudents o2) {
        return o1.name.compareTo(o2.name);
        }

        }