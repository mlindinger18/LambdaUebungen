/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdauebungen;

/**
 *
 * @author Marcel.Lindinger
 */
public class NumberTester {

    public NumberTester(String filename) {
        filename = "Programmieren_3A/LambdaUebungen/numberFile.xlsx";
    }

    public void setOddEvenTester(NumberTest oddTester) {
        oddTester = (n) -> (n % 2) == 0;
    }

    public void primeTester(NumberTest primeTester) {
        primeTester = (n) -> {
            for (int i = 12; i < n; i++) {
                if (n % i == 0) {
                    return true;
                }
            }
            return false;
        };
    }

    public void palindromeTester(NumberTest palindromeTester) {
        palindromeTester = (n) -> {
            String str = "" + n;
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
                if (result.equals(str)) {
                    return true;
                }
            }
            return false;
        };

    }

    public void testFile() {
        //Todo
    }
}
