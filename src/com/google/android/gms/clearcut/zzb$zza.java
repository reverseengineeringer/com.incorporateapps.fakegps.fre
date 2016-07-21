package com.google.android.gms.clearcut;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzsz.zzd;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.ArrayList;

public class zzb$zza
{
  private String zzaeS = zzb.zzb(zzafg);
  private int zzaeT = zzb.zza(zzafg);
  private String zzaeU = zzb.zzc(zzafg);
  private String zzaeV = zzb.zzd(zzafg);
  private int zzaeX = zzb.zze(zzafg);
  private final zzb.zzb zzafb;
  private zzb.zzb zzafc;
  private ArrayList zzafd = null;
  private final zzsz.zzd zzafe = new zzsz.zzd();
  private boolean zzaff = false;
  
  private zzb$zza(zzb paramzzb, byte[] paramArrayOfByte)
  {
    this(paramzzb, paramArrayOfByte, null);
  }
  
  private zzb$zza(zzb paramzzb, byte[] paramArrayOfByte, zzb.zzb paramzzb1)
  {
    zzaeU = zzb.zzc(paramzzb);
    zzaeV = zzb.zzd(paramzzb);
    zzafe.zzbuR = zzb.zzf(paramzzb).currentTimeMillis();
    zzafe.zzbuS = zzb.zzf(paramzzb).elapsedRealtime();
    zzafe.zzbvi = zzb.zzh(paramzzb).zzah(zzb.zzg(paramzzb));
    zzafe.zzbvd = zzb.zzi(paramzzb).zzC(zzafe.zzbuR);
    if (paramArrayOfByte != null) {
      zzafe.zzbuY = paramArrayOfByte;
    }
    zzafb = paramzzb1;
  }
  
  public zza zzbq(int paramInt)
  {
    zzafe.zzbuU = paramInt;
    return this;
  }
  
  public zza zzbr(int paramInt)
  {
    zzafe.zzob = paramInt;
    return this;
  }
  
  public PendingResult zzd(GoogleApiClient paramGoogleApiClient)
  {
    if (zzaff) {
      throw new IllegalStateException("do not reuse LogEventBuilder");
    }
    zzaff = true;
    return zzb.zzm(zzafg).zza(paramGoogleApiClient, zzoE());
  }
  
  public LogEventParcelable zzoE()
  {
    return new LogEventParcelable(new PlayLoggerContext(zzb.zzk(zzafg), zzb.zzl(zzafg), zzaeT, zzaeS, zzaeU, zzaeV, zzb.zzj(zzafg), zzaeX), zzafe, zzafb, zzafc, zzb.zzc(zzafd));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.clearcut.zzb.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */