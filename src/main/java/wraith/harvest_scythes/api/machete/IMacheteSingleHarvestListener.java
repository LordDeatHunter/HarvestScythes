package wraith.harvest_scythes.api.machete;

import wraith.harvest_scythes.api.event.SingleHarvestEvent;

// Called when a scythe harvests a single crop.
public interface IMacheteSingleHarvestListener {

    void onSingleHarvest(SingleHarvestEvent event);

}
