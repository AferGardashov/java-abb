package exercises;

public class HomeWork3 {


    //1. 0-dan verilmish edede qeder butun 2-ye bolune bilen ededleri chap et.
    public void dividedByTwo(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }


    //2. 0-dan verilmish edede qeder sade ededleri chap et.
    public void primeNumbers(int n) {

    }

    //3. Verilmish ededin butun reqemleri cemini tap.
    public void sumOfDigits(int n) {

    }


    //4. 3-cu deyishenden istifade etmeden 2 deyishenin yerini deyishmek.
    public void swapIntegers(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }


    //5. Ededin reqemlerinin sayini tapin.
    public int numberOfDigits(int n) {
        int number = 0;
        while (n > 0) {
            number += 1;
            n /= 10;
        }
        return number;
    }


    //6. "İstifadəçidən ay nömrəsini daxil etməyi təklif edən proqram yazın.
    // Sonra daxil edilmiş ay nömrəsinə əsasən həmin ayın adını çap edən keçid-case strukturundan istifadə edərək proqramı tamamlayın.
    // Məsələn, istifadəçi 1-i daxil edərsə, proqram bunu etməlidir. 'Yanvar' yaz, istifadəçi 2 daxil edərsə, 'Fevral' yazmalıdır; və s."
    public void printMonths(int n) {

    }

    //7.  Üçbucağın tərəflərinin düzgünlüyünü yoxlayan daha sonra isə sahəsini və perimetrini hesablayan alqoritm yazın.(a+b>c =>  bütün tərəflər üçün)
    public boolean isTriangleValid(int a, int b, int c) {

        return true;
    }


    //8. Calculator hazirlayın hər bir rəqəm və əmirlər(+,-,*,/,%) scannerlə daxil edilsin
    public void calculator() {

    }

    //9. Ədədin faktorialını hesablayın.
    public int factorial(int n) {
        if (n == 1) return n;
        return n * factorial(n - 1);
    }

}
