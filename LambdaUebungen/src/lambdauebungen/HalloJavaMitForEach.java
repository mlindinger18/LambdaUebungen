/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdauebungen;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcel.Lindinger
 */
public class HalloJavaMitForEach {

    List<String> strList = new ArrayList();

    public void ohneLambda() {
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(i);

        }

    }

    public void mitLambda() {
        strList.forEach((String s) -> System.out.println(s));

    }

    public void methodenReferenz() {
        strList.forEach(System.out::print);
    }
}
