package ac.grim.grimac.utils.blockstate.helper;

import ac.grim.grimac.utils.blockstate.BaseBlockState;
import ac.grim.grimac.utils.blockstate.FlatBlockState;
import ac.grim.grimac.utils.blockstate.MagicBlockState;
import io.github.retrooper.packetevents.utils.server.ServerVersion;
import org.bukkit.Material;

public class BlockStateHelper {
    private static final boolean isFlattened;

    static {
        isFlattened = ServerVersion.getVersion().isNewerThanOrEquals(ServerVersion.v_1_13);
    }

    public static BaseBlockState create(Material material) {
        return isFlattened ? new FlatBlockState(material) : new MagicBlockState(material);
    }
}