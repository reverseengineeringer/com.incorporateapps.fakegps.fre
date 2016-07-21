package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzk;
import com.google.android.gms.analytics.internal.zzn;
import com.google.android.gms.analytics.internal.zzu;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzke;
import com.google.android.gms.measurement.zzc;
import com.google.android.gms.measurement.zzi;
import java.util.List;
import java.util.ListIterator;

public class zza
  extends com.google.android.gms.measurement.zzf
{
  private final com.google.android.gms.analytics.internal.zzf zzOK;
  private boolean zzOL;
  
  public zza(com.google.android.gms.analytics.internal.zzf paramzzf)
  {
    super(paramzzf.zzjo(), paramzzf.zzjl());
    zzOK = paramzzf;
  }
  
  public void enableAdvertisingIdCollection(boolean paramBoolean)
  {
    zzOL = paramBoolean;
  }
  
  protected void zza(zzc paramzzc)
  {
    paramzzc = (zzke)paramzzc.zzf(zzke.class);
    if (TextUtils.isEmpty(paramzzc.getClientId())) {
      paramzzc.setClientId(zzOK.zzjC().zzkk());
    }
    if ((zzOL) && (TextUtils.isEmpty(paramzzc.zziT())))
    {
      com.google.android.gms.analytics.internal.zza localzza = zzOK.zzjB();
      paramzzc.zzaY(localzza.zziY());
      paramzzc.zzH(localzza.zziU());
    }
  }
  
  public void zzaS(String paramString)
  {
    zzx.zzcM(paramString);
    zzaT(paramString);
    zzAG().add(new zzb(zzOK, paramString));
  }
  
  public void zzaT(String paramString)
  {
    paramString = zzb.zzaU(paramString);
    ListIterator localListIterator = zzAG().listIterator();
    while (localListIterator.hasNext()) {
      if (paramString.equals(((zzi)localListIterator.next()).zziA())) {
        localListIterator.remove();
      }
    }
  }
  
  com.google.android.gms.analytics.internal.zzf zzix()
  {
    return zzOK;
  }
  
  public zzc zziy()
  {
    zzc localzzc = zzAF().zzAu();
    localzzc.zzb(zzOK.zzjt().zzjS());
    localzzc.zzb(zzOK.zzju().zzkZ());
    zzd(localzzc);
    return localzzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.analytics.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */