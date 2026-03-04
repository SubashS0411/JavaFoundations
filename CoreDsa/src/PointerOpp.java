import java.util.Arrays;

public class PointerOpp {
//    The Core Concept
//    When both pointers start at the same end and move in the same direction, they take on distinct jobs:
//
//    The Fast Pointer (The Scout): Its job is to look at every single element in the array, one by one, to evaluate if it is "useful" based on your rules.
//
//    The Slow Pointer (The Writer/Anchor): Its job is to mark the boundary of the "good" data. It only moves forward when the Fast pointer finds something worth keeping.
   public static void main(String[] args) {
       int[] arr={1,1,2,3,3,3};
       int k=RemoveDuplicates(arr);
       System.out.println("Number of Unique elements: "+k);
       int [] unique=Arrays.copyOfRange(arr,0,k);
       System.out.println("Unique Elements"+ Arrays.toString(unique));

    }
    public static int RemoveDuplicates(int[] arr){
       if(arr.length==0){
           return 0;
       }
       int slow=1;
        for (int fast = 1; fast < arr.length ; fast++) {
            if (arr[fast] != arr[fast - 1]) {
                arr[slow] = arr[fast];

                slow++;
            }
        }

        return slow;
    }
}
