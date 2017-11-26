package Activities2.Exercise5_buildingArea;

//5. (Poziom 2) Zaprojektuj hierarchię klas: klasę bazową Budynek z polami wysokość, szerokość i długość oraz metodą powierzchnia,
// zwracającą iloczyn szerokości i długości; DomPiętrowy (rozszerza klasę budynek), przeciążający metodę powierzchnia
// (powierznię trzeba pomnożyć x 2 - bo mamy parter i piętro) oraz
// Wieżowiec (rozszerza klasę Budynek) z polem liczbaPięter, przeciążający metodę powierzchnia (powierzchnię trzeba pomnożyć przez (liczbę pięter + parter).


import Activities2.Exercise5_buildingArea.model.DomPietrowy;
import Activities2.Exercise5_buildingArea.model.Skycrapper;

public class Main {
    public static void main(String[] args) {


        Skycrapper skycrapper = new Skycrapper(150,50,70,28);
        DomPietrowy house = new DomPietrowy(6,12,12,2);

        double skycrapperArea = skycrapper.area() * skycrapper.getLiczbaPieter();
        double houseArea = house.area() * house.getLiczbaPieter();

        System.out.println("Dom pietrowy o " + (int)house.getLiczbaPieter() + " kondygnacjach ma powierzchnie: " + houseArea + " m2.");
        System.out.println("Wiezowiec o " + (int)skycrapper.getLiczbaPieter() + " kondygnacjach ma powierzchnie: " + skycrapperArea + " m2.");

    }

}
