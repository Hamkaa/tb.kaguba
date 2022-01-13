package com.uas;

import java.util.Random;
import java.util.Scanner;

public class kertasGuntingBatu {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int scorePemain = 0;
    int scoreKomputer = 0;
    int awalmulai = 0;
    int kalah = 0;
    int menang = 0;
    int draw = 0;

    void showMenu() {
        System.out.println("Selamat datang di Aplikasi Kertas Gunting  Batu");
        System.out.println("Silahkan tekan tombol :");
        System.out.println("1. Kertas ");
        System.out.println("2. Gunting ");
        System.out.println("3. Batu");
        System.out.println("0. Keluar");
    }

    void mulaiBermain() {
        while (awalmulai == 0) {

            int pilihanKomputer = 1 + rd.nextInt(3);
            int pilihanPemain = sc.nextInt();

            if (pilihanPemain == pilihanKomputer) {
                System.out.println("Permainan Seri");
                draw++;
            }
            if (pilihanPemain < 0 || pilihanPemain > 3) {
                System.out.println("Maaf, silahkan ulangi lagi");
            }

            if (pilihanPemain == 1) {
                if (pilihanKomputer == 2) {
                    System.out.println("Anda memilih Kertas");
                    System.out.println("Komputer memilih Gunting");
                    System.out.println("Gunting mengalahkan Kertas");
                    kalah++;

                } else if (pilihanKomputer == 3) {
                    System.out.println("Anda memilih Kertas");
                    System.out.println("Komputer memilih Batu");
                    System.out.println("Kertas mengalahkan batu");
                    menang++;
                }
            }

            if (pilihanPemain == 2) {
                if (pilihanKomputer == 3) {
                    System.out.println("Anda memilih Gunting");
                    System.out.println("Komputer memilih Batu");
                    System.out.println("Batu mengalahkan Gunting");
                    kalah++;

                } else if (pilihanKomputer == 1) {
                    System.out.println("Anda memilih Gunting");
                    System.out.println("Komputer memilih Kertas");
                    System.out.println("Gunting mengalahkan Kertas");
                    menang++;
                }
            }

            if (pilihanPemain == 3) {
                if (pilihanKomputer == 1) {
                    System.out.println("Anda memilih Batu");
                    System.out.println("Komputer memilih Kertas");
                    System.out.println("Kertas mengalahkan Batu");
                    kalah++;

                } else if (pilihanKomputer == 2) {
                    System.out.println("Anda memilih Batu");
                    System.out.println("Komputer memilih Gunting");
                    System.out.println("Batu mengalahkan Gunting");
                    menang++;
                }
            }

            if (pilihanPemain == 0) {
                System.out.println("Anda menang " + menang + " kali");
                System.out.println("Anda kalah " + kalah + " kali");
                System.out.println("Anda seri " + draw + " kali");
            }
        }
    }
}
