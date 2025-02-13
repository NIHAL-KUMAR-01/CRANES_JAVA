package Lab_Program_4;

    public class ArraysMore {
        // public void second_largest(int a[]){
        //     int largest= a[0];
            
        //     for(int ele : a){
        //         if (ele>largest) {
        //             largest=ele;
        //             int temp=largest;
                    
        //         }

        //     }
        // }
    public boolean check_sorted(int a[]){
        boolean flag = false;
        for (int i = 0; i < a.length-1; i++) {
                if(a[i]<a[i+1]){
                    flag= true;
                }
                else{
                    flag= false;
                    break;
                }
        }
        return flag;
    }

    public void duplicate_remove(int a[]){
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]==a[i+1]) {
                  
            }
            
        }
    }
    public static void main(String[] args) {
        
    }
    
}
