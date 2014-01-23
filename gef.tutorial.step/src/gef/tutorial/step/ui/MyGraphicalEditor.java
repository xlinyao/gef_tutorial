package gef.tutorial.step.ui;


import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.ui.parts.GraphicalEditor;


public class MyGraphicalEditor extends GraphicalEditor {

	public static final String ID = "gef.tutorial.step.editor";

	public MyGraphicalEditor() {
		setEditDomain(new DefaultEditDomain(this));
	}

	@Override
	protected void initializeGraphicalViewer() {
		
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		
	}

}
