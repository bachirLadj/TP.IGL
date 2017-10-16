package code;

public class VectorHelper {
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

    public static int[] sommeVects(int[] vect1, int[] vect2) throws TailleDifferente {
        if (vect1.length != vect2.length) throw new TailleDifferente();
        int[] vects = new int[vect1.length];
        for (int i = 0; i < vects.length; i++) {
            vects[i] = vect1[i] + vect2[i];
        }
        return vects;
    }

    public static int[] inverseVect(int[] vect) {
        int[] vecti = new int[vect.length];
        for (int i = 0; i < vecti.length; i++) {
            vecti[i] = vect[vect.length - 1 - i];
        }
        return vecti;
    }

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
