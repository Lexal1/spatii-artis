package turniplabs.spatii.block;

import net.minecraft.src.Block;
import net.minecraft.src.Material;
import turniplabs.spatii.SpatiiArtis;

import java.util.Random;

public class BlockOreCheese extends Block {
    public BlockOreCheese(int i, Material material) {
        super(i, material);
    }
    public int idDropped(int i, Random random) {
        return SpatiiArtis.cheese.itemID;
    }
}
