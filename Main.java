import java.util.Stack;

public  class Main{


    public static void main(String[] args){

        Stack<String> stack = new Stack<String>();

        stack.push("MineCraft");
        stack.push("skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");


        String myFavGame = stack.peek();
        System.out.println(myFavGame);

        // System.out.println(stack.empty());
        System.out.println(stack.search("DOOM"));


    }
}
