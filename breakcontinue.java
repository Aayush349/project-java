public class breakcontinue{
    public static void main(String[] args) {
        for (int x =0;x<20;x++)
        {
            if( x==5)
            continue;
            else{

             System.out.println(x);
             if (x==15) break;
            }

        }

    }
}