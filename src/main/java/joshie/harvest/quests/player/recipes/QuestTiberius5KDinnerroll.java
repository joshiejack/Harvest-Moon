package joshie.harvest.quests.player.recipes;

import joshie.harvest.api.quests.HFQuest;
import joshie.harvest.api.quests.Quest;
import joshie.harvest.npcs.HFNPCs;
import joshie.harvest.quests.Quests;
import joshie.harvest.quests.base.QuestRecipe;

import java.util.Set;

@HFQuest("recipe.dinnerroll")
public class QuestTiberius5KDinnerroll extends QuestRecipe {
    public QuestTiberius5KDinnerroll() {
        super("dinnerroll", HFNPCs.CLOCKMAKER, 5000);
    }

    @Override
    public boolean canStartQuest(Set<Quest> active, Set<Quest> finished) {
        return finished.contains(Quests.TIBERIUS_MEET);
    }
}
