package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ListPopupWindow;
import android.widget.Spinner;
import java.lang.reflect.Field;

public class TintSpinner
  extends Spinner
{
  private static final int[] TINT_ATTRS = { 16842964, 16843126 };
  
  public TintSpinner(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TintSpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842881);
  }
  
  public TintSpinner(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, TINT_ATTRS, paramInt, 0);
    setBackgroundDrawable(paramContext.getDrawable(0));
    if (paramContext.hasValue(1))
    {
      paramAttributeSet = paramContext.getDrawable(1);
      if (Build.VERSION.SDK_INT < 16) {
        break label59;
      }
      setPopupBackgroundDrawable(paramAttributeSet);
    }
    for (;;)
    {
      paramContext.recycle();
      return;
      label59:
      if (Build.VERSION.SDK_INT >= 11) {
        setPopupBackgroundDrawableV11(this, paramAttributeSet);
      }
    }
  }
  
  private static void setPopupBackgroundDrawableV11(Spinner paramSpinner, Drawable paramDrawable)
  {
    try
    {
      Field localField = Spinner.class.getDeclaredField("mPopup");
      localField.setAccessible(true);
      paramSpinner = localField.get(paramSpinner);
      if ((paramSpinner instanceof ListPopupWindow)) {
        ((ListPopupWindow)paramSpinner).setBackgroundDrawable(paramDrawable);
      }
      return;
    }
    catch (NoSuchFieldException paramSpinner)
    {
      paramSpinner.printStackTrace();
      return;
    }
    catch (IllegalAccessException paramSpinner)
    {
      paramSpinner.printStackTrace();
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.TintSpinner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */