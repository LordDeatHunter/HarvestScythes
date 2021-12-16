package wraith.harvest_scythes.util;

import net.minecraft.util.Identifier;
import wraith.harvest_scythes.HarvestScythes;

import java.util.Calendar;
import java.util.Random;

public final class HSUtils {

    private HSUtils() {}

    private static final Random RANDOM = new Random(Calendar.getInstance().getTimeInMillis());

    public static int getRandomIntInRange(int min, int max) {
        return RANDOM.nextInt(max - min + 1) + min;
    }

    public static Identifier ID(String path) {
        return new Identifier(HarvestScythes.MOD_ID, path);
    }

}
