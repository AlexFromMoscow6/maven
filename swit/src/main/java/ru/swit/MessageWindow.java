package ru.swit;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import org.eclipse.jface.dialogs.Dialog;
// import org.eclipse.jface.dialogs.IDialogConstants;

public class MessageWindow extends Dialog 
{
	private  Button  btnClose   = null;
	private  Button  btnOk      = null;
	private  String  title      = null; 

	public MessageWindow(Shell parent)
	{
		super(parent);
	}
	public MessageWindow(Shell parent, final String title)
	{
		this(parent);
		this.title = title;
	}
	@Override
	protected Control createDialogArea(final Composite parent)
	{
		Composite desk = (Composite) super.createDialogArea(parent);
		desk.setLayout(new FormLayout());

		Color color = new Color(parent.getDisplay(), 238, 238, 238);
		desk.setBackground(color);
	    return desk;
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	/*
	 *  Standard method to configure the shell.
	 */
	@Override
	protected void configureShell(final Shell newShell)
	{
		super.configureShell(newShell);
		newShell.setText(title);
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	/*
	 * Create contents of the button bar, including a button to copy the 
	 * display to the system clipboard and a close button.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(final Composite parent)
	{
		parent.setBackground(new Color(parent.getDisplay(), 238, 238, 238));
		parent.setLayout(new FormLayout());
		FormData btnCloseFD = new FormData(90, 24);
		btnCloseFD.left     = new FormAttachment(100, -110);
		btnCloseFD.bottom   = new FormAttachment(100, -10);

//		btnClose = new PButton(parent, Common.TEXT_cancel, 90, 24, this);
		btnClose = new Button(parent, SWT.NONE);
		btnClose.setText("Закрыть");
		btnClose.setLayoutData(btnCloseFD);
		btnClose.setSize    (90, 24);

		FormData btnOkFD = new FormData(90, 24);
		btnOkFD.left     = new FormAttachment(100, -205);
		btnOkFD.bottom   = new FormAttachment(100, -10);

//		btnOk = new PButton(parent, Common.TEXT_ok, 90, 24, this);
		btnOk = new Button(parent, SWT.NONE);
		btnOk.setText("OK");
		btnOk.setLayoutData(btnOkFD);
		btnOk.setSize    (90, 24);
	}
	/*
	 * Set the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize()
	{
		return new Point(380, 220);
	}
}
