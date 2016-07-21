package com.google.android.gms.cast;

import android.app.Presentation;
import android.content.Context;
import android.view.Display;
import android.view.Window;

public abstract class CastPresentation
  extends Presentation
{
  public CastPresentation(Context paramContext, Display paramDisplay)
  {
    super(paramContext, paramDisplay);
    zznA();
  }
  
  public CastPresentation(Context paramContext, Display paramDisplay, int paramInt)
  {
    super(paramContext, paramDisplay, paramInt);
    zznA();
  }
  
  private void zznA()
  {
    Window localWindow = getWindow();
    if (localWindow != null)
    {
      localWindow.setType(2030);
      localWindow.addFlags(268435456);
      localWindow.addFlags(16777216);
      localWindow.addFlags(1024);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.CastPresentation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */