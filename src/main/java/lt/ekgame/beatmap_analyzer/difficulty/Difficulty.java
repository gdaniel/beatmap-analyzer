package lt.ekgame.beatmap_analyzer.difficulty;

import lt.ekgame.beatmap_analyzer.beatmap.Beatmap;
import lt.ekgame.beatmap_analyzer.performance.Performance;
import lt.ekgame.beatmap_analyzer.performance.scores.Score;
import lt.ekgame.beatmap_analyzer.utils.Mod;
import lt.ekgame.beatmap_analyzer.utils.Mods;

public abstract class Difficulty<B extends Beatmap, S extends Score> {
	
	protected B beatmap;
	protected Mods mods;
	protected double starDiff;
	
	public Difficulty(B beatmap, Mods mods, double starDiff) {
		this.beatmap = beatmap;
		this.mods = mods;
		this.starDiff = starDiff;
	}
	
	public abstract Performance getPerformance(S score);
	
	public double getSpeedMultiplier() {
		return mods.getSpeedMultiplier();
	}
	
	public double getOD() {
		return beatmap.getDifficultySettings().getOD();
	}
	
	public B getBeatmap() {
		return beatmap;
	}
	
	public Mods getMods() {
		return mods;
	}

	public double getStars() {
		return starDiff;
	}

	public int getMaxCombo() {
		return beatmap.getMaxCombo();
	}
	
	public int getObjectCount() {
		return beatmap.getObjectCount();
	}
	
	public boolean hasMod(Mod mod) {
		return mods.has(mod);
	}
}
