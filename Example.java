package preparation;

public class Example {

    public static int[] givenString(String s) {
        int count1 = 0;  
        int count2 = 0;  
        int count3=0;
        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                count1++;  
            } else if (c >= '0' && c <= '9') {
                count2++;  
            }
            else {
            	count3++;
            }
        }

       
        return new int[]{count1, count2,count3};
    }

    public static void main(String[] args) {
        String s = "erjbvfjj4553@#";  
        int[] result = givenString(s);
        
        System.out.println("Given letters: " + result[0]);
        System.out.println("Given digits: " + result[1]);
        System.out.println("Given digits: " + result[2]);
    }
}
