package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RadioButton;

public class TintRadioButton
  extends RadioButton
{
  private static final int[] TINT_ATTRS = { 16843015 };
  private final TintManager mTintManager;
  
  public TintRadioButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TintRadioButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842878);
  }
  
  public TintRadioButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, TINT_ATTRS, paramInt, 0);
    setButtonDrawable(paramContext.getDrawable(0));
    paramContext.recycle();
    mTintManager = paramContext.getTintManager();
  }
  
  public void setButtonDrawable(int paramInt)
  {
    setButtonDrawable(mTintManager.getDrawable(paramInt));
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.TintRadioButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */