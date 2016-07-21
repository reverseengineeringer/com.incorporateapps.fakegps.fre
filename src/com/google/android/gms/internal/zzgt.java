package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

public class zzgt
  extends zzgs
{
  private Object zzGv = new Object();
  private PopupWindow zzGw;
  private boolean zzGx = false;
  
  zzgt(Context paramContext, zzif.zza paramzza, zzjp paramzzjp, zzgr.zza paramzza1)
  {
    super(paramContext, paramzza, paramzzjp, paramzza1);
  }
  
  private void zzgj()
  {
    synchronized (zzGv)
    {
      zzGx = true;
      if (((mContext instanceof Activity)) && (((Activity)mContext).isDestroyed())) {
        zzGw = null;
      }
      if (zzGw != null)
      {
        if (zzGw.isShowing()) {
          zzGw.dismiss();
        }
        zzGw = null;
      }
      return;
    }
  }
  
  public void cancel()
  {
    zzgj();
    super.cancel();
  }
  
  protected void zzC(int paramInt)
  {
    zzgj();
    super.zzC(paramInt);
  }
  
  protected void zzgi()
  {
    if ((mContext instanceof Activity)) {}
    Object localObject2;
    for (Window localWindow = ((Activity)mContext).getWindow();; localObject2 = null)
    {
      if ((localWindow == null) || (localWindow.getDecorView() == null)) {}
      while (((Activity)mContext).isDestroyed()) {
        return;
      }
      FrameLayout localFrameLayout = new FrameLayout(mContext);
      localFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
      localFrameLayout.addView(zzpD.getView(), -1, -1);
      synchronized (zzGv)
      {
        if (zzGx) {
          return;
        }
      }
      zzGw = new PopupWindow(localFrameLayout, 1, 1, false);
      zzGw.setOutsideTouchable(true);
      zzGw.setClippingEnabled(false);
      zzin.zzaI("Displaying the 1x1 popup off the screen.");
      try
      {
        zzGw.showAtLocation(((Window)localObject1).getDecorView(), 0, -1, -1);
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          zzGw = null;
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */