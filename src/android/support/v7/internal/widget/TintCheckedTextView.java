package android.support.v7.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

public class TintCheckedTextView
  extends CheckedTextView
{
  private static final int[] TINT_ATTRS = { 16843016 };
  private final TintManager mTintManager;
  
  public TintCheckedTextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TintCheckedTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16843720);
  }
  
  public TintCheckedTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, TINT_ATTRS, paramInt, 0);
    setCheckMarkDrawable(paramContext.getDrawable(0));
    paramContext.recycle();
    mTintManager = paramContext.getTintManager();
  }
  
  public void setCheckMarkDrawable(int paramInt)
  {
    setCheckMarkDrawable(mTintManager.getDrawable(paramInt));
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.TintCheckedTextView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */