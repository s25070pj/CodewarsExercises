package kyu7;

public class GrowthOfAPopulation {
// https://www.codewars.com/kata/563b662a59afc2b5120000c6/train/java

    public static void main(String[] args) {
        System.out.println(nbYear(1500,5,100,5000));
    }
    public static int nbYear(int p0, double percent, int aug, int p) {
        //  p0 poczatkowa liczba ludnosci
        //  percent - procent ludnsci ktory przybywa kazdego roku
        //  aug - losowa liczba typow ktora moze przyjsc kazdego roku
        //  p - liczba ludnosci na koniec
        // pytanie ile lat musi minąc  aby osoiagnac liczbe z p, funkcja zwrocic ilosc lat

        percent = percent / 100;
        int years = 0;
        while (p0 < p) {
            p0 = (int) (p0 + (p0 * percent) + aug);
            years++;
        }

        return years;
    }
}

