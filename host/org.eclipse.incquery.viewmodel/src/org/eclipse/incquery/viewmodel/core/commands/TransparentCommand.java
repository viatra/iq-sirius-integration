package org.eclipse.incquery.viewmodel.core.commands;

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.ConditionalRedoCommand;

/**
 * TransparentCommand for Sirius integration...
 * TODO TEST!!!!
 */
public abstract class TransparentCommand extends AbstractCommand
		implements ConditionalRedoCommand {

	private TransactionalCommandStack commandStack;

	private Command undoCommand;

	private Command redoCommand;

	public TransparentCommand(TransactionalEditingDomain domain) {
		this.commandStack = (TransactionalCommandStack) domain
				.getCommandStack();
	}

	@Override
	public boolean canUndo() {
		if (undoCommand == null) {
			return false;
		}

		return undoCommand.canUndo();
	}

	@Override
	public boolean canRedo() {
		redoCommand = commandStack.getRedoCommand();

		if (redoCommand == null) {
			return false;
		}

		if (redoCommand instanceof ConditionalRedoCommand) {
			return ((ConditionalRedoCommand) redoCommand).canRedo();
		}

		return true;
	}

	@Override
	public void execute() {
		/*
		 * This method is called before this command is placed on the stack.
		 * Because of this, we can obtain the last command on the stack with the
		 * getUndoCommand() method call. The undoCommand will be null if this is the
		 * first command on the stack.
		 */
		undoCommand = commandStack.getUndoCommand();
		
		doExecute();
	}

	@Override
	public void redo() {
		if (canRedo()) {
			commandStack.redo();
		}
	}

	@Override
	public void undo() {
		if (canUndo()) {
			super.undo();
			
			commandStack.undo();
		}
	}
	
	protected abstract void doExecute();

}