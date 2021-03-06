package org.cryptocoinpartners.bin.command;

import com.beust.jcommander.Parameters;
import org.cryptocoinpartners.module.Esper;


/**
 * @author Tim Olson
 */
@SuppressWarnings("UnusedDeclaration")
@Parameters(commandNames = {"save-data","ticker"}, commandDescription = "Launch a data gathering node")
public class SaveDataCommand extends Command {
    public void run() {
        Esper esper = new Esper();
        esper.loadModule("xchangedata");
        esper.loadModule("savedata");
    }
}
