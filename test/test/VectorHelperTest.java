package test;

import code.VectorHelper;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <b>test.VectorHelperTest est la classe pour faire des testes unitaires pour les methodes de VectorHelper</b>
 *
 * @author Bachir&Abderrahmane
 * @version 1.1
 * @see VectorHelper
 */

public class VectorHelperTest {

    @Test
    public void triVect() throws Exception {
        int[] vect = VectorHelper.triVect(new int[]{1, 6, 9, 3, 8, 2, 0});
        assertArrayEquals(new int[]{0, 1, 2, 3, 6, 8, 9}, vect);
    }

    @Test
    public void sommeVects() throws Exception {
        int[] vect = VectorHelper.sommeVects(new int[]{1, 6, 9, 3, 8, 2, 0}, new int[]{5, -6, 8, 0, 52, 1, 7});
        assertArrayEquals(new int[]{6, 0, 17, 3, 60, 3, 7}, vect);
    }

    @Test
    public void inverseVect() throws Exception {
        int[] vect = VectorHelper.inverseVect(new int[]{1, 6, 9, 3, 8, 2, 0});
        assertArrayEquals(new int[]{0, 2, 8, 3, 9, 6, 1}, vect);
    }

    @Test
    public void minEtMaxVect() throws Exception {
        int[] vect = VectorHelper.minEtMaxVect(new int[]{1, 6, 9, 3, 8, 2, 0});
        assertArrayEquals(new int[]{0, 9}, vect);
    }

    @Test
    public void appliqueFormule() throws Exception {
        int[] vect = VectorHelper.appliqueFormule(new int[]{1, 5, 3, 4}, '^', 3);
        assertArrayEquals(new int[]{1, 125, 27, 64}, vect);
    }

}