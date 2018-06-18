package edu.iis.powp.command.complex;

import edu.iis.powp.command.IPlotterCommand;

public interface ICompundCommand {

	/**
	 * Change sequence of commands
	 * 
	 * @param index
	 *            index of first command to swap
	 * @param indexToSwap
	 *            index of second command to swap
	 */
	public void changeSequence(int index, int indexToSwap);

	/**
	 * Remove command from list
	 * 
	 * @param index
	 *            index of command to remove
	 */
	public void removeCommand(int index);

	/**
	 * Changing command
	 * 
	 * @param index
	 *            index to command to change
	 * @param command
	 *            Command to swap
	 */
	public void changeCommand(int index, IPlotterCommand command);
}
