
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

public class Algo {

Queue<int[]> q = new LinkedList<int[]>();
TreeMap<Double, List<int[]>> tre;
double sweepline;

public void run_algo() {
       while(!q.isEmpty()) {
       	
       	
           
   }
}

List<int[]> RandomList(int sz)
{
// function to generate random numbers for x1,y1,x2,y2.
List<int[]> randList= new ArrayList<int[]>();

for(int i=0;i<sz;i++)
{
int x1= (int)((Math.random() * 45) + 5) ;
int y1= (int)((Math.random() * 45) + 5) ;
int x2= x1+(int)((Math.random() * 5) + 1) ;
int y2= y1+(int)((Math.random() * 5) + 1) ;
int[]f= {x1,y1,x2,y2};
randList.add(f);

}
return randList;
}

List<int[]> insertionSort(List<int[]> p){
// list of points of x1,y1,x2,y2 is sorted by x1
 for(int i = 1; i < p.size(); i++){
   int valuex1 = p.get(i)[0];
   int valuey1 = p.get(i)[1];
   int valuex2 = p.get(i)[2];
   int valuey2 = p.get(i)[3];
   int j = i - 1;
   while(j >= 0 && p.get(j)[0] > valuex1){
   	p.get(j+1)[0] = p.get(j)[0];
   	p.get(j+1)[1] = p.get(j)[1];
   	p.get(j+1)[2] = p.get(j)[2];
   	p.get(j+1)[3] = p.get(j)[3];
     j = j - 1;
   }
   p.get(j+1)[0] = valuex1;
   p.get(j+1)[1] = valuey1;
   p.get(j+1)[2] = valuex2;
   p.get(j+1)[3] = valuey2;
 }
 
 return p;
}


public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<int[]> b= new ArrayList<int[]>();
Algo a = new Algo();
b=(ArrayList<int[]>) a.RandomList(5);



}

}