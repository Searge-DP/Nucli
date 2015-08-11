/*
 * ColorHelper.java
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

package com.robrit.nucli.common.util;

import java.awt.*;

public class ColorHelper {

  /**
   * Convert RGB color model to a hexidecimal (represented as an integer) format
   * @param red The red component (up to 255) of the color to convert
   * @param green The green component (up to 255) of the color to convert
   * @param blue The blue component (up to 255) of the color to convert
   * @return The integer representation of the hexidecimal conversion for the color
   */
  public static int toHexidecimal(byte red, byte green, byte blue) {
    int hex = 0;
    hex = hex | ((red) << 16);
    hex = hex | ((green) << 8);
    hex = hex | blue;

    return hex;
  }

  /**
   * Convert a {@link Color} object to a hexidecimal (represented as an integer) format
   * @param color The color object to convert
   * @return The integer representation of the hexidecimal conversion for the color
   */
  public static int toHexidecimal(Color color) {
    return toHexidecimal((byte) color.getRed(), (byte) color.getGreen(), (byte) color.getBlue());
  }

  /**
   * Convert RGB color model to a {@link Color} object
   * @param red The red component (up to 255) of the color to convert
   * @param green The green component (up to 255) of the color to convert
   * @param blue The blue component (up to 255) of the color to convert
   * @return The {@link Color} object for the color
   */
  public static Color toColor(byte red, byte green, byte blue) {
    return new Color(red, green, blue);
  }

  /**
   * Convert integer to a {@link Color} object
   * @param color The integer representation of a color
   * @return The {@link Color} object for the color
   */
  public static Color toColor(int color) {
    return new Color(color);
  }
}
