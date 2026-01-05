package study20260102;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		
		
		if( 10 > 5) {
			System.out.println(" 5보다 크다 ");
			
		}else {
			System.out.println(" 5보다 작다 ");
		}

		
		
		// 바이킹 탑승 가능 : 145Cm 이상
		
		int tall = 160;
		if (tall >= 145) {
			System.out.println(" 탑승 가능 ");  //코드를 만들때 if를 긴문장 else를 짧은문장으로 유도
		}else {
			System.out.println(" 탑승 불가능 ");
		}
		
		
		 int age = 33;
		 if( (age/10)==3 )                 //(age >= 30 && age < 40) 
			 System.out.println(" 30대 이다 ");
		 else 
			 System.out.println(" 30대가 아니다 "); 
		
		 // 과제 
		 // 주차장에 요금이 기본요금은 1000원이다.
		 // 기본시간은 30분이다
		 // 10분 당 100원식 추가 예) 39분은 1000원 40분은 1100원
		 // 분을 입력시 요금이 얼마인지 출력하세요
		 // 단 4시간 이상 주차시 기본요금은 2500원이다.
		 // 예) 3시간 50분 (230분) -> 3000원
		 //   4시간 12분 (252분) -> 2600원     
		 
		 int cost = 1000; // 기본요금 (30분)
		 int inc = 100, incTime = 10; //10분당 100원
		 int time = 30; // 기본시간 30분
		 
		 // 주차 시간 총 몇분 입력
		 Scanner scan = new Scanner(System.in); // 시스템(컴퓨터)으로 부터 입력된키 값 받기
		 
		 System.out.print(" 총 몇분 주차 : ");
		 int pTime = scan.nextInt(); // 키보드 입력 값 받아서 정수로 변환하여 변수에 저장
		 
		 pTime /= 10;
		 if(pTime >= 24) {// 4시간 이상 주차했다면
			 cost=2500; // 4시간 이상에 대한 기본요금 변경
		 }
		 
		 
		 // 주차 요금 
		 
		
	}

}


/* 제어문
   
 조건문 - if  ,  switch
 ==switch문은 선택하는것      -큰틀
 ==if문은 참, 거짓 (~이라면)   -작은틀

 if(조건식) {
    조건식이 참일경우 실행할 코드;
 }
2
  if(조건식) {
     조건식이 참일 경우 실행할 코드;
     }else{
     조건식이 거짓일 경우 실행 할 코드;
     }
     
3.
  if(조건식) {
      조건식1이 참인 경우에 실행
       }else{
      조건식1이 거짓인 경우에 실행
       if(조건식2가 참인경우에 실행
       }
    }
    
       
4.
  if( 조건식1) {
     조건식이 1이 참인경우 실행
     }else if (조건식2) {
        조건식2가 참인경우 실행  
     }

**조건식은 비교연산 논리연산 두가지로만 만든다

*/
