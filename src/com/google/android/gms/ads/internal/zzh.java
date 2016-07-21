package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.internal.zzaj;
import com.google.android.gms.internal.zzam;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zziq;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

class zzh
  implements zzaj, Runnable
{
  private final List zzpH = new Vector();
  private final AtomicReference zzpI = new AtomicReference();
  CountDownLatch zzpJ = new CountDownLatch(1);
  private zzs zzpj;
  
  public zzh(zzs paramzzs)
  {
    zzpj = paramzzs;
    if (zzn.zzcS().zzhJ())
    {
      zziq.zza(this);
      return;
    }
    run();
  }
  
  private void zzbk()
  {
    if (zzpH.isEmpty()) {
      return;
    }
    Iterator localIterator = zzpH.iterator();
    while (localIterator.hasNext())
    {
      Object[] arrayOfObject = (Object[])localIterator.next();
      if (arrayOfObject.length == 1) {
        ((zzaj)zzpI.get()).zza((MotionEvent)arrayOfObject[0]);
      } else if (arrayOfObject.length == 3) {
        ((zzaj)zzpI.get()).zza(((Integer)arrayOfObject[0]).intValue(), ((Integer)arrayOfObject[1]).intValue(), ((Integer)arrayOfObject[2]).intValue());
      }
    }
    zzpH.clear();
  }
  
  private Context zzq(Context paramContext)
  {
    if (!((Boolean)zzbt.zzvM.get()).booleanValue()) {}
    Context localContext;
    do
    {
      return paramContext;
      localContext = paramContext.getApplicationContext();
    } while (localContext == null);
    return localContext;
  }
  
  public void run()
  {
    label94:
    for (;;)
    {
      try
      {
        if (((Boolean)zzbt.zzvY.get()).booleanValue()) {
          if (zzpj.zzrl.zzNb)
          {
            break label94;
            zza(zzb(zzpj.zzrl.afmaVersion, zzq(zzpj.context), bool));
          }
          else
          {
            bool = false;
            continue;
          }
        }
        boolean bool = true;
      }
      finally
      {
        zzpJ.countDown();
        zzpj = null;
      }
    }
  }
  
  public void zza(int paramInt1, int paramInt2, int paramInt3)
  {
    zzaj localzzaj = (zzaj)zzpI.get();
    if (localzzaj != null)
    {
      zzbk();
      localzzaj.zza(paramInt1, paramInt2, paramInt3);
      return;
    }
    zzpH.add(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  public void zza(MotionEvent paramMotionEvent)
  {
    zzaj localzzaj = (zzaj)zzpI.get();
    if (localzzaj != null)
    {
      zzbk();
      localzzaj.zza(paramMotionEvent);
      return;
    }
    zzpH.add(new Object[] { paramMotionEvent });
  }
  
  protected void zza(zzaj paramzzaj)
  {
    zzpI.set(paramzzaj);
  }
  
  protected zzaj zzb(String paramString, Context paramContext, boolean paramBoolean)
  {
    return zzam.zza(paramString, paramContext, paramBoolean);
  }
  
  public String zzb(Context paramContext)
  {
    if (zzbj())
    {
      zzaj localzzaj = (zzaj)zzpI.get();
      if (localzzaj != null)
      {
        zzbk();
        return localzzaj.zzb(zzq(paramContext));
      }
    }
    return "";
  }
  
  public String zzb(Context paramContext, String paramString)
  {
    if (zzbj())
    {
      zzaj localzzaj = (zzaj)zzpI.get();
      if (localzzaj != null)
      {
        zzbk();
        return localzzaj.zzb(zzq(paramContext), paramString);
      }
    }
    return "";
  }
  
  protected boolean zzbj()
  {
    try
    {
      zzpJ.await();
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      zzin.zzd("Interrupted during GADSignals creation.", localInterruptedException);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */