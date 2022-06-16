public class ArraysWithWhileLoop extends WhileAndWhileDo {
    static String [] birds = {"Crane","Dove", "Eagle","Flamingo","Goldfinch","Goose",};
    static int [] integer ={4,11,12,5,10,26,};
    static char [] characters = {'b','y','e'};
    public void printStringArray() {
        //write implementation to print elements of array using while loop
        int i = 0;
        while (i<birds.length) {
            System.out.println(birds[i]);
            i++;
        }
    }
    @Override
    public void printIntegerArray() {
        int i =0;
        while (i<integer.length) {
            System.out.println(integer[i]);
            i++;
        }
    }
    @Override
    public void printCharArray () {
        int i =0;
        while (i<characters.length) {
            System.out.println(characters[i]);
            i++;
        }
    }
    @Override
    public void searchStringArray(String bird){
        int i = 0;
        while (i<=0){
            if (birds[i].equals(bird)){
                System.out.println("Here I am! "+bird+". You found me!");
            }
            else {
                System.out.println("you entered wrong bird's name"+bird);
            }
            i++;
        }
    }
    @Override
    public void searchIntegerArray(String number) {
        int i= 0;
                    while (i<=0) {
                        if (integer[i] == Integer.parseInt(number)){
                            System.out.println("Here I am! "+number+". You found me!");
                        }
                       else {
                System.out.println("You entered wrong number!"+number);
            }
            i++;
        }
    }
    @Override
    public void searchCharArray (String letter){
        int i = 0;
        while(i <= 0){
            if (characters[i]==letter.charAt(i)){
                System.out.println("Here I am! "+letter+". You found me!");
        }
        else {
                System.out.println("You entered wrong letter!"+letter);
            }
            i++;
        }
        }

    /*Write implementation for other 5 methods which you declared
      in abstract class here as well using "WHILE LOOP"
      *** for search methods: if word is not found print message "you entered wrong input"
          and if word is found print message "Here I am you found me"  ****
     */
    public void printVowels (String vowelArray){
        //try {
            int i = 0;
            while (i == vowelArray.charAt(i)) {
                {
                    if (vowelArray.equals("a") || vowelArray.equals("e") || vowelArray.equals("i") || vowelArray.equals("o") || vowelArray.equals("u")
                            || vowelArray.equals("A") || vowelArray.equals("E") || vowelArray.equals("I") || vowelArray.equals("O") || vowelArray.equals("U"))
                        System.out.println("You have entered: " + vowelArray + ". It's a vowel!");

                    else {
                        System.out.println("You have entered: " + vowelArray + ". It's a consonant!");
                    }
                    i++;
                }
            }
        }
       // catch (StringIndexOutOfBoundsException e){
         //System.out.println("from Try and Catch");
         //e.getStackTrace();
        //}
   // }  //write code here to print vowel array using While loop

    public static void main (String[]args){
        ArraysWithWhileLoop arrays = new ArraysWithWhileLoop();
        arrays.printStringArray();
        System.out.println();
        arrays.printIntegerArray();
        System.out.println();
        arrays.printCharArray();
        System.out.println();
        arrays.searchStringArray("Crane");
        arrays.searchIntegerArray("4");
        arrays.searchCharArray("b");
        arrays.printVowels("m");

        //Declare array having vowel elements
        //call method printVowels(String vowelArray)
        //call all other methods here
    }

}