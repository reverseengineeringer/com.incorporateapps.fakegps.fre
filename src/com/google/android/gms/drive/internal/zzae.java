package com.google.android.gms.drive.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.zzf;
import java.util.ArrayList;
import java.util.List;

public class zzae
  extends zzao.zza
{
  private final int zzanf;
  private final zzf zzarC;
  private final zzae.zza zzarD;
  private final List zzarE = new ArrayList();
  
  public zzae(Looper paramLooper, Context paramContext, int paramInt, zzf paramzzf)
  {
    zzanf = paramInt;
    zzarC = paramzzf;
    zzarD = new zzae.zza(paramLooper, paramContext, null);
  }
  
  public void zzc(OnEventResponse paramOnEventResponse)
  {
    paramOnEventResponse = paramOnEventResponse.zzts();
    if (zzanf == paramOnEventResponse.getType()) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzab(bool);
      zzx.zzab(zzarE.contains(Integer.valueOf(paramOnEventResponse.getType())));
      zzarD.zza(zzarC, paramOnEventResponse);
      return;
    }
  }
  
  public void zzdg(int paramInt)
  {
    zzarE.add(Integer.valueOf(paramInt));
  }
  
  public boolean zzdh(int paramInt)
  {
    return zzarE.contains(Integer.valueOf(paramInt));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.zzae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */