package wraith.harvest_scythes.api.scythe;

import wraith.harvest_scythes.api.event.HarvestEvent;
import wraith.harvest_scythes.api.event.SingleHarvestEvent;

import java.util.HashSet;

public final class HSScythesEvents {

    private HSScythesEvents() {}

    private static final HashSet<IScytheSingleHarvestListener> SINGLE_HARVEST_LISTENERS = new HashSet<>();
    private static final HashSet<IScytheHarvestListener> HARVEST_LISTENERS = new HashSet<>();

    public static void addSingleHarvestListener(IScytheSingleHarvestListener listener) {
        SINGLE_HARVEST_LISTENERS.add(listener);
    }

    public static void addHarvestListener(IScytheHarvestListener listener) {
        HARVEST_LISTENERS.add(listener);
    }

    public static void removeSingleHarvestListener(IScytheSingleHarvestListener listener) {
        SINGLE_HARVEST_LISTENERS.remove(listener);
    }

    public static void removeHarvestListener(IScytheHarvestListener listener) {
        HARVEST_LISTENERS.remove(listener);
    }

    // Called when a single crop is harvested
    public static void onSingleHarvest(SingleHarvestEvent event) {
        for (var listener : SINGLE_HARVEST_LISTENERS) {
            listener.onSingleHarvest(event);
        }
    }

    // Called when multiple crops are harvested
    public static void onHarvest(HarvestEvent event) {
        for (var listener : HARVEST_LISTENERS) {
            listener.onHarvest(event);
        }
    }

}
