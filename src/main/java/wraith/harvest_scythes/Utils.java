package wraith.harvest_scythes;

public class Utils {

    public static int round(float n) {
        return (int)(n % 1 > 0.5 ? Math.ceil(n) : Math.floor(n));
    }

    public static int round(double n) {
        return (int)(n % 1 > 0.5 ? Math.ceil(n) : Math.floor(n));
    }

}
