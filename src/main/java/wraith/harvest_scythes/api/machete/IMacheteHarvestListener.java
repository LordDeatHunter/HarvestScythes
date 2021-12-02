package wraith.harvest_scythes.api.machete;

import wraith.harvest_scythes.api.event.HarvestEvent;

// Called when a scythe finishes harvesting every crop in range.
public interface IMacheteHarvestListener {

    void onHarvest(HarvestEvent event);

}