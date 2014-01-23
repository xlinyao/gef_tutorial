package gef.tutorial.step.actions;

import gef.tutorial.step.Application;
import gef.tutorial.step.ui.MyEditorInput;
import gef.tutorial.step.ui.MyGraphicalEditor;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class MyGraphicalAction extends Action implements ISelectionListener,IWorkbenchAction{
	
	public final static String ID ="gef.step.diagram";
	
	
	@SuppressWarnings("unused")
	private IStructuredSelection selection;
	
	private IWorkbenchWindow window;
	
	public MyGraphicalAction(IWorkbenchWindow window) {
		super();
		this.window = window;
		setId(ID);
		setText("&Diagram");
		setToolTipText("Draw the GEF diagram");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(Application.PLUGIN_ID, "icons/ico_folder_add.gif"));
		
	}

	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		IEditorInput input = new MyEditorInput("MyEditor");
		IWorkbenchPage page = window.getActivePage();
		try {
			page.openEditor(input, MyGraphicalEditor.ID,true);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
}
