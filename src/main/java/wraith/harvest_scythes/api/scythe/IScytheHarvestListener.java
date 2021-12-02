package wraith.harvest_scythes.api.scythe;

import wraith.harvest_scythes.api.event.HarvestEvent;

// Called when a scythe finishes harvesting every crop in range.
public interface IScytheHarvestListener {

    void onHarvest(HarvestEvent event);

}