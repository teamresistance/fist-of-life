package org.teamresistance.frc.command;

import org.strongback.command.Command;
import org.teamresistance.frc.subsystem.snorfler.Snorfler;

/**
 * @author Tarik Brown .
 */
public class SnorfleStopCommand extends Command {
  public final Snorfler snorfler;

  public SnorfleStopCommand(Snorfler snorfler) {
    this.snorfler = snorfler;
  }

  @Override
  public boolean execute() {
    snorfler.startSnorfling();
    return false;
  }

}
