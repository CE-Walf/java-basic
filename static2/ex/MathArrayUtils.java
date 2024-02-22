package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){
        //private로, 인스턴스 생성을 막는다.
    }

    // 더하기
    public static int sum(int[] values) {

        int arraySum = 0;
        for (int value : values) {
            arraySum += value;
        }
        return arraySum;
    }

    // 평균 구하기
    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    // 최소값 구하기
    public static int min(int[] values) {
        int arrayMin = values[0];

        for (int value : values){
            if (value < arrayMin){
                arrayMin = value;
            }
        }
        return arrayMin;
    }

    // 최대값 구하기
    public static int max(int[] values) {
        int arrayMax = values[0];

        for (int value : values){
            if (value > arrayMax){
                arrayMax = value;
            }
        }
        return arrayMax;
    }

}
