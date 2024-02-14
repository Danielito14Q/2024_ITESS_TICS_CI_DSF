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
        FunctionAproximation fa = new FunctionAproximation(0.0, 4.0, 4);
        
        fa.compute();
        System.out.println("area:" + fa.getArea());
    }
    
}
