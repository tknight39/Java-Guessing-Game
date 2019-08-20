package com.company;

public class Pc
{
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;

	public Pc(Case theCase, Monitor monitor, Motherboard motherboard)
	{
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	public void powerUp()
	{
		theCase.pressPowerButton();
		drawLogo();
	}

	private void drawLogo()
	{
		// Fancy Graphics
		monitor.drawPixelAt(1200,50,"Green");
	}

	private Case getTheCase()
	{
		return theCase;
	}

	private Monitor getMonitor()
	{
		return monitor;
	}

	private Motherboard getMotherboard()
	{
		return motherboard;
	}
}
