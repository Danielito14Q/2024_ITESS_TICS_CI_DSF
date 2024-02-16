/*
 * tydyjhdrhytg
 */
package ci.unidad1.aproximation;

/**
 *
 * @author daniel
 */
public class FunctionAproximationTest {
    public static void main(String[] args) {
        FunctionAproximation fa = new FunctionAproximation(1, 3, 10);
        
        fa.compute();
        System.out.println("area:" + fa.getArea());
    }
    
}
