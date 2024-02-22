public class NumericalTypesDemo{
    public static void main(String[] args){
        byte smol = 80;
        int big = smol;
        big = 200;
        smol = (byte) big;
        System.out.println("big is:" + big); 
        
        double decimalnum = 80.0;
        smol = (byte) decimalnum;
        System.out.println("smol is:" + smol); 
    }
}