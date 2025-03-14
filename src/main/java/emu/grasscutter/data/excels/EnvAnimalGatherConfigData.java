package emu.grasscutter.data.excels;

import emu.grasscutter.data.*;
import emu.grasscutter.data.common.ItemParamData;
import java.util.List;

@ResourceType(
        name = "EnvAnimalGatherExcelConfigData.json",
        loadPriority = ResourceType.LoadPriority.LOW)
public class EnvAnimalGatherConfigData extends GameResource {
    private int animalId;
    private String entityType;
    private List<ItemParamData> gatherItemId;
    private String excludeWeathers;
    private int aliveTime;
    private int escapeTime;
    private int escapeRadius;

    @Override
    public int getId() {
        return animalId;
    }

    public int getAnimalId() {
        return animalId;
    }

    public String getEntityType() {
        return entityType;
    }

    public ItemParamData getGatherItem() {
        if (gatherItemId == null || gatherItemId.isEmpty()) {
             return null;
         }
         return gatherItemId.get(0);
    }
}
