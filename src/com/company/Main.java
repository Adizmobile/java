package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Hướng Dẫn Sử Dụng Mệnh Đề If
        // Bài Toán Nhập Vào 1 Số Bất Kì . Nếu Chia hết cho 2. Xuất Ra thông báo "Số này chia hết cho 2".

        System.out.println("--> Mệnh Đề If: Xin Mời Nhập Vào 1 Số Bất Kì: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n % 2 == 0){
            System.out.println("Số này chia hết cho 2");
        }

        // Hướng Dẫn Sử Dụng Mệnh Đề If Else
        /* Bài Toán Nhập Vào 1 Số Bất Kì . Nếu Chia hết cho 2. Xuất Ra thông báo "Số này chia hết cho 2".
           Ngược lại nếu Không chia hết cho 2 . Xuất ra thông báo: Số này không chia hết cho 2*/

        System.out.println("--> Mệnh Đề If Else: Xin Mời Nhập Vào 1 Số Bất Kì: ");
        Scanner scanner1 = new Scanner(System.in);
        int m = scanner.nextInt();
        if(m % 2 == 0){
            System.out.println("Số này chia hết cho 2");
        }else {
            System.out.println("Số này không chia hết cho 2");
        }

        // Hướng Dẫn Sử Dụng Cấu Trúc 3 Ngôi
        // Giải bài toán như mệnh đề if else

        System.out.println("--> Cấu Trúc 3 Ngôi: Xin Mời Nhập Vào 1 Số Bất Kì: ");
        Scanner scanner2 = new Scanner(System.in);
        int z = scanner.nextInt();
        String w = (z % 2 == 0) ? ("Số này chia hết cho 2") : ("Số này không chia hết cho 2");
        System.out.println(w);
    }
}
