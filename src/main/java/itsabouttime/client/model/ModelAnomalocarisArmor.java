// Date: 11/13/2014 3:31:02 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package itsabouttime.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAnomalocarisArmor extends ModelBiped
{
  //fields

    ModelRenderer Ahead;
    ModelRenderer FangLeftA;
    ModelRenderer FangRightA;
    ModelRenderer FangLeftB;
    ModelRenderer FangRightB;
    ModelRenderer FangLeftC;
    ModelRenderer FangRightC;
    ModelRenderer Back1;
    ModelRenderer Eyeleft;
    ModelRenderer EyeRight;
    ModelRenderer LegLeft1;
    ModelRenderer Right6;
    ModelRenderer LegRight4;
    ModelRenderer right7;
    ModelRenderer LegLeft4;
    ModelRenderer right5;
    ModelRenderer Right3;
    ModelRenderer LegLeft2;
    ModelRenderer Left1;
    ModelRenderer Left2;
    ModelRenderer Left3;
    ModelRenderer Left4;
    ModelRenderer Left5;
    ModelRenderer Left6;
    ModelRenderer left7;
    ModelRenderer Left8;
    ModelRenderer left9;
    ModelRenderer rightarm2;
    ModelRenderer rightarm1;
    ModelRenderer rightarm3;
    ModelRenderer LeftArm2;
    ModelRenderer LeftArm1;
    ModelRenderer Leftarm3;
    ModelRenderer tailLeft;
    ModelRenderer tailRight;
    ModelRenderer Neck1;
    ModelRenderer Right1;
    ModelRenderer Right2;
    ModelRenderer right4;
    ModelRenderer LegLeft5;
    ModelRenderer right8;
    ModelRenderer right9;
    ModelRenderer LegRight1;
    ModelRenderer LegRight2;
    ModelRenderer LegRight3;
    ModelRenderer LeGLeft3;
    ModelRenderer LegRight5;
  
  public ModelAnomalocarisArmor(float f)
  {
	  super(f,0,64,128);

    textureWidth = 64;
    textureHeight = 128;
    
     
      
    Ahead = new ModelRenderer(this, 0, 36);
    Ahead.addBox(-2F, -10F, -5F, 4, 2, 6);
    Ahead.setRotationPoint(0F, 0F, 0F);
    Ahead.setTextureSize(64, 128);
    Ahead.mirror = true;
    setRotation(Ahead, 0.2094395F, 0F, 0F);
    EyeRight = new ModelRenderer(this, 25, 41);
    EyeRight.addBox(4F, -10.5F, -5F, 1, 2, 1);
    EyeRight.setRotationPoint(1F, 1.5F, -2.8F);
    EyeRight.setTextureSize(64, 128);
    EyeRight.mirror = true;
    setRotation(EyeRight, 0.122173F, -0.3490659F, -0.8901179F);
    Eyeleft = new ModelRenderer(this, 25, 41);
    Eyeleft.addBox(-5F, -10.5F, -5F, 1, 2, 1);
    Eyeleft.setRotationPoint(-1F, 1.5F, -2.8F);
    Eyeleft.setTextureSize(64, 128);
    Eyeleft.mirror = true;
    setRotation(Eyeleft, 0.122173F, 0.3490659F, 0.8901179F);
    FangLeftA = new ModelRenderer(this, 30, 41);
    FangLeftA.addBox(1.1F, 1.8F, -10F, 1, 3, 1);
    FangLeftA.setRotationPoint(0F, 0F, 0F);
    FangLeftA.setTextureSize(64, 128);
    FangLeftA.mirror = true;
    setRotation(FangLeftA, -1.047198F, 0F, 0F);
    FangRightA = new ModelRenderer(this, 30, 41);
    FangRightA.addBox(-2.1F, 1.8F, -10F, 1, 3, 1);
    FangRightA.setRotationPoint(0F, 0F, 0F);
    FangRightA.setTextureSize(64, 128);
    FangRightA.mirror = true;
    setRotation(FangRightA, -1.047198F, 0F, 0F);
    FangLeftB = new ModelRenderer(this, 30, 46);
    FangLeftB.addBox(1F, -4.5F, -10F, 1, 4, 1);
    FangLeftB.setRotationPoint(0F, 0F, 0F);
    FangLeftB.setTextureSize(64, 128);
    FangLeftB.mirror = true;
    setRotation(FangLeftB, -0.1745329F, 0F, 0F);
    FangRightB = new ModelRenderer(this, 30, 46);
    FangRightB.addBox(-2F, -4.5F, -10F, 1, 4, 1);
    FangRightB.setRotationPoint(0F, 0F, 0F);
    FangRightB.setTextureSize(64, 128);
    FangRightB.mirror = true;
    setRotation(FangRightB, -0.1745329F, 0F, 0F);
    FangLeftC = new ModelRenderer(this, 30, 52);
    FangLeftC.addBox(0.9F, -9.2F, -3.7F, 1, 3, 1);
    FangLeftC.setRotationPoint(0F, 0F, 0F);
    FangLeftC.setTextureSize(64, 128);
    FangLeftC.mirror = true;
    setRotation(FangLeftC, 0.9773844F, 0F, 0F);
    FangRightC = new ModelRenderer(this, 30, 52);
    FangRightC.addBox(-1.9F, -9.2F, -3.7F, 1, 3, 1);
    FangRightC.setRotationPoint(0F, 0F, 0F);
    FangRightC.setTextureSize(64, 128);
    FangRightC.mirror = true;
    setRotation(FangRightC, 0.9773844F, 0F, 0F);
    Neck1 = new ModelRenderer(this, 0, 46);
    Neck1.addBox(-2F, -9F, -3.653333F, 4, 3, 5);
    Neck1.setRotationPoint(0F, 0F, 0F);
    Neck1.setTextureSize(64, 128);
    Neck1.mirror = true;
    setRotation(Neck1, -0.2443461F, 0F, 0F);
    Back1 = new ModelRenderer(this, 0, 88);
    Back1.addBox(-2F, -3.5F, -0.6533333F, 4, 3, 12);
    Back1.setRotationPoint(0F, 0F, 0F);
    Back1.setTextureSize(64, 128);
    Back1.mirror = true;
    setRotation(Back1, -1.727876F, 0F, 0F);
    Left1 = new ModelRenderer(this, 0, 55);
    Left1.addBox(2F, 0F, 0F, 5, 1, 1);
    Left1.setRotationPoint(0F, 0F, 0F);
    Left1.setTextureSize(64, 128);
    Left1.mirror = true;
    setRotation(Left1, 0F, -0.6981317F, 0F);
    Left2 = new ModelRenderer(this, 0, 57);
    Left2.addBox(2F, 1F, 0F, 6, 1, 1);
    Left2.setRotationPoint(0F, 0F, 0F);
    Left2.setTextureSize(64, 128);
    Left2.mirror = true;
    setRotation(Left2, 0F, -0.7679449F, 0F);
    Left3 = new ModelRenderer(this, 0, 59);
    Left3.addBox(2F, 2F, 0F, 7, 1, 1);
    Left3.setRotationPoint(0F, 0F, 0F);
    Left3.setTextureSize(64, 128);
    Left3.mirror = true;
    setRotation(Left3, 0F, -0.8028515F, 0F);
    Left4 = new ModelRenderer(this, 0, 61);
    Left4.addBox(2F, 3F, 0F, 8, 1, 1);
    Left4.setRotationPoint(0F, 0F, 0F);
    Left4.setTextureSize(64, 128);
    Left4.mirror = true;
    setRotation(Left4, 0F, -0.8552113F, 0F);
    Left5 = new ModelRenderer(this, 0, 63);
    Left5.addBox(2F, 4F, 0F, 8, 1, 1);
    Left5.setRotationPoint(0F, 0F, 0F);
    Left5.setTextureSize(64, 128);
    Left5.mirror = true;
    setRotation(Left5, 0F, -0.8726646F, 0F);
    Left6 = new ModelRenderer(this, 0, 65);
    Left6.addBox(2F, 5F, 0F, 8, 1, 1);
    Left6.setRotationPoint(0F, 0F, 0F);
    Left6.setTextureSize(64, 128);
    Left6.mirror = true;
    setRotation(Left6, 0F, -0.8203047F, 0F);
    left7 = new ModelRenderer(this, 0, 67);
    left7.addBox(2F, 6F, 0F, 7, 1, 1);
    left7.setRotationPoint(0F, 0F, 0F);
    left7.setTextureSize(64, 128);
    left7.mirror = true;
    setRotation(left7, 0F, -0.8028515F, 0F);
    Left8 = new ModelRenderer(this, 0, 69);
    Left8.addBox(2F, 7F, 0F, 6, 1, 1);
    Left8.setRotationPoint(0F, 0F, 0F);
    Left8.setTextureSize(64, 128);
    Left8.mirror = true;
    setRotation(Left8, 0F, -0.7679449F, 0F);
    left9 = new ModelRenderer(this, 0, 71);
    left9.addBox(2F, 8F, 0F, 5, 1, 1);
    left9.setRotationPoint(0F, 0F, 0F);
    left9.setTextureSize(64, 128);
    left9.mirror = true;
    setRotation(left9, 0F, -0.6981317F, 0F);
    Right1 = new ModelRenderer(this, 0, 55);
    Right1.addBox(-7F, 0F, 0F, 5, 1, 1);
    Right1.setRotationPoint(0F, 0F, 0F);
    Right1.setTextureSize(64, 128);
    Right1.mirror = true;
    setRotation(Right1, 0F, 0.6981317F, 0F);
    Right2 = new ModelRenderer(this, 0, 57);
    Right2.addBox(-8F, 1F, 0F, 6, 1, 1);
    Right2.setRotationPoint(0F, 0F, 0F);
    Right2.setTextureSize(64, 128);
    Right2.mirror = true;
    setRotation(Right2, 0F, 0.7679449F, 0F);
    Right3 = new ModelRenderer(this, 0, 59);
    Right3.addBox(-9F, 2F, 0F, 7, 1, 1);
    Right3.setRotationPoint(0F, 0F, 0F);
    Right3.setTextureSize(64, 128);
    Right3.mirror = true;
    setRotation(Right3, 0F, 0.8028515F, 0F);
    right4 = new ModelRenderer(this, 0, 61);
    right4.addBox(-10F, 3F, 0F, 8, 1, 1);
    right4.setRotationPoint(0F, 0F, 0F);
    right4.setTextureSize(64, 128);
    right4.mirror = true;
    setRotation(right4, 0F, 0.8552113F, 0F);
    right5 = new ModelRenderer(this, 0, 63);
    right5.addBox(-10F, 4F, 0F, 8, 1, 1);
    right5.setRotationPoint(0F, 0F, 0F);
    right5.setTextureSize(64, 128);
    right5.mirror = true;
    setRotation(right5, 0F, 0.8726646F, 0F);
    Right6 = new ModelRenderer(this, 0, 65);
    Right6.addBox(-10F, 5F, 0F, 8, 1, 1);
    Right6.setRotationPoint(0F, 0F, 0F);
    Right6.setTextureSize(64, 128);
    Right6.mirror = true;
    setRotation(Right6, 0F, 0.8203047F, 0F);
    right7 = new ModelRenderer(this, 0, 67);
    right7.addBox(-9F, 6F, 0F, 7, 1, 1);
    right7.setRotationPoint(0F, 0F, 0F);
    right7.setTextureSize(64, 128);
    right7.mirror = true;
    setRotation(right7, 0F, 0.8028515F, 0F);
    right8 = new ModelRenderer(this, 0, 69);
    right8.addBox(-8F, 7F, 0F, 6, 1, 1);
    right8.setRotationPoint(0F, 0F, 0F);
    right8.setTextureSize(64, 128);
    right8.mirror = true;
    setRotation(right8, 0F, 0.7679449F, 0F);
    right9 = new ModelRenderer(this, 0, 71);
    right9.addBox(-7F, 8F, 0F, 5, 1, 1);
    right9.setRotationPoint(0F, 0F, 0F);
    right9.setTextureSize(64, 128);
    right9.mirror = true;
    setRotation(right9, 0F, 0.6981317F, 0F);
    
    LeftArm1 = new ModelRenderer(this, 0, 55);
    LeftArm1.addBox(-6F, -1F, 0F, 5, 1, 1);
    LeftArm1.setRotationPoint(-1F, 0F, -1F);
    LeftArm1.setTextureSize(64, 128);
    LeftArm1.mirror = true;
    setRotation(LeftArm1, 2F, 0F, 2.146755F);
    LeftArm2 = new ModelRenderer(this, 0, 57);
    LeftArm2.addBox(-7F, -1F, -1F, 6, 1, 1);
    LeftArm2.setRotationPoint(0F, 0F, 0F);
    LeftArm2.setTextureSize(64, 128);
    LeftArm2.mirror = true;
    setRotation(LeftArm2, 0F, 0F, 2.146755F);
    Leftarm3 = new ModelRenderer(this, 0, 55);
    Leftarm3.addBox(-6F, -1F, 0F, 5, 1, 1);
    Leftarm3.setRotationPoint(0F, 0F, 1F);
    Leftarm3.setTextureSize(64, 128);
    Leftarm3.mirror = true;
    setRotation(Leftarm3, -2F, 0F, 2.146755F);
    
    rightarm1 = new ModelRenderer(this, 0, 55);
    rightarm1.addBox(1F, 0.5F, 0F, 5, 1, 1);
    rightarm1.setRotationPoint(1.5F, 0F, -2.5F);
    rightarm1.setTextureSize(64, 128);
    rightarm1.mirror = true;
    setRotation(rightarm1,  2F, 0F, -2.146755F);
    rightarm2 = new ModelRenderer(this, 0, 57);
    rightarm2.addBox(1F, -1F, -1F, 6, 1, 1);
    rightarm2.setRotationPoint(0F, 0F, 0F);
    rightarm2.setTextureSize(64, 128);
    rightarm2.mirror = true;
    setRotation(rightarm2, 0F, 0F, -2.146755F);
    rightarm3 = new ModelRenderer(this, 0, 55);
    rightarm3.addBox(1F, -1F, 0F, 5, 1, 1);
    rightarm3.setRotationPoint(0F, 0F, 1F);
    rightarm3.setTextureSize(64, 128);
    rightarm3.mirror = true;
    setRotation(rightarm3,  -2F, 0F, -2.146755F);
    
    tailLeft = new ModelRenderer(this, 1, 75);
    tailLeft.addBox(0F, 7F, 8F, 1, 1, 12);
    tailLeft.setRotationPoint(0F, 0F, 0F);
    tailLeft.setTextureSize(64, 128);
    tailLeft.mirror = true;
    setRotation(tailLeft, -0.6632251F, 0.122173F, 0F);
    tailRight = new ModelRenderer(this, 1, 75);
    tailRight.addBox(-1F, 7F, 8F, 1, 1, 12);
    tailRight.setRotationPoint(0F, 0F, 0F);
    tailRight.setTextureSize(64, 128);
    tailRight.mirror = true;
    setRotation(tailRight, -0.6632251F, -0.122173F, 0F);
    LegLeft1 = new ModelRenderer(this, 6, 104);
    LegLeft1.addBox(2.48F, 5F, 0F, 3, 1, 1);
    LegLeft1.setTextureSize(64, 128);
    LegLeft1.mirror = true;
    setRotation(LegLeft1, 0F, -1.047198F, 0F);
    LegLeft2 = new ModelRenderer(this, 6, 106);
    LegLeft2.addBox(2F, 6F, 0F, 4, 1, 1);
    LegLeft2.setTextureSize(64, 128);
    LegLeft2.mirror = true;
    setRotation(LegLeft2, 0F, -1.117011F, 0F);
    LeGLeft3 = new ModelRenderer(this, 2, 108);
    LeGLeft3.addBox(2F, 7F, 0F, 5, 1, 1);
    LeGLeft3.setTextureSize(64, 128);
    LeGLeft3.mirror = true;
    setRotation(LeGLeft3, 0F, -1.169371F, 0F);
    LegLeft4 = new ModelRenderer(this, 2, 108);
    LegLeft4.addBox(2F, 8F, 0F, 4, 1, 1);
    LegLeft4.setTextureSize(64, 128);
    LegLeft4.mirror = true;
    setRotation(LegLeft4, 0F, -1.169371F, 0F);
    LegLeft5 = new ModelRenderer(this, 2, 112);
    LegLeft5.addBox(2F, 9F, 0F, 3, 1, 1);
    LegLeft5.setTextureSize(64, 128);
    LegLeft5.mirror = true;
    setRotation(LegLeft5, 0F, -1.151917F, 0F);
    LegRight1 = new ModelRenderer(this, 6, 104);
    LegRight1.addBox(-5F, 5F, 0F, 3, 1, 1);
    LegRight1.setTextureSize(64, 128);
    LegRight1.mirror = true;
    setRotation(LegRight1, 0F, 1.047198F, 0F);
    LegRight2 = new ModelRenderer(this, 6, 106);
    LegRight2.addBox(-6F, 6F, 0F, 4, 1, 1);
    LegRight2.setTextureSize(64, 128);
    LegRight2.mirror = true;
    setRotation(LegRight2, 0F, 1.117011F, -0.0074467F);
    LegRight3 = new ModelRenderer(this, 2, 108);
    LegRight3.addBox(-7F, 7F, 0F, 5, 1, 1);
    LegRight3.setTextureSize(64, 128);
    LegRight3.mirror = true;
    setRotation(LegRight3, 0F, 1.169371F, 0F);
    LegRight4 = new ModelRenderer(this, 2, 110);
    LegRight4.addBox(-6F, 8F, 0F, 4, 1, 1);
    LegRight4.setTextureSize(64, 128);
    LegRight4.mirror = true;
    setRotation(LegRight4, 0F, 1.186824F, 0F);
    LegRight5 = new ModelRenderer(this, 2, 112);
    LegRight5.addBox(-5F, 9F, 0F, 3, 1, 1);
    LegRight5.setTextureSize(64, 128);
    LegRight5.mirror = true;
    setRotation(LegRight5, 0F, 1.151917F, 0F);
   

      this.bipedHead.addChild(this.Ahead);
      this.bipedHead.addChild(this.EyeRight);
      this.bipedHead.addChild(this.Eyeleft);
      this.bipedHead.addChild(this.Neck1);
      this.bipedHead.addChild(this.FangLeftA);
      this.bipedHead.addChild(this.FangLeftB);
      this.bipedHead.addChild(this.FangLeftC);
      this.bipedHead.addChild(this.FangRightA);
      this.bipedHead.addChild(this.FangRightB);
      this.bipedHead.addChild(this.FangRightC);
      this.bipedBody.addChild(this.Back1);
      this.bipedBody.addChild(this.Left1);
      this.bipedBody.addChild(this.Left2);
      this.bipedBody.addChild(this.Left3);
      this.bipedBody.addChild(this.Left4);
      this.bipedBody.addChild(this.Left5);
      this.bipedBody.addChild(this.Left6);
      this.bipedBody.addChild(this.left7);
      this.bipedBody.addChild(this.Left8);
      this.bipedBody.addChild(this.left9);
      this.bipedBody.addChild(this.Right1);
      this.bipedBody.addChild(this.Right2);
      this.bipedBody.addChild(this.Right3);
      this.bipedBody.addChild(this.right4);
      this.bipedBody.addChild(this.right5);
      this.bipedBody.addChild(this.Right6);
      this.bipedBody.addChild(this.right7);
      this.bipedBody.addChild(this.right8);
      this.bipedBody.addChild(this.right9);
      this.bipedBody.addChild(this.tailLeft);
      this.bipedBody.addChild(this.tailRight);
      this.bipedLeftArm.addChild(this.LeftArm1);
      this.bipedLeftArm.addChild(this.LeftArm2);
      this.bipedLeftArm.addChild(this.Leftarm3);
      this.bipedRightArm.addChild(this.rightarm1);
      this.bipedRightArm.addChild(this.rightarm2);
      this.bipedRightArm.addChild(this.rightarm3);
      this.bipedLeftLeg.addChild(this.LegLeft1);
      this.bipedLeftLeg.addChild(this.LegLeft2);
      this.bipedLeftLeg.addChild(this.LeGLeft3);
      this.bipedLeftLeg.addChild(this.LegLeft4);
      this.bipedLeftLeg.addChild(this.LegLeft5);
      this.bipedRightLeg.addChild(this.LegRight1);
      this.bipedRightLeg.addChild(this.LegRight2);
      this.bipedRightLeg.addChild(this.LegRight3);
      this.bipedRightLeg.addChild(this.LegRight4);
      this.bipedRightLeg.addChild(this.LegRight5);

  }
  protected void convertToChild(ModelRenderer parParent, ModelRenderer parChild)
  {
     // move child rotation point to be relative to parent
     parChild.rotationPointX -= parParent.rotationPointX;
     parChild.rotationPointY -= parParent.rotationPointY;
     parChild.rotationPointZ -= parParent.rotationPointZ;
     // make rotations relative to parent
     parChild.rotateAngleX -= parParent.rotateAngleX;
     parChild.rotateAngleY -= parParent.rotateAngleY;
     parChild.rotateAngleZ -= parParent.rotateAngleZ;
     // create relationship
     parParent.addChild(parChild);
  } 
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
	  super.render(entity, f, f1, f2, f3, f4, f5); setRotationAngles(f, f1, f2, f3, f4, f5, entity);

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
   

    
  }

}
