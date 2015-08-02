package com.robrit.nucli.common.command;

import com.robrit.nucli.common.Nucli;

import java.util.HashMap;

public class CommandRegistry {

  private static HashMap<String, IModCommand> commands = new HashMap<String, IModCommand>();

  public static void addCommand(IModCommand command) {
    if (!commandExists(command)) {
      commands.put(command.getCommandName(), command);
    } else {
      Nucli.logger.debug(String.format("Command '%s' already exists", command.getCommandName()));
    }
  }

  public static void removeCommand(IModCommand command) {
    if (commandExists(command)) {
      commands.remove(command.getCommandName());
    } else {
      Nucli.logger.debug(String.format("Tried to remove command '%s', that command doesn't exist!",
                                       command.getCommandAliases()));
    }
  }

  public static boolean commandExists(IModCommand command) {
    return commands.containsKey(command.getCommandName());
  }
}
