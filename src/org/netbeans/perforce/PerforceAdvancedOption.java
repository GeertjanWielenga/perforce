package org.netbeans.perforce;

import org.netbeans.spi.options.AdvancedOption;
import org.netbeans.spi.options.OptionsPanelController;
import org.openide.util.NbBundle;

public final class PerforceAdvancedOption extends AdvancedOption {
    
    @Override
    public String getDisplayName() {
        return NbBundle.getMessage(PerforceAdvancedOption.class, "AdvancedOption_DisplayName_Perforce"); // NOI18N
    }
    
    @Override
    public String getTooltip() {
        return NbBundle.getMessage(PerforceAdvancedOption.class, "AdvancedOption_Tooltip_Perforce"); // NOI18N
    }
    
    @Override
    public OptionsPanelController create() {
        return new PerforceOptionsPanelController();
    }
    
}
