/*
 * KeyBindRegistry.java
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

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashMap;

@SideOnly(Side.CLIENT)
public class KeyBindRegistry {

  private static HashMap<String, KeyBind> keyBinds = new HashMap<String, KeyBind>();

  public static void addKeyBind(String name, KeyBind keyBind) {
    if (!isRegistered(keyBind)) {
      keyBinds.put(name, keyBind);
    }
  }

  public static void removeKeyBind(String name, KeyBind keyBind) {
    if (isRegistered(keyBind)) {
      keyBinds.remove(name);
    }
  }

  public static boolean isRegistered(String name) {
    return keyBinds.containsKey(name);
  }

  public static boolean isRegistered(KeyBind keyBind) {
    return keyBinds.containsValue(keyBind);
  }
}
