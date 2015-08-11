/*
 * DateTimeHelper.java
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

import java.util.Date;
import java.util.TimeZone;

public class DateTimeHelper {

  private static final InheritableThreadLocal currentTimezone = new InheritableThreadLocal();

  public static long convertToTimestamp(Date date) {
    return date.getTime();
  }

  public static Date convertFromTimestamp(long timestamp) {
    return new Date(timestamp);
  }

  /**
   * Checks whether the specified date is between the lower and upper boundaries
   *
   * @param checkedDate The date you are checking is within the lower and upper boundaries
   * @param minDate     The minimum (lower boundary) date to compare the <code>checkedDate</code>
   *                    against
   * @param maxDate     The maximum (upper boundary) date to compare the <code>checkedDate</code>
   *                    against
   */
  public static boolean dateBetweenBoundaries(Date checkedDate, Date minDate, Date maxDate) {

    return checkedDate.after(minDate) && checkedDate.before(maxDate);
  }

  /**
   * Checks whether the specified (EPOCH/UNIX) timestamp is between the lower and upper boundaries
   *
   * @param checkedTimestamp The timestamp you are checking is within the lower and upper
   *                         boundaries
   * @param minTimestamp     The minimum (lower boundary) timestamp to compare the
   *                         <code>checkedTimestamp</code> against
   * @param maxTimestamp     The maximum (upper boundary) timestamp to compare the
   *                         <code>checkedTimestamp</code> against
   */
  public static boolean dateBetweenBoundaries(long checkedTimestamp,
                                              long minTimestamp, long maxTimestamp) {

    return dateBetweenBoundaries(convertFromTimestamp(checkedTimestamp),
                                 convertFromTimestamp(minTimestamp),
                                 convertFromTimestamp(maxTimestamp));
  }

  /**
   * Gets the current timezone of the computer (i.e. GMT, PST, etc.)
   *
   * @return The current timezone or if there is none specified the default timezone
   */
  public static TimeZone getCurrentTimezone() {
    final TimeZone timezone = (TimeZone) currentTimezone.get();

    return timezone != null ? timezone : TimeZone.getDefault();
  }
}
