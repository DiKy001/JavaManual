public class Program {
    public static void main(String[] args) {
        try{
            int x = 6/0;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
