

package LAB_Problem.Problem4;

public class Sorted {
    public static int isSorted(int arr[]){
        int flag = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]){}
            else{
                flag = 0;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println("Sorted (true / false): " + (1==isSorted(new int[]{1,2,3,4,5})));
    }
}