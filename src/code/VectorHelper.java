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

}
