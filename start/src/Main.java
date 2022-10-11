public class Main {
    public static void main(String[] args) { System.out.println("Hello world!");

    String ortaMetin ="İlginizi Çekebilir" ;
            String altMetin = "Vade Süresi" ;

            System.out.println(ortaMetin);
            //integer
            int vade = 10000 ;
            double dolarDun = 19.40 ;
            double dolarBugun = 19.40 ;
            System.out.println(vade) ;

            boolean dolarDustuMu = false ;
            String okYonu = "" ;
            if (dolarBugun<dolarDun) {
                okYonu="down.svg" ;
                System.out.println(okYonu);
    } else if (dolarBugun>dolarDun) {
                okYonu ="up.svg" ;
                System.out.println(okYonu);
            }
            else {
                okYonu ="equal.svg" ;
                System.out.println(okYonu);

            }
String[] krediler = {"Emir","Nida'yı","Çok","Seviyor","Onun için","Uykusundan","Gönül","Rahatlığıyla","vazgeçebilir","Lütfen","Bunu","Unutmasın"} ;
                for (int i = 0; i <krediler.length ; i++) {
            System.out.println(krediler[i]);
        }


    }




}

