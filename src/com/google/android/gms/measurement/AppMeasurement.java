package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.measurement.internal.zzab;
import com.google.android.gms.measurement.internal.zzw;

public class AppMeasurement
{
  private final zzw zzaTV;
  
  public AppMeasurement(zzw paramzzw)
  {
    zzx.zzz(paramzzw);
    zzaTV = paramzzw;
  }
  
  public static AppMeasurement getInstance(Context paramContext)
  {
    return zzw.zzaT(paramContext).zzCV();
  }
  
  public void setMeasurementEnabled(boolean paramBoolean)
  {
    zzaTV.zzCf().setMeasurementEnabled(paramBoolean);
  }
  
  public void zzd(String paramString1, String paramString2, Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    zzaTV.zzCf().zze(paramString1, paramString2, localBundle);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.AppMeasurement
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */