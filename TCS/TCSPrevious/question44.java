package TCS.TCSPrevious;


import java.util.*;
class Student{
    String name;
    int mark;
    Student(String name, int mark){
        this.name=name;
        this.mark=mark;
    }
}

public class Question44 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int k = sc.nextInt();
        int n=sc.nextInt();

        Student [] arr=new Student[n];

        for(int i=0;i<n;i++){
            int mark=sc.nextInt(); 
            String name=sc.next();
            arr[i]=new Student(name, mark);
        }

        // slection sort ;
        for(int i=0;i<n;i++){
            int sm=i;
            for(int j=i+1;j<n;j++){
                // case 1
                if(arr[j].mark>arr[sm].mark){
                    sm=j;
                }

                //case 2
                else if(arr[j].mark==arr[i].mark){
                    if(arr[j].name.compareTo(arr[i].name)<0){
                        sm=j;
                    }
                }
            }
            
            Student temp=arr[i];
            arr[i]=arr[sm];
            arr[sm]=temp;
        }


        // find k 
        for(int i=0;i<k;i++){
            System.out.println(arr[i].name+": "+arr[i].mark);
        }



    }
}
