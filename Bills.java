public class Bills {
    public static void main(String[] args) {
        String a = args[0] ;
        String b = args[1] ;
        String c = args[2] ;
        double sum = Double.parseDouble(args[3]) ;
        double pay = sum/3 ; 
        pay = Math.ceil(pay) ;
        System.out.println("Dear " + a + ", " + b + ", and " + c + " pay " + pay + " shekels each") ;
    }    
 }
 