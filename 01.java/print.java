public class ex03 {
    public static void main(String[] args) {
        //출력문의 종류 : println print printf
        //println : 문자열을 출력하고 줄바꿈을 함. ln이 line의 약자.
        //print : 문자열을 출력하고 줄바꿈을 안함.
        //printf : c언어 스타일의 출력문. f는 Fotmat,(형식화)된 출력문.
        //println단출키 : sout 엔터
        //한줄 선택 : shift + End

        System.out.println("Java Programming~");
        System.out.println("Java Programming~");

        //print : 줄바꿈 없음.
        System.out.print("줄바꿈이 없어요~");//줄바꿈이 없어요~줄바꿈이 없어요~
        System.out.print("줄바꿈이 없어요~");

        //내용이 없는 println문은 줄바꿈만 한다.
        System.out.println();
        System.out.println("줄바꿈이 되었어요~");

        //문자열 연결 후 출력
        //+연산자 : 문자열연결, 산술연산
        System.out.println("Java"+"Cording"); //
        System.out.println("Java" + 10);
        System.out.println( 20 + "Java");
        System.out.println( 10 + 20 );
        System.out.println();

        //형식화된 출력문 : printf

        //%d : decimal (10진수)의 약자. 8 바이트 공간 사용
        //\n : 줄바꿈. 특수문자(이스케이프 문자)
        System.out.printf("%d\n", 10);

        //%o : octal (8진수) 정수
        System.out.printf("%o\n", 10);//12

        //%x : hexa 16진수 정수
        System.out.printf("%x\n", 10);//A

        //%e : 지수형 실수 (지수 ex) 10의 3승 10^3=10*10*10)
        //숫자데이터 뒤의 f : float 실수라는 뜻
        //1.234568e+07 => 뒤로 7자리 이동하면 비슷한 근사값이 나옴.(6뒤에 7이 아니라 8이 나옴)
        //컴퓨터에서 실수는 정확한 값이 아닌 근사값으로 저장한다.
        System.out.printf("%e\n",12345678f);//1.234568e+07

        //%c : 문자 단위 character, 단따옴표
        System.out.printf("%c\n",'A');

        //%s : 문자열(문자 여러개)string, 쌍따옴표
        System.out.printf("%s\n","ABC");

        // %[자릿수][타입] 5d
        System.out.printf("%5d\n",10); //자릿수가 5개라서 공백3+10

        // %[공백타입][자릿수][타입]
        System.out.printf("%05d\n",10); //공백타입을 0으로 하라 00010출력.

        // %f : float 실수, 8바이트의 공간 사용. 실수 데이터 뒤에 f를 쓰면
        System.out.printf("%f\n", 3.14f); // 출력값 3.140000

        //%[공백타입][총 자릿수].[소숫점뒤 자리수][타입]
        System.out.printf("%010.2f\n",3.14f); //.2->소수점 2자리 까지만 출력, 0000003.14출력

        //연습문제 1
        System.out.println("Cording is Good!");
        System.out.println("Java"+"Programming");
        System.out.printf("%d\n",123);
        System.out.printf("%05d\n",123);
        System.out.printf("%.2f\n",123.45);


    }
}
