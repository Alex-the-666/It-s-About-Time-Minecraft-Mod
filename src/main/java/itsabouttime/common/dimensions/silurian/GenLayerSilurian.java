package itsabouttime.common.dimensions.silurian;

import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerVoronoiZoom;
import net.minecraft.world.gen.layer.GenLayerZoom;

public abstract class GenLayerSilurian extends GenLayer{

	public GenLayerSilurian(long seed) {
		super(seed);
	}
	public static GenLayer[] makeTheWorld(long seed) {

		GenLayer biomes = new GenLayerBiomesSilurian(1L);

		// more GenLayerZoom = bigger biomes
		biomes = new GenLayerZoom(1000L, biomes);
		biomes = new GenLayerZoom(1001L, biomes);
		biomes = new GenLayerZoom(1002L, biomes);
		biomes = new GenLayerZoom(1003L, biomes);
		biomes = new GenLayerZoom(1004L, biomes);
		biomes = new GenLayerZoom(1005L, biomes);
		GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, biomes);

		biomes.initWorldGenSeed(seed);
		genlayervoronoizoom.initWorldGenSeed(seed);

		return new GenLayer[] {biomes, genlayervoronoizoom};
		}
		

}
	


