package com.dp.chapter27.command;

public abstract class Command {
	
	Receiver mReceiver ;
	
	public Command(Receiver receiver) {
		this.mReceiver = receiver;
	}

	public abstract void execute() ;
}
