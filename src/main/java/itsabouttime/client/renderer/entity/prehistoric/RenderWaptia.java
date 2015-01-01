package itsabouttime.client.renderer.entity.prehistoric;

import org.lwjgl.opengl.GL11;

import itsabouttime.client.model.prehistoric.ModelAnomalocaris;
import itsabouttime.client.model.prehistoric.ModelHaikouichthys;
import itsabouttime.client.model.prehistoric.ModelTrilobite;
import itsabouttime.client.model.prehistoric.ModelWaptia;
import itsabouttime.common.entities.prehistoric.EntityAnomalocaris;
import itsabouttime.common.entities.prehistoric.EntityHaikouichthys;
import itsabouttime.common.entities.prehistoric.EntityTrilobite;
import itsabouttime.common.entities.prehistoric.EntityWaptia;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderWaptia
  extends RenderLiving
{
  private static final ResourceLocation Texture1 = new ResourceLocation( "iat:textures/entity/Waptia.png");

  public RenderWaptia()
  {
    super(new ModelWaptia(), 0.3F);
  }
  
  protected ResourceLocation getEntityTextures(EntityWaptia tr)
  {
      return Texture1;
  


  }
  

  @Override
	protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2) {
	GL11.glScalef(0.5f, 0.5f, 0.5f); // mix and match the parameters to your likings. 1.0f = 100%.
	}
  
  
  protected ResourceLocation getEntityTexture(Entity entity)
  {
    return getEntityTextures((EntityWaptia)entity);
  }
}
