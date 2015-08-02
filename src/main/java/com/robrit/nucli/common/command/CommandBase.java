package com.robrit.nucli.common.command;

import net.minecraft.command.ICommandSender;

public abstract class CommandBase implements IModCommand {

  private static final String COMMAND_HELP_TEMPLATE = "/%s help";

  @Override
  public String getCommandUsage(ICommandSender sender) {
    return String.format(COMMAND_HELP_TEMPLATE, getCommandName());
  }

  @Override
  public int compareTo(Object object) {
    final IModCommand modCommand = (IModCommand) object;

    return getCommandName().compareTo(modCommand.getCommandName());
  }
}
