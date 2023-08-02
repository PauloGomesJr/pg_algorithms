//import java.util.Stack;

class Agt {

        private String nomeAgt;
        private String emailAgt;
        private int matricula;
       
       public void setNomeAgt(String nomeAgt){
        this.nomeAgt = nomeAgt;
       }
       public void setemailAgt(String emailAgt){
        this.emailAgt = emailAgt;
       }
       public void setMatricula(int matricula){
        this.matricula = matricula;
       }


       public String  getNomeAgt(){
            return this.nomeAgt;
       }

       public String  getEmailAgt(){
            return this.emailAgt;
       }

       public int getMatricula(){
            return this.matricula;
       }
}

class StackT <T>{
         private Object[] stackt = null;
         private int size;
         private static final int DEFAULT__CAPACITY = 10;


         public void createStackt(){
            if( stackt != null){
                stackt = new Object[DEFAULT__CAPACITY];
                size = 0;
            }
         }   
         
}



public  class Main{


    public static void main(String[] args){

        StackT<Agt> Agentes = new StackT<Agt>();

        Agentes.createStackt();

    


            /*  Stack<String> stack = new Stack<String>();

                stack.push("MineCraft");
                stack.push("skyrim");
                stack.push("DOOM");
                stack.push("Borderlands");
                stack.push("FFVII");


                String myFavGame = stack.peek();
                System.out.println(myFavGame);

                // System.out.println(stack.empty());
                System.out.println(stack.search("DOOM"));
                */

    }
}
