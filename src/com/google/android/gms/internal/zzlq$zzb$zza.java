package com.google.android.gms.internal;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.RemoteException;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Status;

public final class zzlq$zzb$zza
  extends zzlq.zza
{
  private final zzlr zzaeJ;
  
  public zzlq$zzb$zza(zzlq.zzb paramzzb, zzlr paramzzlr)
  {
    super(zzaeH, null);
    zzaeJ = paramzzlr;
  }
  
  private int zzj(int paramInt1, int paramInt2)
  {
    if (paramInt1 < paramInt2) {}
    for (;;)
    {
      return paramInt1 * 320 / 1080;
      paramInt1 = paramInt2;
    }
  }
  
  public final void onError(int paramInt)
  {
    zzlq.zzoC().zzb("onError: %d", new Object[] { Integer.valueOf(paramInt) });
    zzlq.zza(zzaeK.zzaeH);
    zzaeK.zza(new zzlq.zzc(Status.zzagE));
  }
  
  public final void zza(int paramInt1, int paramInt2, Surface paramSurface)
  {
    zzlq.zzoC().zzb("onConnected", new Object[0]);
    DisplayManager localDisplayManager = (DisplayManager)zzaeJ.getContext().getSystemService("display");
    if (localDisplayManager == null)
    {
      zzlq.zzoC().zzc("Unable to get the display manager", new Object[0]);
      zzaeK.zza(new zzlq.zzc(Status.zzagE));
      return;
    }
    zzlq.zza(zzaeK.zzaeH);
    int i = zzj(paramInt1, paramInt2);
    zzlq.zza(zzaeK.zzaeH, localDisplayManager.createVirtualDisplay("private_display", paramInt1, paramInt2, i, paramSurface, 2));
    if (zzlq.zzd(zzaeK.zzaeH) == null)
    {
      zzlq.zzoC().zzc("Unable to create virtual display", new Object[0]);
      zzaeK.zza(new zzlq.zzc(Status.zzagE));
      return;
    }
    if (zzlq.zzd(zzaeK.zzaeH).getDisplay() == null)
    {
      zzlq.zzoC().zzc("Virtual display does not have a display", new Object[0]);
      zzaeK.zza(new zzlq.zzc(Status.zzagE));
      return;
    }
    try
    {
      zzaeJ.zza(this, zzlq.zzd(zzaeK.zzaeH).getDisplay().getDisplayId());
      return;
    }
    catch (RemoteException paramSurface)
    {
      zzlq.zzoC().zzc("Unable to provision the route's new virtual Display", new Object[0]);
      zzaeK.zza(new zzlq.zzc(Status.zzagE));
      return;
    }
    catch (IllegalStateException paramSurface)
    {
      for (;;) {}
    }
  }
  
  public final void zzoD()
  {
    zzlq.zzoC().zzb("onConnectedWithDisplay", new Object[0]);
    Display localDisplay = zzlq.zzd(zzaeK.zzaeH).getDisplay();
    if (localDisplay != null)
    {
      zzaeK.zza(new zzlq.zzc(localDisplay));
      return;
    }
    zzlq.zzoC().zzc("Virtual display no longer has a display", new Object[0]);
    zzaeK.zza(new zzlq.zzc(Status.zzagE));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlq.zzb.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */