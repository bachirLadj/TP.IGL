package code;

/**
 * <b>VectorHelper est la classe pour faire multiples operations concernant les vecteurs</b>
 * <p>
 * Cette classe assure les operations suivantes
 * <ul>
 * <li>Trier les elements d'un vecteur</li>
 * <li>Sommer deux vecteurs. Elle doit generer une exception si les deux vecteurs ont des
 * tailles differentes</li>
 * <li>Inverser les elements d'un vecteur</li>
 * <li>Obtenir simultanement le minimum et le maximum d'un vecteur</li>
 * <li>Appliquer une formule sous forme de fonction a tous les elements d'un vecteur. Par
 * exemple, multiplier tous les elements par 2. Cette formule doit etre sous la forme d'une
 * fonction ou d'une methode.</li>
 * </ul>
 * </p>
 *
 * @author Bachir&Abderrahmane
 * @version 2.1
 */


public class VectorHelper {

    /**
     * triVect
     * <p>
     * Cette methode sert a trier les elements d'un vecteur donnee avec l'ordre croissant
     * </p>
     * @param vect
     * c'est le vecteur qu'on veut triée
     * @return un vecteur triée à partir du vect
     * */

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
     * Cette methode sert a sommer les elements des deux vecteurs en un seul vecteur
     * la methode declanche une exception lorsque les vecteurs sont de tailles differentes
     * </p>
     * @param vect1
     * c'est le 1er vecteur à sommer
     * @param vect2
     * c'est le 2er vecteur à sommer
     * @return le vecteur de la somme
     *
     * @throws TailleDifferente si la taille des deux vecteurs est differente
     *
     * */

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
     * Cette methode sert a inverser les elements d'un vecteur
     * </p>
     * @param vect
     * c'est le 1er vecteur à inverser
     * @return le vecteur inverse de vect
     * */

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
     * Cette methode sert a donner le minimum et le maximum dans un vecteur
     * </p>
     * @param vect
     * @return minEtMax tableau de deux elements {min,max}
     *
     *   */

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
     * Cette methode sert a appliquer plusieurs formules donnees sur un vecteur
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
     * c'est le vecteur iniale
     * @param formule
     * la formule a apliquer
     * @param num
     * @return le vecteur apres l'application de la formule
     */

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