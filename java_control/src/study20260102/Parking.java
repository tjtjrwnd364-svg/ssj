// 과제 
		 // 주차장에 요금이 기본요금은 1000원이다.
		 // 기본시간은 30분이다
		 // 10분 당 100원식 추가 예) 39분은 1000원 40분은 1100원
		 // 분을 입력시 요금이 얼마인지 출력하세요
		 // 단 4시간 이상 주차시 기본요금은 2500원이다.
		 // 예) 3시간 50분 (230분) -> 3000원
		 //   4시간 12분 (252분) -> 2600원     
package study20260102;

 import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int minute;
        int money = 0;

        System.out.print("주차 시간을 입력하세요: ");
        minute = sc.nextInt();

        if (minute >= 240) {
            money = 2500;

            int overTime = minute - 240;
            int addMoney = (overTime / 10) * 100;

            money = money + addMoney;
        } else {
            money = 1000;

            if (minute > 30) {
                int overTime = minute - 30;
                int addMoney = (overTime / 10) * 100;

                money = money + addMoney;
            
            }
        }
  

        System.out.println("요금: " + money + "원");
    }
}