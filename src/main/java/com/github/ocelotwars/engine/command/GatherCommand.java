package com.github.ocelotwars.engine.command;

import com.github.ocelotwars.engine.Command;
import com.github.ocelotwars.engine.Player;
import com.github.ocelotwars.engine.Playground;
import com.github.ocelotwars.engine.Unit;

public class GatherCommand implements Command {

    private Player player;
	private int unitId;

	public GatherCommand(Player player, int unitId) {
		this.player = player;
        this.unitId = unitId;
	}

	@Override
	public void execute(Playground playground) {
		Unit unit = playground.getUnit(player, unitId);
		unit.gather();
	}

}
