//Created by Miranda Weathers on 9/4/2021

public class Main {
    
	public static void main(String[] args) {
        System.out.println("Bubble Sort - with commentary!");
        System.out.println("Ascending order, starting bubble at the last index.\n");

	//feel free to change the elements in the array!
        int[] ary = { 10,9,8,7,6,5,4,3,2,1,0,-1 };

        System.out.println("We just created int[] ary which can hold " + ary.length + " elements.");
        System.out.print("int[] ary = { ");

        for(int i=0; i < ary.length; i++){ //loop to print contents of ary[]
            if(i != (ary.length - 1)) {
                System.out.print(ary[i] + ", "); //formatting for first 9 elements
            } else {
                System.out.print(ary[i] + " };\n\n"); //formatting comma for last element
            }//end if else
        }//end for

        System.out.println("Time to bubble.\n");

        for(int pass = 0; pass < ary.length; pass++){
        	
            System.out.println("\nOUTER LOOP PASS " + pass + " - - - - - - - - - - - - - - - - - - - - - - - - -\n");
            int innerCount = 0;
            
            for(int bub = ary.length - 1; bub > pass; bub--){
            	
            	System.out.println("inner loop pass " + innerCount++ + " • • • • • • • • • • • • • • • • • • • • • • • • •\n");
                System.out.println("looking at ary[" + bub + "] - current value: " + ary[bub]);
                System.out.println("compare w/ ary[" + (bub-1) +"] - current value: " + ary[bub-1]);
                System.out.println();
                
                if(ary[bub] < ary[bub-1]){
                    System.out.println(ary[bub] + " < " + ary[bub-1] + ", so we swap them.\n");
                    
                    System.out.println("1. int temp = ary[" + bub +"]    // temp value: " + ary[bub]);
                    int temp = ary[bub];
                    
                    System.out.println("2. ary[" + bub + "] = ary[" + (bub-1) + "]    // new  value: " + ary[bub-1]);
                    ary[bub] = ary[bub-1];
                    
                    System.out.println("3. ary[" + (bub-1) + "] = temp    // new  value: " + temp + "\n");
                    ary[bub-1] = temp;
                } else {
                    System.out.println(ary[bub] + " > " + ary[bub-1] + ", so we leave it.\n");
                }//end if else
           
            }//end inner loop
           
            System.out.print("Now the array is { ");
            for(int i=0; i < ary.length; i++){
                if(i != (ary.length - 1)) { //formatting for first 9 elements
                    System.out.print(ary[i] + ", ");
                } else { //formatting comma for last element
                    System.out.print(ary[i] + " }\n\n");
                }//end if else
           }//end print loop
        
        }//end outer loop

    }//end method

}//end class
