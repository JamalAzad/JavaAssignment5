public class Loops {
    /* The purpose of this class is to
    practice for loops.
     */
    public void printStringArray(){
        //Write code to move through array and print all elements of array using for loop
        String [] subjects= {"Math","Computer Science","History","Geography"};
        int index = 0;
        while (index < subjects.length) {
            System.out.println(subjects[index]);
            index++;
        }
    }
    public void printIntegerArray(){
        //Write code to move through array and print all elements of array using for loop
        int [] numbers= {3,7,9,4,2};
        int index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }
    }
    public void printCharArray(){
        //Write code to move through array and print all elements of array using for loop
        char [] alphabets= {'a','c','e'};
        int index = 0;
        while (index < alphabets.length) {
            System.out.println(alphabets[index]);
            index++;
        }
    }
    public void printStringArray2(){
        //Write code to move through array and print all elements of array using foreach loop
        String [] subjects= {"Math","Computer Science","History","Geography"};
        int index = 0;
        while (index < subjects.length) {
            System.out.println(subjects[index]);
            index++;
        }
    }
    public void printIntegerArray2(){
        //Write code to move through array and print all elements of array using foreach loop
        int [] numbers= {3,7,9,4,2};
        int index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }
    }
    public void printCharArray2(){
        //Write code to move through array and print all elements of array using foreach loop
        char [] alphabets= {'A','C','E'};
        int index = 0;
        while (index < alphabets.length) {
            System.out.println(alphabets[index]);
            index++;
        }
    }
    public static void main(String [] args){
        System.out.println("Printing Arrays using for loop"); // write similar message for all methods calling them
        System.out.println("______________________________");
        Loops loops=new Loops();
        System.out.println("Printing from printStringArray() method: ");
        loops.printStringArray();
        System.out.println();
        System.out.println("Printing from printIntegerArray() method: ");
        loops.printIntegerArray();
        System.out.println();
        System.out.println("Printing from printCharArray() method: ");
        loops.printCharArray();
        System.out.println();
        System.out.println("Printing from printStringArray2() method: ");
        loops.printStringArray2();
        System.out.println();
        System.out.println("Printing from printIntegerArray2() method: ");
        loops.printIntegerArray2();
        System.out.println();
        System.out.println("Printing from printStringChar2() method: ");
        loops.printCharArray2();
        // call all above methods here one by one
    }
}