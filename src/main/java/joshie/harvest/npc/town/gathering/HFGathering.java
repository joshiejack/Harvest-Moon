package joshie.harvest.npc.town.gathering;

import joshie.harvest.api.HFApi;
import joshie.harvest.blocks.BlockFlower.FlowerType;
import joshie.harvest.blocks.HFBlocks;

import static joshie.harvest.blocks.BlockRock.Rock.*;
import static joshie.harvest.blocks.BlockWood.Wood.*;
import static joshie.harvest.blocks.HFBlocks.ROCK;
import static joshie.harvest.blocks.HFBlocks.WOOD;

public class HFGathering {
    public static void init() {
        HFApi.gathering.registerGathering(HFBlocks.FLOWERS.getStateFromEnum(FlowerType.WEED), 10D);
        HFApi.gathering.registerGathering(WOOD.getStateFromEnum(BRANCH_SMALL), 8D);
        HFApi.gathering.registerGathering(WOOD.getStateFromEnum(BRANCH_MEDIUM), 5D);
        HFApi.gathering.registerGathering(WOOD.getStateFromEnum(BRANCH_LARGE), 3D);
        HFApi.gathering.registerGathering(ROCK.getStateFromEnum(STONE_SMALL), 8D);
        HFApi.gathering.registerGathering(ROCK.getStateFromEnum(STONE_MEDIUM), 5D);
        HFApi.gathering.registerGathering(ROCK.getStateFromEnum(STONE_LARGE), 3D);
        HFApi.gathering.registerGathering(WOOD.getStateFromEnum(STUMP_SMALL), 3D);
        HFApi.gathering.registerGathering(WOOD.getStateFromEnum(STUMP_MEDIUM), 2D);
        HFApi.gathering.registerGathering(WOOD.getStateFromEnum(STUMP_LARGE), 1D);
        HFApi.gathering.registerGathering(ROCK.getStateFromEnum(BOULDER_SMALL), 3D);
        HFApi.gathering.registerGathering(ROCK.getStateFromEnum(BOULDER_MEDIUM), 2D);
        HFApi.gathering.registerGathering(ROCK.getStateFromEnum(BOULDER_LARGE), 1D);
    }
}
