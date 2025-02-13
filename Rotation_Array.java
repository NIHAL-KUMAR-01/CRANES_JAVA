public class Rotation_Array {




    void right_rotate(int a[],int k){
        for (int i = 0; i < k; i++) {
            int temp= a[a.length-1];
            for (int j = a.length-1; j > 0; j--) {
                a[j]=a[j-1];
                
            }
            a[0]=temp;
        }
        System.out.println("\nPrinting altered array: ");
        for(int ele : a){
            System.out.print(ele+" ");
        }
    }
    void left_rotate(int a[],int k){
        for (int i = 0; i < k; i++) {
            int temp= a[0];
            for (int j = 0; j < a.length-1; j++) {
                a[j]=a[j+1];
                
            }
            a[a.length-1]=temp;
        }
        System.out.println("\nPrinting altered array: ");
        for(int ele : a){
            System.out.print(ele+" ");
        }
    }
    public static void main(Strings[] args) {
        int marks[]={10,20,30,40,50};
        int marks2[]={10,20,30,40,50};
        Rotation_Array test= new Rotation_Array();
        test.right_rotate(marks, 2);
        test.left_rotate(marks2, 2);



    
}
    
}
