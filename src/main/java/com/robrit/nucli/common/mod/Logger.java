/*
 * Logger.java
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

package com.robrit.nucli.common.mod;

import net.minecraftforge.fml.common.FMLLog;

import org.apache.logging.log4j.Level;

public class Logger {

  private String modName;

  public Logger(String modName) {
    this.modName = modName;
  }

  public void log(final Level logLevel, final Object object) {
    FMLLog.log(modName, logLevel, String.valueOf(object));
  }

  public void all(final Object object) {
    log(Level.ALL, object);
  }

  public void debug(final Object object) {
    log(Level.DEBUG, object);
  }

  public void error(final Object object) {
    log(Level.ERROR, object);
  }

  public void fatal(final Object object) {
    log(Level.FATAL, object);
  }

  public void info(final Object object) {
    log(Level.INFO, object);
  }

  public void off(final Object object) {
    log(Level.OFF, object);
  }

  public void trace(final Object object) {
    log(Level.TRACE, object);
  }

  public void warn(final Object object) {
    log(Level.WARN, object);
  }
}
