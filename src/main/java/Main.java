import Console.Test;
import Library.*;



class Main {
    static void main(String[] args) {

        boolean program = true;
        while(program == true){
            System.out.println("Hello World");
            String eingabe = Library.Read();
            switch (eingabe){
                case "/test":
                    Test.start();
                    eingabe = "";
                    break;
                case "/exit":
                    program = false;
                    eingabe = "";
                    break;
                default:
                    eingabe = "";
                    break;
            }
        }
    }
}
