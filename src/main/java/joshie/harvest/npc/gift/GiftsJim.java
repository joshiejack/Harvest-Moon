package joshie.harvest.npc.gift;

import joshie.harvest.api.npc.gift.GiftCategory;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GiftsJim extends Gifts {
    @Override
    public Quality getQuality(ItemStack stack) {
        if (stack.getItem() == Items.STICK) {
            return Quality.AWESOME;
        }

        if (isGiftType(stack, GiftCategory.CHEAP)) {
            return Quality.GOOD;
        }

        if (isGiftType(stack, GiftCategory.RARE)) {
            return Quality.BAD;
        }

        return Quality.DECENT;
    }
}
