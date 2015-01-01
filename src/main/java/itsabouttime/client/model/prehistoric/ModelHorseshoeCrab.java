// Date: 9/14/2014 7:28:33 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package itsabouttime.client.model.prehistoric;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelHorseshoeCrab extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer Tail;
    ModelRenderer tail2;
  
  public ModelHorseshoeCrab()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-4.5F, -5F, -8F, 9, 6, 8);
      head.setRotationPoint(0F, 23F, 0F);
      head.setTextureSize(64, 64);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 34, 0);
      body.addBox(-3.5F, -3F, 0F, 7, 4, 5);
      body.setRotationPoint(0F, 23F, 0F);
      body.setTextureSize(64, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 0, 14);
      Tail.addBox(-0.5F, -0.5F, 0F, 1, 1, 11);
      Tail.setRotationPoint(0F, 23F, 4F);
      Tail.setTextureSize(64, 64);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
      tail2 = new ModelRenderer(this, 0, 26);
      tail2.addBox(-4.5F, 0.7F, 0F, 9, 0, 6);
      tail2.setRotationPoint(0F, 23F, 4F);
      tail2.setTextureSize(64, 64);
      tail2.mirror = true;
      setRotation(tail2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    Tail.render(f5);
    tail2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
	  this.Tail.rotateAngleY = 0.2F * MathHelper.sin(f2 * (float)0.15F + f1);

  }

}
