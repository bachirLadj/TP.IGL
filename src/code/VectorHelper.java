package code;

/**
 * <b>VectorHelper est la classe pour faire multiples opérations concernant les vecteurs</b>
 * <p>
 * Cette classe assure les opérations suivantes
 * <ul>
 * <li>Trier les éléments d’un vecteur</li>
 * <li>Sommer deux vecteurs. Elle doit générer une exception si les deux vecteurs ont des
 * tailles différentes</li>
 * <li>Inverser les éléments d’un vecteur</li>
 * <li>Obtenir simultanément le minimum et le maximum d’un vecteur</li>
 * <li>Appliquer une formule sous forme de fonction à tous les éléments d’un vecteur. Par
 * exemple, multiplier tous les éléments par 2. Cette formule doit être sous la forme d’une
 * fonction ou d’une méthode.</li>
 * </ul>
 * </p>
 *
 * @author Bachir&Abderrahmane
 * @version 1.0
 */


public class VectorHelper {

    /**
     * triVect
     * <p>
     * Cette méthode sert à trier les éléments d'un vecteur donnée avec l'ordre croissant
     * </p>
     * @param vect
     * @return vectt vecteur trié*/

    public static int[] triVect(int[] vect) {
        int pt = 1, j = 0, i, x;
        int[] vectt = vect;
        while (pt > 0) {
            pt = -1;
            for (i = 0; i < (vectt.length - j - 1); i++) {
                if (vectt[i + 1] < vectt[i]) {
                    x = vectt[i + 1];
                    vectt[i + 1] = vectt[i];
                    vectt[i] = x;
                    pt = 1;
                }
            }
            j++;
        }
        return vectt;
    }

    /**
     * sommeVects
     * <p>
     * Cette méthode sert à sommer les éléments des deux vecteurs en un seul vecteur
     * la méthode déclanche une exception lorsque les vecteurs sont de tailles différentes
     * </p>
     * @param vect1
     * @param vect2
     * @throws TailleDifferente
     * @return vects vecteur trié*/

    public static int[] sommeVects(int[] vect1, int[] vect2) throws TailleDifferente {
        if (vect1.length != vect2.length) throw new TailleDifferente();
        int[] vects = new int[vect1.length];
        for (int i = 0; i < vects.length; i++) {
            vects[i] = vect1[i] + vect2[i];
        }
        return vects;
    }

    /**
     * inverseVect
     * <p>
     * Cette méthode sert à inverser les éléments d'un vecteur
     * </p>
     * @param vect
     * @return vecti vecteur inversé*/

    public static int[] inverseVect(int[] vect) {
        int[] vecti = new int[vect.length];
        for (int i = 0; i < vecti.length; i++) {
            vecti[i] = vect[vect.length - 1 - i];
        }
        return vecti;
    }

    /**
     * minEtMaxVect
     * <p>
     * Cette méthode sert à donner le minimum et le maximum dans un vecteur
     * </p>
     * @param vect
     * @return minEtMax tableau de deux éléments {min,max}*/

    public static int[] minEtMaxVect(int vect[]) {
        int[] minEtMax = new int[2];
        minEtMax[1] = (minEtMax[0] = vect[0]);
        for (int i = 1; i < vect.length; i++) {
            if (vect[i] < minEtMax[0]) {
                minEtMax[0] = vect[i];
            }
            if (vect[i] > minEtMax[1]) {
                minEtMax[1] = vect[i];
            }
        }
        return minEtMax;
    }

    /**
     * appliqueFormule
     * <p>
     * Cette méthode sert à appliquer plusieurs formules données sur un vecteur
     * Ces formules sont:
     * <ul>
     *     <li>la somme '+'</li>
     *     <li>la soustraction '-'</li>
     *     <li>le produit '*'</li>
     *     <li>la division '/'</li>
     *     <li>la puissance '^'</li>
     * </ul>
     * </p>
     * @param vect
     * @return vectr vecteur résultat*/

    public static int[] appliqueFormule(int vect[], char formule, int num) {
        int[] vectr = vect;
        switch (formule) {
            case '+':
                for (int i = 0; i < vectr.length; i++) {
                    vectr[i] += num;
                }
                break;
            case '-':
                for (int i = 0; i < vectr.length; i++) {
                    vectr[i] -= num;
                }
                break;
            case '*':
                for (int i = 0; i < vectr.length; i++) {
                    vectr[i] *= num;
                }
                break;
            case '/':
                for (int i = 0; i < vectr.length; i++) {
                    vectr[i] /= num;
                }
                break;
            case '^':
                for (int i = 0; i < vectr.length; i++) {
                    int temp = vectr[i];
                    for (int j = 1; j < num; j++) {
                        vectr[i] *= temp;
                    }
                }
                break;
        }
        return vectr;
    }

}
