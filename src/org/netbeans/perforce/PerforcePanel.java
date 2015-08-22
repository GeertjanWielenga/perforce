package org.netbeans.perforce;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.netbeans.spi.options.OptionsPanelController;
import org.openide.util.NbBundle;

@OptionsPanelController.Keywords(keywords={
    "perforce", 
    "#GitOptionsPanel.kw1", 
    "#GitOptionsPanel.kw2", 
    "#GitOptionsPanel.kw3", 
    "#GitOptionsPanel.kw4"},
        location="Team", tabTitle="#CTL_OptionsPanel.title")
@NbBundle.Messages({
    "CTL_OptionsPanel.title=Versioning",
    "GitOptionsPanel.kw1=versioning",
    "GitOptionsPanel.kw2=exclude new files from commit",
    "GitOptionsPanel.kw3=signed-off-by line",
    "GitOptionsPanel.kw4=non-sharable folders"
})public class PerforcePanel extends JPanel {
    
    private final PerforceOptionsPanelController popc;

    PerforcePanel(PerforceOptionsPanelController popc) {
        this.popc = popc;
        setLayout(new BorderLayout());
        JLabel helloMessage = new JLabel("hello perforce!");
        add(helloMessage, BorderLayout.NORTH);
    }

    boolean valid() {
        return true;
    }

    void store() {
    }

    void load() {
    }
    
}
