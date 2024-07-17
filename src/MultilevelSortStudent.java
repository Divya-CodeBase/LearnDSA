import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class MultilevelSortStudent {

    int rollNo;
    String name, address;

    public MultilevelSortStudent(int rollNo,String name, String address){
        this.rollNo= rollNo;
        this.name= name;
        this.address= address;
    }
    public Integer getRollNo(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String toString(){
        return this.rollNo+" "+this.name+" "+this.address;
    }

    public static void main(String[] args){
        ArrayList<MultilevelSortStudent> arr= new ArrayList<MultilevelSortStudent>();
        arr.add(new MultilevelSortStudent(3,"Tolly","KK nagar"));
        arr.add(new MultilevelSortStudent(7,"molly","ra nagar"));
        arr.add(new MultilevelSortStudent(1,"cally","dfse nagar"));

        Iterator<MultilevelSortStudent> it = arr.iterator();
        System.out.println("Before");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("After");
        Collections.sort(arr,new StudentCompare());
        for(MultilevelSortStudent t: arr){
            System.out.println(t);
        }

    }
}
 class StudentCompare implements Comparator<MultilevelSortStudent> {

     public int compare(MultilevelSortStudent o1, MultilevelSortStudent o2) {
        int rollNoCompare = o1.getRollNo().compareTo(o2.getRollNo());
         int nameCompare = o1.getName().compareTo(o2.getName());
         return (rollNoCompare==0)?nameCompare:rollNoCompare;
     }
 }