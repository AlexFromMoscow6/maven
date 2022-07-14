package ru.swit;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionAdapter;

public class MessageWindowTest
{
	   public MessageWindowTest()
	   {
		   Display display = new Display();
		   Shell   shell   = new Shell(display);
		   shell.setSize(new Point(240, 90));
		   shell.setText("SWT проект");
		   createGUI(shell);
		   shell.open();
		   while (!shell.isDisposed()) {
			   if (!display.readAndDispatch()) {
				   display.sleep();
			   }
		   }
		   display.dispose();
	   }
	    public void createGUI(final Shell shell)
	    {
		    shell.setLayout(new GridLayout(2, true));

		    Button mbox = new Button(shell, SWT.PUSH);
		    mbox.setText("MessageBox");
		    mbox.addSelectionListener(new SelectionAdapter() {
		    	public void widgetSelected(SelectionEvent event) {
		    		MessageWindow dialog = new MessageWindow(shell, "Диалоговое окно");
			        dialog.open();
		    	}
		    });
	    }
	   
	   public static void main(String[] args)
	   {
		   new MessageWindowTest();
	   }
}
