package android.support.v7.widget;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.appcompat.R.attr;
import android.support.v7.internal.widget.TintImageView;

class ActionMenuPresenter$OverflowMenuButton
  extends TintImageView
  implements ActionMenuView.ActionMenuChildView
{
  private final float[] mTempPts = new float[2];
  
  public ActionMenuPresenter$OverflowMenuButton(ActionMenuPresenter paramActionMenuPresenter, Context paramContext)
  {
    super(paramContext, null, R.attr.actionOverflowButtonStyle);
    setClickable(true);
    setFocusable(true);
    setVisibility(0);
    setEnabled(true);
    setOnTouchListener(new ActionMenuPresenter.OverflowMenuButton.1(this, this, paramActionMenuPresenter));
  }
  
  public boolean needsDividerAfter()
  {
    return false;
  }
  
  public boolean needsDividerBefore()
  {
    return false;
  }
  
  public boolean performClick()
  {
    if (super.performClick()) {
      return true;
    }
    playSoundEffect(0);
    this$0.showOverflowMenu();
    return true;
  }
  
  protected boolean setFrame(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = super.setFrame(paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable localDrawable1 = getDrawable();
    Drawable localDrawable2 = getBackground();
    if ((localDrawable1 != null) && (localDrawable2 != null))
    {
      float[] arrayOfFloat = mTempPts;
      arrayOfFloat[0] = localDrawable1.getBounds().centerX();
      getImageMatrix().mapPoints(arrayOfFloat);
      paramInt1 = (int)arrayOfFloat[0] - getWidth() / 2;
      DrawableCompat.setHotspotBounds(localDrawable2, paramInt1, 0, getWidth() + paramInt1, getHeight());
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.widget.ActionMenuPresenter.OverflowMenuButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */