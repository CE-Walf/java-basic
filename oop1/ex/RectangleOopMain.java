/*
문제와 풀이 1-1.
절차 지향 직사각형 프로그램을 객체 지향으로 변경하기
 */
package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        int perimeter = rectangle.calculatePerimeter();
        boolean square = rectangle.isSquare();

        System.out.println("넓이 : " + area);
        System.out.println("둘레 길이 : " + perimeter);
        System.out.println("정사각형 여부 : " + square);
    }
}
