package wraith.harvest_scythes.api.scythe;

import wraith.harvest_scythes.api.event.SingleHarvestEvent;

// Called when a scythe harvests a single crop.
public interface ISingleScytheHarvestListener {

    void onSingleHarvest(SingleHarvestEvent event);

}
