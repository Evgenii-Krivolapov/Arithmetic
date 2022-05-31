public class Arithmetic {
    public int result1;
    public int result2;
    public int result3;
    public int result4;




    public void plus (int value1, int value2) {
        result1 = value1 + value2;
    }
    public void multiplication (int value3, int value4) {
        result2 = value3 * value4;
    }
    public void max (int value5, int value6) {
        result3 = Math.max(value5,value6);
        print();
    }
    public void min (int value7, int value8){
        result4 = Math.min(value7,value8);
    }
    public void print () {
        System.out.println("Полученная сумма чисел " + result1);
        System.out.println("Полученная произведения чисел " + result2);
        System.out.println("Полученно максимальное значение из двух чисел " + result3);
        System.out.println("Полученно минимальное значение из двух чисел " + result4);

    }
}