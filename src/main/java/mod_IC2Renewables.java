import ic2.TileEntityExtractor;
import ic2.TileEntityMacerator;
import net.minecraft.src.*;

@SuppressWarnings("unused")
public class mod_IC2Renewables extends BaseMod {
    public mod_IC2Renewables() {
    }

    @Override
    public String Version() {
        return "1.0.0";
    }

    /* Mod Menu Information */

    public String Name() {
        return "IC2 Renewables Addon";
    }

    public String Description() {
        return "An addon for IC2 that makes some basic resources renewable.";
    }

    @Override
    public void ModsLoaded() {
        ModLoader.AddShapelessRecipe(
                new ItemStack(Block.dirt, 8),
                new Object[] {
                        mod_IC2.itemFuelPlantBall,
                        Block.sand, Block.sand, Block.sand, Block.sand,
                        Block.gravel, Block.gravel, Block.gravel, Block.gravel
                });

        ModLoader.AddShapelessRecipe(
                new ItemStack(Item.clay, 4),
                new Object[] {
                        mod_IC2.itemCellWater,
                        Block.dirt, Block.dirt, Block.dirt, Block.dirt
                });

        ModLoader.AddRecipe(new ItemStack(Block.slowSand, 8), new Object[]{"MMM", " M ", "   ", 'M', mod_IC2.itemMatter});

        ModLoader.AddRecipe(new ItemStack(Block.glowStone, 4), new Object[]{"MM ", "MM ", "   ", 'M', mod_IC2.itemMatter});

        TileEntityMacerator.addRecipe(Block.cobblestone.blockID, new ItemStack(Block.gravel));
        TileEntityExtractor.addRecipe(Block.gravel.blockID, new ItemStack(Block.sand));
    }
}
