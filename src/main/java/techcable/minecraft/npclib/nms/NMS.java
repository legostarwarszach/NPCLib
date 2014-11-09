package techcable.minecraft.npclib.nms;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.HumanEntity;

public interface NMS extends VersionedClass {
    public void look(Entity entity, float pitch, float yaw);
    public HumanEntity spawnHuman(Location toSpawn, UUID uuid, String name);
    public void setName(HumanEntity human, String name);
}
