/*
 * KeyBind.java
 *
 * Copyright (c) 2015 TheRoBrit
 *
 * Nucli is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Nucli is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.robrit.nucli.client.keybind;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import org.lwjgl.input.Keyboard;

import java.util.ArrayList;
import java.util.Collections;

@SideOnly(Side.CLIENT)
public class KeyBind {

  private int keyCode;

  ArrayList<KeyBindModifier> modifiers = new ArrayList<KeyBindModifier>();

  public KeyBind(int keyCode, KeyBindModifier... modifierArray) {
    this.keyCode = keyCode;

    Collections.addAll(modifiers, modifierArray);
  }

  public boolean isPressed() {
    boolean modifierAlt = hasModifier(KeyBindModifier.ALT) && isAltKeyDown();
    boolean modifierCtrl = hasModifier(KeyBindModifier.CTRL) && GuiScreen.isCtrlKeyDown();
    boolean modifierShift = hasModifier(KeyBindModifier.SHIFT) && GuiScreen.isShiftKeyDown();

    if (!modifierAlt || !modifierCtrl || !modifierShift) {
      return false;
    }

    return Keyboard.isKeyDown(keyCode);
  }

  public boolean hasModifier(KeyBindModifier modifier) {
    return modifiers.contains(modifier);
  }

  private static boolean isAltKeyDown() {
    return Keyboard.isKeyDown(18);
  }
}
