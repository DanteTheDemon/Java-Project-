public class Main {
    public static void main(String[] args) {
        System.out.println("En Yaşlı Kim ?");
        int selimYas = 1000 ;
        int emirYas = 1500 ;
        int yucelYas = 1 ;
        String x = "Emir'in Yaşı " ;
        int enBuyukYas = yucelYas ;
        if (yucelYas<selimYas){
            enBuyukYas = selimYas ;
        }
        if (selimYas<emirYas) {
             enBuyukYas= emirYas ;
        }
System.out.println("En Yaşlı Kişi :" +x  +enBuyukYas);
        }
    }
