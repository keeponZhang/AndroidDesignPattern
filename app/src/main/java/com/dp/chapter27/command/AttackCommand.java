package com.dp.chapter27.command;

public class AttackCommand extends Command {
	
	public AttackCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		mReceiver.executeCommand() ;
	}
}
