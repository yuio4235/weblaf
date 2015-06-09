package com.alee.laf.splitpane;

import com.alee.extended.painter.AdaptivePainter;
import com.alee.extended.painter.Painter;

import javax.swing.*;

/**
 * Simple SplitPanePainter adapter class.
 * It is used to install simple non-specific painters into WebSplitPaneUI.
 *
 * @author Alexandr Zernov
 */

public class AdaptiveSplitPanePainter<E extends JSplitPane, U extends WebSplitPaneUI> extends AdaptivePainter<E, U>
        implements SplitPanePainter<E, U>
{
    /**
     * Constructs new AdaptiveSplitPanePainter for the specified painter.
     *
     * @param painter painter to adapt
     */
    public AdaptiveSplitPanePainter ( final Painter painter )
    {
        super ( painter );
    }
}