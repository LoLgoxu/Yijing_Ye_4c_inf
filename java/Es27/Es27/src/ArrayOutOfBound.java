public class ArrayOutOfBound {
    static void func(){
        try{
            int[] numeri = new int[5];
            for (int i = 0; i < 6; i++){
                int[] numero = new int[i];
                numero[i] = 2;
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("StackTrace: " + e.getMessage());
        }finally{
            System.out.println("eccezione gestita correttamente");
            System.exit(0);
        }
    }
}
