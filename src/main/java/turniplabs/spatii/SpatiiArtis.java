package turniplabs.spatii;

import net.fabricmc.api.ModInitializer;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.Material;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.BlockHelper;
import turniplabs.halplibe.helper.ItemHelper;
import turniplabs.spatii.block.BlockOreCheese;


public class SpatiiArtis implements ModInitializer {
    public static final String MOD_ID = "spatii";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final Block moonstone = BlockHelper.createBlock(MOD_ID,new Block(9000, Material.rock), "moonstone", "moonstone.png", Block.soundStoneFootstep,1.7f, 6.0f, 0.0f);
    public static final Block moonturf = BlockHelper.createBlock(MOD_ID,new Block(9001, Material.rock), "moonturf", "moonturf.png", Block.soundPowderFootstep,1.0f, 5.0f, 0.0f);
    public static final Block cheeseore = BlockHelper.createBlock(MOD_ID, new BlockOreCheese(9002, Material.rock), "cheeseore", "moonstonecheese.png", Block.soundPowderFootstep,1.0f, 5.0f, 0.0f);
    public static final Item cheese = ItemHelper.createItem(MOD_ID, new Item(9003), "cheese", "cheese.png");
    @Override
    public void onInitialize() {
        LOGGER.info("Spatii Artis should be running now, if it's not, then huston, you have a problem");

    }
}