/*
 * Minecraft Forge
 * Copyright (c) 2016.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation version 2.1
 * of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package net.minecraftforge.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotItemHandler extends Slot
{
    private static IInventory emptyInventory = new InventoryBasic("[Null]", true, 0);
    private final IItemHandler itemHandler;
    private final int index;

    public SlotItemHandler(IItemHandler itemHandler, int index, int xPosition, int yPosition)
    {
        super(emptyInventory, index, xPosition, yPosition);
        this.itemHandler = itemHandler;
        this.index = index;
    }

    /**
     * Check if the stack is allowed to be placed in this slot, used for armor slots as well as furnace fuel.
     */
    @Override
    public boolean isItemValid(ItemStack stack)
    {
        if (stack == null)
            return false;

        IItemHandler handler = this.getItemHandler();
        ItemStack remainder;
        if (handler instanceof IItemHandlerModifiable)
        {
            IItemHandlerModifiable handlerModifiable = (IItemHandlerModifiable) handler;
            ItemStack currentStack = handlerModifiable.getStackInSlot(index);

            handlerModifiable.setStackInSlot(index, null);

            remainder = handlerModifiable.insertItem(index, stack, true);

            handlerModifiable.setStackInSlot(index, currentStack);
        }
        else
        {
            remainder = handler.insertItem(index, stack, true);
        }
        return remainder == null || remainder.stackSize < stack.stackSize;
    }

    /**
     * Helper fnct to get the stack in the slot.
     */
    @Override
    public ItemStack getStack()
    {
        return this.getItemHandler().getStackInSlot(index);
    }

    // Override if your IItemHandler does not implement IItemHandlerModifiable
    /**
     * Helper method to put a stack in the slot.
     */
    @Override
    public void putStack(ItemStack stack)
    {
        ((IItemHandlerModifiable) this.getItemHandler()).setStackInSlot(index, stack);
        this.onSlotChanged();
    }

    /**
     * if par2 has more items than par1, onCrafting(item,countIncrease) is called
     */
    @Override
    public void onSlotChange(ItemStack p_75220_1_, ItemStack p_75220_2_)
    {

    }

    @Override
    public int getItemStackLimit(ItemStack stack)
    {
        ItemStack maxAdd = stack.copy();
        int maxInput = stack.getMaxStackSize();
        maxAdd.stackSize = maxInput;

        IItemHandler handler = this.getItemHandler();
        ItemStack currentStack = handler.getStackInSlot(index);
        if (handler instanceof IItemHandlerModifiable) {
            IItemHandlerModifiable handlerModifiable = (IItemHandlerModifiable) handler;

            handlerModifiable.setStackInSlot(index, null);

            ItemStack remainder = handlerModifiable.insertItem(index, maxAdd, true);

            handlerModifiable.setStackInSlot(index, currentStack);

            return maxInput - (remainder != null ? remainder.stackSize : 0);
        }
        else
        {
            ItemStack remainder = handler.insertItem(index, maxAdd, true);

            int current = currentStack == null ? 0 : currentStack.stackSize;
            int added = maxInput - (remainder != null ? remainder.stackSize : 0);
            return current + added;
        }
    }

    /**
     * Return whether this slot's stack can be taken from this slot.
     */
    @Override
    public boolean canTakeStack(EntityPlayer playerIn)
    {
        return this.getItemHandler().extractItem(index, 1, true) != null;
    }

    /**
     * Decrease the size of the stack in slot (first int arg) by the amount of the second int arg. Returns the new
     * stack.
     */
    @Override
    public ItemStack decrStackSize(int amount)
    {
        return this.getItemHandler().extractItem(index, amount, false);
    }

    public IItemHandler getItemHandler()
    {
        return itemHandler;
    }

    @Override
    public boolean isSameInventory(Slot other)
    {
        return other instanceof SlotItemHandler && ((SlotItemHandler) other).getItemHandler() == this.itemHandler;
    }
}