/*
 * LogHelper.java
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

import net.minecraftforge.fml.common.FMLLog;

import org.apache.logging.log4j.Level;

public class LogHelper {

  /**
   * 
   *  
   * @param logLevel
   * @param object
   */
  public static void log(final Level logLevel, final Object object) {
    FMLLog.log(ModInformation.MOD_NAME, logLevel, String.valueOf(object));
  }

  /**
   * 
   *
   * @param object
   */
  public static void all(final Object object) {
    log(Level.ALL, object);
  }

  /**
   *
   *
   * @param object
   */  
  public static void debug(final Object object) {
    log(Level.DEBUG, object);
  }

  /**
   *
   *
   * @param object
   */
  public static void error(final Object object) {
    log(Level.ERROR, object);
  }

  /**
   *
   *
   * @param object
   */
  public static void fatal(final Object object) {
    log(Level.FATAL, object);
  }

  /**
   *
   *
   * @param object
   */
  public static void info(final Object object) {
    log(Level.INFO, object);
  }

  /**
   *
   *
   * @param object
   */
  public static void off(final Object object) {
    log(Level.OFF, object);
  }

  /**
   *
   *
   * @param object
   */
  public static void trace(final Object object) {
    log(Level.TRACE, object);
  }

  /**
   *
   *
   * @param object
   */
  public static void warn(final Object object) {
    log(Level.WARN, object);
  }
}
