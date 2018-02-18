package com.jam.client.Capability;

import com.jam.common.lib.Ref;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlacklistHandler {
    public static final ResourceLocation BLACKLIST_CAPABILITY = new ResourceLocation(Ref.MOD_ID, "blacklist");

    @SubscribeEvent
    public void attachCapability(AttachCapabilitiesEvent<Entity> event) {
        if( !(event.getObject() instanceof EntityPlayer) )
            return;

        event.addCapability(BLACKLIST_CAPABILITY, new BlacklistProvider());
    }
}
