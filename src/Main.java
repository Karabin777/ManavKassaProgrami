/**Manav Kasa Programı
 Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

 Meyveler ve KG Fiyatları
 Armut : 2,14 TL
 Elma : 3,67 TL
 Domates : 1,11 TL
 Muz: 0,95 TL
 Patlıcan : 5,00 TL


 Örnek Çıktı;

 Armut Kaç Kilo ? :0
 Elma Kaç Kilo ? :1
 Domates Kaç Kilo ? :1
 Muz Kaç Kilo ? :2
 Patlıcan Kaç Kilo ? :3
 Toplam Tutar : 21.68 TL*/
public class Main {
    public static void main(String[] args) {

      double  armut  = 2.4;
      double   elma= 3.67 ;
      double  domates = 1.11 ;
      double  muz = 0.95;
     double   patlican = 5.00;

     double total =0;

            double armurKilo =0, elmaKilo=1, domatesKilo=1, muzKilo=2, patlicanKilo =3 ;

            total= ( (armurKilo*armut) + (elmaKilo*elma) + (domates*domatesKilo) + (muz*muzKilo) + (patlican*patlicanKilo)) ;

        System.out.println(total);





    }
}