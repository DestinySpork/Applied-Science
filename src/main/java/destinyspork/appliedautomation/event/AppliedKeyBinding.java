package destinyspork.appliedautomation.event;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;

public class AppliedKeyBinding {
	
	public static KeyBinding oreGen;
	
	 public static void init() {
	        oreGen = new KeyBinding("key.oreGen", Keyboard.KEY_V, "key.categories.AppliedAutomation");
	 }
}
