class QuickSort { 
 
  // Set up a call to the actual QuickSort method. 
  static void qsort(char items[]) 
  { 
    qs(items, 0, items.length-1); 
  } 
 
  static void display(String title, int left, int right, char mid, char items[])
  {
     System.out.println(title + " " + left + ", " + right + ", " +mid);
     for(int ii = 0; ii < items.length; ii++)  
         System.out.print(items[ii]); 
       System.out.println(); 
  }
  
  // A recursive version of QuickSort for characters. 
  private static void qs(char items[], int left, int right)  
  {  
    int ii = left;
    int jj = right;  
    char mid = items[(left + right) / 2];  
    display("entry",left, right, mid, items);
    char tmp;
     
    do {  
      while((items[ii] < mid) && (ii < right)) ii++;  
      while((mid < items[jj]) && (jj > left)) jj--;  
      System.out.println("ii = " + ii + ",   jj = " + jj);
      
      if(ii <= jj) {  
    	System.out.println("Flipping " + items[ii] + " and " +items[jj]);
        tmp = items[ii];  
        items[ii] = items[jj];  
        items[jj] = tmp;  
        ii++; 
        jj--;  
      }  
    } while(ii <= jj);  
  
    if(left < jj) qs(items, left, jj);  
    if(ii < right) qs(items, ii, right);  
  } 
} 



class QSDemo { 
  public static void main(String args[]) { 
    char arr[] = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' }; 
 
    System.out.print("Original array: "); 
    for(int ii = 0; ii < arr.length; ii++)  
      System.out.print(arr[ii]); 
    System.out.println(); 
 
    // now, sort the array 
    QuickSort.qsort(arr); 
     
    System.out.print("Sorted array: "); 
    for(int ii = 0; ii < arr.length; ii++)  
        System.out.print(arr[ii]); 
      System.out.println(); 
  } 
}